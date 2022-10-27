package school;

public class Student { // zawiera kilka obiektów Grades oraz pole name
    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    public void addMathGrade(int grade) { // metody pozwalające dodać oceny z zakresu 1-6 do poszczególnych przedmiotów
        if (grade > 0 && grade < 7) {
            this.maths.add(grade);
        }
    }

    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }

    public void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
        }
        public void addHistoryGrade(int grade) {
            if (grade > 0 && grade < 7) {
                this.history.add(grade);
            }
    }

    public double getMathsAverage() { //metody na średnią ocen
        return this.maths.getAverage();
    }

    public double getPhysicsAverage() {
        return this.physics.getAverage();
    }

    public double getGeographyAverage() {
        return this.geography.getAverage();
    }

    public double getHistoryAverage() {
        return this.history.getAverage(); }

    public double getAverage() {
        double sum = this.geography.getAverage() + this.history.getAverage() + this.maths.getAverage() + this.physics.getAverage();
        return sum/4;
    }

}


