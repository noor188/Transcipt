package model;

public class Transcript {

    public Transcript(String studentName, int studentId){

    }

    //MODIFIES: this
    //EFFECTS : adds a course to the list of course
    public void addCourse(String course){

    }

    //EFFECTS: prints course names with grades earned
    //         (studnet academic record)
    public void printTranscript(){

    }

    //REQUIRES: grade should be between (0.0-4.0)
    //          and/or course should not be null
    //MODIFIES: this
    //EFFECTS : assigns a grade for a course
    public void addGrade(String course, double grade){

    }

    //MODIFIES: this
    //EFFECTS: sets the student name
    public void setStudentName(String studentName){

    }

    //MODIFIES: this
    //EFFECTS: sets the studnet Id
    public void setStudentId(int studentId){

    }

    //EFFECTS : Returns course name and grade in format
    //          CourseName: Grade
    public String getCourseAndGrade(String course){
        return null;
    }

    //EFFECTS : calculates the average of course
    public double getGPA(){
        return 0.0;
    }

    //EFFECTS: Returns student name in format
    //         StudentName
    public String getStudnetName(){
        return "";
    }


}
