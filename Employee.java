import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String nameSurnamePatronymic;
    private String post;
    private String email;
    private long phoneNumber;
    private float salary;
    private int age;

    public Employee(String nameSurnamePatronymic, String post, String email, long phoneNumber, float salary, int age){
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public Employee(){
        this.nameSurnamePatronymic = "ФИО";
        this.post = "Должность";
        this.email = "Почта";
        this.phoneNumber = 0;
        this.salary = 0f;
        this.age = 0;
    }

    public void getInfo(){
        System.out.println("ФИО: " + nameSurnamePatronymic);
        System.out.println("Должность: " + post);
        System.out.println("Почта: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + age);
        System.out.println();


    }

}
