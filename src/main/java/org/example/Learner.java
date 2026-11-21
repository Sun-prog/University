package org.example;
// Базовый класс для всех обучающихся (объединяет студентов и аспирантов)
abstract class Learner extends Person {
    public Learner(String name, Gender gender, String department) {
        super(name, gender, department);
    }

    @Override
    protected String getVerb() {
        return "studies";
    }
}