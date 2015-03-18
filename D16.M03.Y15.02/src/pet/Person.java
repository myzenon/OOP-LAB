package pet;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Person {
    public void hit(Animal animal) {
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Person person = new Person();
        System.out.println("The first calling hit(Animal)");
        person.hit(dog);
        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        person.hit(dog);
        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        person.hit(dog);
    }
}
