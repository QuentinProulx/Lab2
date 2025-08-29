/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6324569
 */
public class CourseGrades {
    private GradedActivity grades[];
    private final int NUM_GRADES;
    
    public CourseGrades() {
        NUM_GRADES = 4;
        grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < grades.length; i++) {
            
        }
        
        return "";
    }
}
