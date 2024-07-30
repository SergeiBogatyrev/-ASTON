import java.lang.reflect.Array;
import java.time.Year;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "Тестировщик", "vasya@mail.ru", 89110001414l, 50000,35);
        empArray[1] = new Employee("Петров Петр Петрович", "Разработчик", "petya@mail.ru", 89110044874l, 80000,20);
        empArray[2] = new Employee("Сидоров Сергей Васильевич", "Менеджер по персоналу", "sidor@mail.ru", 89511005514l, 50000,21);
        empArray[3] = new Employee("Безрукова Наталья Николаевна", "Бухгалтер", "nata@mail.ru", 89105486754l, 300000,27);
        empArray[4] = new Employee("Васильченко Светлана Игоревна", "Аналитик", "sveta@mail.ru", 89504568212l, 200000,23);
        for (int i = 0; i < empArray.length; i++){
            empArray[i].getInfo();
        }

        }
}


