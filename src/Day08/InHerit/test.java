package Day08.InHerit;

public class test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setSex("男");
        person.setAge(20);
        System.out.println(person.getInfo());
        Student student = new Student();
        student.setScore(99.5);
        student.setName("张三");
        student.setSex("男");
        student.setAge(20);
        System.out.println(student.getInfo());

    }
}
