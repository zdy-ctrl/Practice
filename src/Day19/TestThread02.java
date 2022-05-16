package Day19;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/14 22:11
 * @Abstract： 实现多线程同步下载图片
 */
public class TestThread02 extends Thread{
    private String url;
    private String name;

    public TestThread02(String url, String name) {
        this.url = url;
        this.name = name;
    }
    //下载
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThread02 t1 = new TestThread02("https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2021%2F0825%2F88024c15j00qydtre000pc000hs00a0g.jpg&thumbnail=660x2147483647&quality=80&type=jpg","库里1.jpg");
        TestThread02 t2 = new TestThread02("https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2021%2F0825%2F88024c15j00qydtre000pc000hs00a0g.jpg&thumbnail=660x2147483647&quality=80&type=jpg","库里2.jpg");
        TestThread02 t3 = new TestThread02("https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2021%2F0825%2F88024c15j00qydtre000pc000hs00a0g.jpg&thumbnail=660x2147483647&quality=80&type=jpg", "库里3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}
//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
