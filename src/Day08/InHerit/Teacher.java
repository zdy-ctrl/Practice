package Day08.InHerit;
/**
 * 声明子类：Teacher类，继承Person类
 * 新增属性：salary薪资
 * 属性私有化，get/set
 * 包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000
 * @author 18124
 */
public class Teacher extends Person {
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo() {
        return "姓名" + name + "年龄：" + age + "性别：" + sex + "薪资：" + salary;
    }
}
