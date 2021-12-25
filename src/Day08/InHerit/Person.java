package Day08.InHerit;
/*        1、 声明父类：Person类
        包含属性：姓名，年龄，性别
        属性私有化，get/set
        包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男*/
public class Person {
    String name;
    int age;
    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInfo() {
        return "姓名:" + name + " 年龄：" + age + " 性别：" + sex;
    }
}
