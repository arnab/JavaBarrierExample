public class Worker implements Runnable {

    private Barrier barrier;
    public Worker(Barrier barrier) {
        this.barrier = barrier;
    }

    public void log(String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }

    public void run() {
        log("running");
        log("this should happen before reaching the barrier");

        barrier.await();
        log("this should happen after the barrier");
    }

}
