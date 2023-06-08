package multithreading;
import java.lang.Thread;
public class RunableImplementation implements Runnable {

        public static int id=0;
        int threadid;
        public RunableImplementation(){
            threadid=id;
            id++;
        }

        public void run(){
            for(int i = 0 ; i < 5; i++){
                System.out.println("Thread(id:"+id+") "+ i );
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }


