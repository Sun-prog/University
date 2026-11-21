package org.example;

// Базовый абстрактный класс Персона
 abstract class Person {
    private final String name;
    private final Gender gender;
    private final String department;

    public Person(String name, Gender gender, String department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    protected abstract String getVerb();

    public void print() {
        System.out.printf("This is %s. %s %s at %s.%n",
                name, gender.getSubjectPronoun(), getVerb(), department);
    }

    // Статический метод для печати массива персон
    public static void printAll(Person[] people) {
        for (Person person : people) {
            person.print();
            System.out.println(); // Пустая строка для разделения записей
        }
    }
}
