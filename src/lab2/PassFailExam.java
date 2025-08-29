/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6324569
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam(int questions, int missed) {
        super(pointsEach * numQuestions * 0.6);
        this.numQuestions = questions;
        this.numMissed = missed;
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
