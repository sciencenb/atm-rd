package javareview;

import java.rmi.StubNotFoundException;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Kwan");
        Student s2 = new Student(2,"Kate");
        s1.setFinalScore(43.33);
        s1.setMidtermScore(48.85);
        Student s3 = s1;

        System.out.println(s1.getId()+": "+s1.getName()+", Score Total -> "+s1.getTotalScore());
        System.out.println(s2.getId()+": "+s2.getName()+" "+s2.getTotalScore());
        System.out.println(s3.getId()+": "+s3.getName()+" "+s3.getTotalScore());
        System.out.println(s1);
//        System.out.println(s1.id+". "+s1.name+" "+s1.getTotalScore());
//        System.out.println(s2.id+". "+s2.name+" "+s2.getTotalScore());
//
//        System.out.println(s1.id+". "+s1.name+" "+s1.getTotalScore());
//        System.out.println(s3.id+". "+s3.name+" "+s3.getTotalScore());
    }
}
