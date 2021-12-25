package Day06.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    //构造器
    public MyDate() {

    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        System.out.println("日期" + year + "年" + month + "月" + day + "日");
    }

    public boolean isLeapYear() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
