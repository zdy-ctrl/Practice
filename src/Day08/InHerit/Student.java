package Day08.InHerit;
/**
 * 声明子类：Student类，继承Person类
 * 新增属性：score成绩
 * 属性私有化，get/set
 * 包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89
 * @author 18124
 */
public class Student extends Person {
    double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getInfo() {
        return "姓名" + name + " 年龄：" + age + " 性别：" + sex + " 成绩：" + score;
    }
}
