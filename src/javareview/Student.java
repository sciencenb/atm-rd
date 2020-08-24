package javareview;

public class Student {
    private int id;
    private String name;
    private double midtermScore, finalScore;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getTotalScore() {
        return midtermScore + finalScore;
    }

    public int getId(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String toString() {
        return id + "-> " + name;
    }
}