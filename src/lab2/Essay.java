/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author 6324569
 */
public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double gr, double sp, double len, double cnt) {
        this.grammer = gr;
        this.spelling = sp;
        this.correctLength = len;
        this.content = cnt;
        super.setScore(gr + sp + len + cnt);
    }
    
    public void setGrammar(double g) {
        this.grammer = g;
    }
    
    public void setSpelling(double s) {
        this.spelling = s;
    }
    
    public void setCorrectLength(double c) {
        this.correctLength = c;
    }
    
    public void setContent(double c) {
        this.content = c;
    }

    public double getGrammer() {
        return grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }
    
    @Override
    public double getScore() {
        return super.getScore();
    }
    
    @Override
    public String toString() {
        return "Total points: " + this.getScore() + "\n"
                + "Grade: " + this.getGrade();
    }
}
