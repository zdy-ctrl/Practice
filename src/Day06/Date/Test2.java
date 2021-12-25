package Day06.Date;

import Day06.Date.MyDate;

public class Test2 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2021, 11, 15);
        myDate.showDate();
        boolean flag = myDate.isLeapYear();
        System.out.println(myDate.getYear() + (flag ? "是闰年" : "不是闰年"));
    }
}
