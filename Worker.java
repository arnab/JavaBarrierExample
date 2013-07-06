import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class Worker implements Runnable {

    private CyclicBarrier barrier;
    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void log(String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }

    public void run() {
        try {
            log("running");
            log("this should happen before reaching the barrier");

            barrier.await();
            log("this should happen after the barrier");
        } catch (InterruptedException ex) {
            log("damn I hate interrupts! Committing suicide: " + ex);
        } catch (BrokenBarrierException ex) {
            log("damn, the dam burst: " + ex);
        }
    }

}
