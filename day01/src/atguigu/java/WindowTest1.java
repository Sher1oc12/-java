package atguigu.java;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 * 例子:创建三个窗口卖票，总票数为100张.使用继承Runnable接口的方式
 *
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 *
 * 说明: 1.操作共享数据的代码，即为需要被同步的代码
 *      2.共享数据:多个线程共同操作的变量。比如: ticket就是共享数据。
 *      3.同步监视器，俗称:锁。任何一个类的对象，都可以充当锁。
 *      要求:多个线程必须要共用同-把锁。
 *
 * 方式二:同步方法。
 * 如果操作共享数据的代码完整的声明在-一个方法中，我们不妨将此方法声明同步的。
 *
 *
 * 同步的方式，解决了线程的安全问题。---好处
 * 操作同步代码时，只能有一 一个线程参与，其他线程等待。相当于是一一个单线程的过程，效率低。---局限性
 */
class Window1 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//此时的this:唯一的Window1的对象
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t1.setName("窗口2");
        t1.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
