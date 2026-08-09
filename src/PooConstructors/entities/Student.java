package PooConstructors.entities;

public class Student {
    public String name;
    public double notice1;
    public double notice2;
    public double notice3;

    public double finalGrade() {
        return notice1 + notice2 + notice3;
    }

    public double missingPoints() {
        if(finalGrade() < 60){
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
