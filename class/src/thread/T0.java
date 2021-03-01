package thread;
//线程的两种常见写法（其中还有Callable线程写法，这里就不介绍了）
public class T0 {

    public static class MyThread extends Thread{
        @Override
        public void run(){

        }
    }

    public static void main(String args[]){
        //匿名Runnable接口的写法
        //注意了，线程只能一次。
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        //继承Thread类的写法
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
