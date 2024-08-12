public class Dog extends Animal {
    private static int countDog;

    Dog() {
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    void run(int distance) {
        super.run(distance);

        if (distance < 0) {
            System.out.println("Введите положительное число");
        } else if (distance > 500) {
            System.out.println("Собака не может пробежать больше 500 метров");
        } else {
            System.out.println("Собака пробежала " + distance + " метров");
        }

    }

    @Override
    void swim(int distance) {
        super.swim(distance);
        if (distance < 0) {
            System.out.println("Введите положительное число");
        } else if (distance > 10) {
            System.out.println("Собака не может проплыть больше 10 метров");
        } else {
            System.out.println("Собака проплыла " + distance + " метров");
        }

    }
}
