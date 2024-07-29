import java.time.Year;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        printThreeWords();
        // Задание 2
        checkSumSign();
        // Задание 3
        printColor();
        // Задание 4
        compareNumbers();
        // Задание 5
        checkSum(100,10);
        // Задание 6
        positiveOrNegativeNumber (100);
        // Задание 7
        checkNumber (0);
        // Задание 8
        returnWords("Привет", 1);
        // Задание 9
        checkYear();
        // Задание 10
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a = 0; a < arr.length; a++){
            if (arr[a] == 0){
                arr[a] = arr[a] + 1;
            }
            else {
                arr[a] = arr[a] -1;
            }
        }
        // Задание 11
        int [] arr1 = new int [100];
        for (int a = 0; a<arr1.length; a++){
            arr1[a] = a + 1;
        }

        // Задание 12
        int [] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arr2.length; a++){
            if (arr2 [a] < 6){
                arr2 [a] = arr2 [a] * 2;
            }
        }
        // Задание 13
        int [][] doubleArray = new int [10][10];
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++){
                if (j==i | j+i==9){
                    doubleArray [j][i] = 1;
                }
            }
        }
        // Задание 14
        createArray(5, 10);
    }

        // Задание 1
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        // Задание 2
        public static void checkSumSign(){
        int a = 5;
        int b = -110;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
        }
        // Задание 3
        public static void printColor(){
        int value = 500;
        if (value<=0){
            System.out.println("Красный");
        }
        else if (value>0 && value<=100){
            System.out.println("Желтый");
        }
        else if(value>100){
            System.out.println("Зеленый");
        }
        }
        //Задание 4
        public static void compareNumbers(){
        int a = 5;
        int b = 10;
        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
        }
        // Задание 5
        public static boolean checkSum (int a, int b){
        boolean x = a+b>10 && a+b<=20;
        return x;
        }
        // Задание 6
        public static void positiveOrNegativeNumber(int a){
        if (a>=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
        }
        // Задание 7
        public static boolean checkNumber (int a){
        boolean x = a>=0;
            return x;
        }
        // Задание 8
        public static void returnWords(String word, int i){
        for (; i>0; i--){
                System.out.println(word);
        }
        }
        // Задание 9
        public static boolean checkYear (){
        int currentYear = Year.now().getValue();
        boolean x = currentYear%4==0 & currentYear%100 !=0 | currentYear%400==0;
        return x;
        }
        // Задание 14
        public static int[] createArray(int len, int initialValue){
        int [] arr3 = new int[len];
        for (int i = 0; i< arr3.length; i++){
            arr3[i] = initialValue;
        }
        return arr3;
        }
}


