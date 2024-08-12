public class Cat extends Animal {
    private static int countCat;
    private static int catDish;
    private boolean satiety;

    public void setCatDish(int catDish) {
        this.catDish = catDish;

    }

    public int getCatDish() {
        return catDish;
    }

    void getSatiety() {
        if (satiety == true) {
            System.out.println("Кот сыт");
        } else {
            System.out.println("Кот голоден");
        }
    }

    public void eat() {
        if (catDish >= 10) {
            satiety = true;
            this.catDish = catDish - 10;
        } else {
            System.out.println("Не хватило еды");
        }
    }

    Cat() {
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    void run(int distance) {
        super.run(distance);

        if (distance < 0) {
            System.out.println("Введите положительное число");
        } else if (distance > 200) {
            System.out.println("Кот не может пробежать больше 200 метров");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }

    }

    @Override
    void swim(int distance) {
        super.swim(distance);
        System.out.println("Коты не умеют плавать");
    }
}
