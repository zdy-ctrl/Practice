package Day07;
/**
 * **1、描述： 猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了所有桃子的一半，还不过瘾，又多吃了一个。
 * 第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
 * 以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。
 * 试求第一天共摘了多少桃子？
 * @author 18124
 */
public class monkey {
    public static void main(String[] args) {
        int x=1534;
        for (int i = 0; i < 10; i++) {
            x=x/2-1;
        }
        System.out.println(x);
    }
}
class  monkey1{
    private int age;
    private String sex;

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
}

