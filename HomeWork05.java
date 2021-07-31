package HomeWork05;

public class HomeWork05 {

    public static class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void print() {
            System.out.println("Работник: " + name + "; Должность: " + position + "; email: " + email + "; Телефон: " + phone + "; Заработная плата: " + salary + "; Возраст: " + age);
        }

    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Инженер", "ii@mailbox.com", "+792312312", 55000, 42);
        persArray[1] = new Person("Сидоров Степан", "Технический директор", "ss@mailbox.com", "+79991234567", 70000, 38);
        persArray[2] = new Person("Кузнецова Светлана", "Маркетолог", "ks@mailbox.com", "+79991346987", 40000, 32);
        persArray[3] = new Person("Петрова Ольга", "Финансовый директор", "po@mailbox.com", "+79999875126", 70000, 48);
        persArray[4] = new Person("Макаров Семен", "Экономист", "ms@mailbox.com", "+79996487211", 40000, 34);
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
   
    }

}