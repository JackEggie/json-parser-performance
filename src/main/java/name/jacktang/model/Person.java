package name.jacktang.model;

/**
 * @author tangzhaowei
 */
public class Person {

    private String name;
    /**
     * m | f | M | F
     */
    private char sex;
    private int age;
    private String job;

    public Person(String name, char sex, int age, String job) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
