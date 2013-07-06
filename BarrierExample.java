import java.util.concurrent.CyclicBarrier;

public class BarrierExample {

  public static void main(String args[]){
    int numThreads = 10;

    final CyclicBarrier b = new CyclicBarrier(numThreads);

    for(int i=0; i<numThreads; i++) {
      new Thread(new Worker(b)).start();
    }
  }

}
