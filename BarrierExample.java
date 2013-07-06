public class BarrierExample {

  public static void main(String args[]){
    int numThreads = 10;

    final Barrier b = new Barrier(numThreads);

    for(int i=0; i<numThreads; i++) {
      new Thread(new Worker(b)).start();
    }
  }

}
