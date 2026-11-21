package org.example;

// Класс Преподаватель
class Teacher extends Person {
    private final Degree degree;
    private final String specialty;

    public Teacher(String name, Gender gender, String department, Degree degree, String specialty) {
        super(name, gender, department);
        this.degree = degree;
        this.specialty = specialty;
    }

    @Override
    protected String getVerb() {
        return "teaches";
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%s has %s degree in %s.%n",
                getGender().getSubjectPronoun(), degree, specialty);
    }
}

