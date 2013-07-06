public class Worker implements Runnable {

    public void log(String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }

    public void run(){
        log("running");
        log("this should happen before reaching the barrier");

        // TODO: insert barrier here
        log("this should happen after the barrier");
    }

}
