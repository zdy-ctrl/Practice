package Day08.Constructor;
//构造器练习
/*      声明一个员工类，
        * 包含属性：编号、姓名、薪资、性别，要求属性私有化，提供get/set，
        * 提供无参构造器和有参构造器
        * 提供getInfo()
        （2）在测试类的main中分别用无参构造和有参构造创建员工类对象，调用getInfo
 */
public class test {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setNum(1234);
        staff.setName("张三");
        staff.setMoney(20000.5);
        staff.setSex("男");
        staff.getInfo();
        Staff staff1 = new Staff(12345, "李四", 20000.3, "女");
        staff1.getInfo();
    }
}

