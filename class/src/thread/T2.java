package thread;

import javafx.concurrent.Task;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

//线程锁的前引
public class T2 {
    static int count = 0;

    public /*synchronized*/ static void plusCount() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run(){
            plusCount();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        for(int i=0;i<10;i++){
            new MyThread().start();
        }
        Thread.sleep(3000);
        System.out.println(count);
    }
}
