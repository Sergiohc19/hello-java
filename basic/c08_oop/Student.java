package basic.c08_oop;

public class Student {
    int Score;


    public Student(int Score) {
        this.Score = Score;

    }

    public void result() {
        if (Score >= 60) {
            System.out.println("Aprobó el examen");
        } else {
            System.out.println("Suspendió el examen");
        }
    }


}
