package Day19;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/14 21:51
 * @Abstract： 创建线程方法1：通过继承Thread类，重写run（）方法，调用start开启线程
 */
public class TestThread01 {
    public static void main(String[] args) {
        ThreadsTest01 threadsTest01 = new ThreadsTest01();
        threadsTest01.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("多线程运行中");
        }
    }
}
class ThreadsTest01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程！");
        }
    }
}

