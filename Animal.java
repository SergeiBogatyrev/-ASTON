public class Animal {
    private static int countAnimal;


    Animal() {
        countAnimal++;
    }

    void run(int distance) {
    }

    void swim(int distance) {
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

}
