package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService{
    @Override
    public String getClassification(double mark) {
        if (mark < 75) {
            return "fail";
        } else if (mark < 80 && mark >= 75) {
            return "pass";
        } else if (mark > 80 &&  mark < 90) {
            return "merit";
        } else if (mark >= 90 && mark <= 100) {
            return "distinction";
        }
        return null;
    }
}
