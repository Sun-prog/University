package org.example;

// Перечисление для пола
enum Gender {
    MALE("He", "His"),
    FEMALE("She", "Her");

    private final String subjectPronoun;
    private final String possessivePronoun;

    Gender(String subjectPronoun, String possessivePronoun) {
        this.subjectPronoun = subjectPronoun;
        this.possessivePronoun = possessivePronoun;
    }

    public String getSubjectPronoun() {
        return subjectPronoun;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }
}
