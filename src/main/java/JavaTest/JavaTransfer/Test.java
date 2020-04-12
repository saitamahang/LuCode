package JavaTest.JavaTransfer;

/**
 * 关于Java到底是值传递，还是引用传递的实例说明
 */
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("张三");
        Person person2 = new Person("李四");

        reSetValue(person1);
        reSetValue(person2);

        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

    public static void reSetValue(Person person){
        person.setName("王五");
    }

}
class Person {
    Person (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String age;
}
