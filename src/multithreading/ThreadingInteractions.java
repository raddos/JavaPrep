package multithreading;

public class ThreadingInteractions {


    //using functions and thread specific arguments
    public static void main(String[] args) {
        ExtendedThreadClass eth = new ExtendedThreadClass();
        ExtendedThreadClass eth2 = new ExtendedThreadClass();
        ExtendedThreadClass eth3 = new ExtendedThreadClass();

        RunableImplementation rth = new RunableImplementation();
        RunableImplementation rth2 = new RunableImplementation();
        RunableImplementation rth3 = new RunableImplementation();

        Thread th = new Thread(rth);
        eth.start();
        th.start();

    }
}
