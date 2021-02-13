package pl.sda.javalondek4.java_demo.list_vs_array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class GenericFirstTaste {

    public static void whoIsThis(Animal whoIsThis) {
        //

    }
    public static void main(String[] args) {
        //
        // type covariance
        Dog[] dogs = null;
        Animal[] animalArray = dogs;
        Object[] objectArray = dogs;
        Object object = dogs;
        //
        // Object -> Animal -> Dog/Cat/?
        List<Animal> onlyAnimals = new LinkedList<Animal>(); // till java 7
        List<Dog> onlyDogs = new LinkedList<>();
        onlyDogs.add(new Dog());
        List<Cat> onlyCats = new LinkedList<>();
//        onlyAnimals = onlyDogs;
        List<? extends Animal> allAnimals = onlyCats;
        var anyVarAnimal = allAnimals.get(0); // ? extends Animal
        Animal anyAnimal = allAnimals.get(0); // Animal vs ? extends Animal
        Cat cat = anyAnimal instanceof Cat ? (Cat)anyAnimal : null;
//        allAnimals.add(? extends Animal); // cannot add unknown type object
        Animal whoIsThis = new Dog();



        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        showAnimals(animals);

        List<Animal> immutableAnimalList = List.of(new Animal(), new Dog(), new Cat());
        List<Animal> animalList = new ArrayList<>(immutableAnimalList);

        List<Cat> immutableCatList = List.of(new Cat(), new Cat());
        List<Cat> catList = new ArrayList<>(immutableCatList);
        List<Dog> immutableDogList = List.of(new Dog());
        List<Dog> dogList = new ArrayList<>(immutableDogList);


        showAnimals(animalList);
        showAnimals(catList);
        showAnimals(dogList);

        showAnimalsJava4(animalList);
        showAnimalsJava4(catList);
        showAnimalsJava4(dogList);
        Cat isThisReallyCat = catList.get(0);

//        showOnlyAnimals(animalList);
//        showOnlyAnimals(catList);
//        showOnlyAnimals(dogList);

        // TODO: fix me:)
//        showTabAnimalsStreamVersion(animalList.toArray(new Animal[0]));
//        showTabAnimalsStreamVersion(catList.toArray(new Cat[0]));
//        showTabAnimalsStreamVersion(dogList.toArray(new Dog[0]));
    }

    public static void showAnimals(List<? extends Animal> animals) {
        System.out.println(animals);
        Animal animal = animals.get(0); // :) tbc...
//        animals.add(0, new Animal());
//        animals.add(0, new Dog());
//        animals.add(0, new Cat());

    }

    public static void showOnlyAnimals(List<Animal> animals) {
        System.out.println(animals);
        var animal = animals.get(0);
        animals.add(0, new Animal());
        animals.add(0, new Dog());
        animals.add(0, new Cat());
    }

    public static void showAnimalsJava4(List animals) {
        System.out.println("method showAnimalsJava4");
        System.out.println(animals);
        var animal = animals.get(0);
        animals.add(0, new Animal(){
            @Override
            void saySomething() {
                System.out.println("I'm gorilla:)");
            }
        });
    }

    public static void showTabAnimalsStreamVersion(Animal[] animals) {
//        List<Animal> animalList = List.of(animals);
//        animalList.stream()
        System.out.println("method: showTabAnimalsStreamVersion()");
        Stream.of(animals)
            .forEach((animal) -> {
                if (animal != null) {
                    animal.saySomething();
                } else {
                    System.out.println("reference is null!!!");
                }
            });
    }
}
