package Day02;
/*案例：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？*/
public class Test6 {
    public static void main(String[] args) {
        int hours = 89;
        int day = hours / 24;
        int hours_1 = hours-day*24;
        System.out.println("抗洪战士一共作战了"+day+"天"+hours_1+"小时");
    }
}
