package org.example;

// Перечисление для учёной степени
enum Degree {
    CANDIDATE_OF_SCIENCES("Candidate of Sciences"),
    DOCTOR_OF_SCIENCES("Doctor of Sciences"),
    PHD("PhD"),
    MSC("MSc"); // Добавлено согласно входным данным

    private final String title;

    Degree(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}