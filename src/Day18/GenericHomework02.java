package Day18;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/5/9 2:29
 * @Abstract：
    1、声明一个Person类，包含姓名和伴侣属性，其中姓名是String类型，而伴侣的类型不确定，
    因为伴侣可以是Person，可以是Animal（例如：金刚），可以是Ghost鬼（例如：倩女幽魂），
    可以是Demon妖（例如：白娘子），可以是Robot机器人（例如：剪刀手爱德华）。。。
    2、在测试类中，创建Person对象，并为它指定伴侣，打印显示信息
 */
public class GenericHomework02 {
    public static void main(String[] args) {
        Person<Animal> person = new Person<>("李刚", new Animal("金刚"));
        System.out.println(person);
    }
}

class Person<T> {
    private String name;
    private T partner;

    public Person(String name, T partner) {
        this.name = name;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPartner() {
        return partner;
    }

    public void setPartner(T partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", partner=" + partner +
                '}';
    }


}
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
