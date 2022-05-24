package com.fdmgroup.tdd.gradecalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCalculatorServiceTest {

    GradeCalculator gradeCalculator;

    @BeforeEach
    void setUp() {
        gradeCalculator = new GradeCalculator();
    }

    @Test
    public void test1(){
        String returnedGrade = gradeCalculator.getClassification(60);
        assertEquals("fail", returnedGrade);
    }

    @Test
    public void test2(){
        String returnedGrade = gradeCalculator.getClassification(76);
        assertEquals("pass", returnedGrade);
    }

    @Test
    public void test3(){
        String returnedGrade = gradeCalculator.getClassification(85);
        assertEquals("merit", returnedGrade);
    }

    @Test
    public void test4(){
        String returnedGrade = gradeCalculator.getClassification(92);
        assertEquals("distinction", returnedGrade);
    }

}
