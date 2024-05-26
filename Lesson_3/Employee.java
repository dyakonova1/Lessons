package Lesson_3;

public class Employee {
        public String name;
        public String position;
        public String email;
        public String phone;
        public int salary;
        public int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
    public void printEmployeeInfo(){
            System.out.println("ФИО: " + name);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
        }
    }
