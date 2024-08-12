import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat barsik = new Cat();
        Dog bobik = new Dog();
        Cat b2 = new Cat();
        barsik.run(150);
        b2.swim(10);
        bobik.run(550);
        bobik.swim(8);
        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());


        Cat[] cats = new Cat[4];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        cats[0].setCatDish(30);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat();
            cats[i].getSatiety();
            System.out.println(cats[0].getCatDish());
        }





    }

}




