package org.example;

// Класс Студент (бакалавры и магистры)
class Student extends Learner {
    private final StudyStage stage;
    private final int course; // или String, если строго нужны римские цифры

    public Student(String name, Gender gender, String department, StudyStage stage, int course) {
        super(name, gender, department);
        this.stage = stage;
        this.course = course;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%s is %d'th year %s student.%n",
                getGender().getSubjectPronoun(), course, stage);
    }
}
