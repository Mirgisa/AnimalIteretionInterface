

//d.Testing the System:
//
//Create instances of both Dog and Cat, interact with them by feeding and playing with them.
//Display their interaction histories using showInteractionHistory.
//
//Bonus: Add a method void sleep(int hours) to SimpleAnimal where it stores the sleep interaction as "Slept for X hours".


import java.util.ArrayList;
import java.util.List;

//a. Create an Interface AnimalInteraction with the following methods:
//void feed(String food);
//void play();
//void showInteractionHistory();
interface AnimalInteraction {
    void feed(String food);
    void play();
    void showInteractionHistory();
}
//b.Create an Abstract Class SimpleAnimal that implements AnimalInteraction:
//Implement the feed method. It should ask for the food provided and store the feeding interaction in a list.
//Implement the play method. When called, it should store "play interaction" in the interaction history.
//Implement the showInteractionHistory method to display all interactions with the animal (both feedings and play sessions).
//Store interaction history using an appropriate data structure, like an ArrayList<String>.
abstract class SimpleAnimal implements AnimalInteraction{
    //protected String food;
    protected String name;
    protected List<String> interactionHistory;
    public SimpleAnimal(String name){
        this.name= name;
        interactionHistory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with: " + food);
        System.out.println("Feeding animal with: " + food);
    }

    @Override
    public void play() {
        interactionHistory.add("Interacting with other animals");
        System.out.println(name+" is Playing with the animal.");
    }

    @Override
    public String toString() {
        return "SimpleAnimal{" +
                "name='" + name + '\'' +
                ", interactionHistory=" + interactionHistory +
                '}';
    }

    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction History:");
        for (String interaction : interactionHistory) {
            System.out.println("- " + interaction);
        }

    }

}
//c.Create Concrete Classes:
//Extend SimpleAnimal into two classes, such as Dog and Cat, with additional unique behaviors:
//In the Dog class, add a method bark() that prints "The dog is barking!".
//In the Cat class, add a method meow() that prints "The cat is meowing!".
//
class Dog extends SimpleAnimal {
    public Dog(String name) {
        super(name);
        // super(food);
    }

    public void bark() {
        System.out.println("The dog is barking!");
    }
}

class Cat extends SimpleAnimal {
    public Cat(String name){
        super(name);
        // super(food);
    }
    public void meow() {
        System.out.println("The cat is meowing!");
    }
}
//d.Testing the System:
//
//Create instances of both Dog and Cat, interact with them by feeding and playing with them.
//Display their interaction histories using showInteractionHistory.
//
//Bonus: Add a method void sleep(int hours) to SimpleAnimal where it stores the sleep interaction as "Slept for X hours".
public class MainAnimalIteration{
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        dog.play();
        dog.bark();
        dog.showInteractionHistory();
        dog.feed("Meat");

        cat.play();
        cat.meow();
        cat.showInteractionHistory();
        cat.feed("Milk");
    }
}
