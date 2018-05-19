package model;

public class Person {
    private int id;
    private String name;
    private int age;
    private int QQ;
    public Person(String name,int age,int QQ){
        this.age = age;
        this.QQ = QQ;
        this.name = name;
    }

    public Person(int id, String name, int age, int QQ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.QQ = QQ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", QQ=" + QQ +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getQQ() {
        return QQ;
    }

    public void setQQ(int QQ) {
        this.QQ = QQ;
    }
}
