/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Cat();
        animal01.eat();
        Animal animal02 = new Dog();
        animal02.eat();
        Animal[] animals = {animal01, animal02};
        for (Animal animal : animals) {
            animal.eat();
        }
        Cat cat01 = new Cat();
       show(cat01);
        Animal animal = gain();
    }

    public static void show(Animal animal) {
        if(animal instanceof Cat){
            ((Cat) animal).climb();
        }
    }
    public static Animal gain(){
        return new Dog();
    }
}