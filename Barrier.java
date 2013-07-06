import java.util.Set;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class Barrier {
  private final int numThreads;
  private Set<Long> waitingThreadIds;

  public Barrier(int numThreads) {
    this.numThreads = numThreads;
    this.waitingThreadIds = Collections.newSetFromMap(
      new ConcurrentHashMap<Long, Boolean>()
    );

  }

  public void await() {
    Thread t = Thread.currentThread();
    waitingThreadIds.add(t.getId());
    while(waitingThreadIds.size() < numThreads) {
      t.yield();
    }
  }
}