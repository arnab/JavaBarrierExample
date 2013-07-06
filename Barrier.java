public class Barrier {
  private final int numThreads;
  private int waitingThreads;

  public Barrier(int numThreads) {
    this.numThreads = numThreads;
    this.waitingThreads = 0;
  }

  public void await() {
    // TODO: can't just rely on the count, keep a list of threads waiting.
    // Since the same thread may call await() more than once.
    waitingThreads++;
    while(waitingThreads < numThreads) {
      Thread.currentThread().yield();
    }
  }
}