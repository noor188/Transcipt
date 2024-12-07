package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args) {
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ade Lovelace", 8853);
        //TODO: create another Transcript object
        Transcript t3 = new Transcript("Noor Mamlook", 800729323);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        //TODO: add grades to the other Transcript objects
        t2.addGrade("CPSC-210", 3.0);
        t2.addGrade("ENGL-201", 3.5);
        t2.addGrade("CPSC-110", 4.0);

        t3.addGrade("CPSC-210", 4.0);
        t3.addGrade("ENGL-201", 3.2);
        t3.addGrade("CPSC-110", 3.6);


        // 1
        System.out.print(t1.getStudnetName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());

        //TODO: add more use cases here
        // 2
        System.out.println(t2.getStudnetName() + ", " + t2.getCourseAndGrade("ENGL-201"));
        System.out.println(t3.getStudnetName() + ", " + t3.getCourseAndGrade("CPSC-110"));

    }
}
