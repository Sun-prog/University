package org.example;

public class UniversityDemo {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Teacher("Ronald Turner", Gender.MALE, "Computer science", Degree.PHD, "Programming paradigms"),
                new Teacher("Ruth Hollings", Gender.FEMALE, "Jurisprudence", Degree.MSC, "Domestic arbitration"),
                new Student("Leo Wilkinson", Gender.MALE, "Computer science", StudyStage.BACHELOR, 3),
                new Student("Anna Cunningham", Gender.FEMALE, "World economy", StudyStage.BACHELOR, 1),
                new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", StudyStage.MASTER, 1),
                new Postgraduate("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language.")
        };

        Person.printAll(people);
    }
}