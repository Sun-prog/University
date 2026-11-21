package org.example;

// Класс Аспирант
class Postgraduate extends Learner {
    private final String thesisTitle;

    public Postgraduate(String name, Gender gender, String department, String thesisTitle) {
        super(name, gender, department);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%s thesis title is \"%s\"%n",
                getGender().getPossessivePronoun(), thesisTitle);
    }
}