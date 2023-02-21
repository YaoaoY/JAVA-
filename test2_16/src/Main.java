import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(new Book("红楼梦", 100, "曹雪芹"));
//        list.add(new Book("西游记", 10, "吴承恩"));
//        list.add(new Book("三国演义", 80, "罗贯中"));
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = 0; j < list.size() - i - 1; j++) {
//                Book book1 = (Book) list.get(j);
//                Book book2 = (Book) list.get(j + 1);
//                if (book1.price > book2.price) {
//                    list.set(j, book2);
//                    list.set(j + 1, book1);
//                }
//            }
//        }
//        for (Object book :
//                list) {
//            System.out.println(book);
//        }
//        list.add(null);
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        HashSet
        HashSet hashSet = new HashSet();
        Person person = new Person("yaoyao",18 );
        Person person1 = new Person("yaoyao", 12);
        Person person2 = new Person("yaoyao", 18);
        Person person3 = new Person("yy", 35);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person);
        hashSet.add(person3);

        for (Object obj:
             hashSet) {
            System.out.println(obj.toString());
        }
        ArrayList
    }


}

class Person {
    String name;

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

    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Book {
    String name;
    int price;
    String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}