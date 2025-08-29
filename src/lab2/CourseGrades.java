/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6324569
 */
public class CourseGrades implements Analyzable {
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
    public double getAverage() {
        double average = 0;
        
        for (GradedActivity gradedActivity : grades) {
            average += gradedActivity.getScore();
        }
        
        return average / NUM_GRADES;
    }
    
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        
        for (GradedActivity gradedActivity : grades) {
            if (gradedActivity.getScore() > highest.getScore()) {
                highest = gradedActivity;
            }
        }
        
        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        
        for (GradedActivity gradedActivity : grades) {
            if (gradedActivity.getScore() < lowest.getScore()) {
                lowest = gradedActivity;
            }
        }
        
        return lowest;
    }
    
    @Override
    public String toString() {
        return "{[Lab Activity: (Score: " + grades[0].getScore() + ", Grade: " + grades[0].getGrade() + "], \n"
                + "[Pass Fail Exam: (Score: " + grades[1].getScore() + ", Grade: " + grades[0].getGrade() + "], \n"
                + "[Essay: (Score: " + grades[2].getScore() + ", Grade: " + grades[2].getGrade() + "], \n"
                + "[Final Exam: (Score: " + grades[3].getScore() + ", Grade: " + grades[3].getGrade() + "]}";
    }
}
