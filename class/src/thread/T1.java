package thread;
//线程的状态形式
public class T1 {

    private static class MyThread extends Thread{

        public MyThread(String name){
            super.setName(name);
        }

        @Override
        public void run(){
            System.out.println(super.getName()+" "+this.getState());//Runnable状态
            try {
                sleep(100);
                System.out.println(super.getName()+" "+this.getState());//Runnable状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        MyThread thread1=new MyThread("thread1");// 创建状态
        System.out.println(thread1.getName()+" "+thread1.getState());
        thread1.start();
        Thread.sleep(50);//thread1 slepp 100millis
        System.out.println(thread1.getName()+" "+thread1.getState());
        Thread.sleep(100);//等待线程完成
        System.out.println(thread1.getName()+" "+thread1.getState());
    }
}
