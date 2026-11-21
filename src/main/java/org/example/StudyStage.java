package org.example;

// Перечисление для ступени обучения
enum StudyStage {
    BACHELOR("bachelor"),
    MASTER("master");

    private final String title;

    StudyStage(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}