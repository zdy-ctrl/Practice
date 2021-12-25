package Day08.Constructor;
/*
*  声明一个员工类，
 * 包含属性：编号、姓名、薪资、性别，要求属性私有化，提供get/set，
 * 提供无参构造器和有参构造器
 * 提供getInfo()
* */
public class Staff {
    private int num;//员工编号
    private String name;//员工姓名
    private double money;//员工工资
    private String sex;//员工性别

    //无参构造器
    public Staff() {
    }

    //有参构造器
    public Staff(int num, String name, double money, String sex) {
        this.num = num;
        this.name = name;
        this.money = money;
        this.sex = sex;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void getInfo() {
        System.out.println("姓名："+name+"  "+"工号："+num+"  "+"薪资："+money+"  "+"性别："+sex);
    }
}
