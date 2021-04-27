package com.star.storage.tema3;

import java.awt.color.CMMException;

public class ComplexNumber {
    private double real,imaginary;
    ComplexNumber(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void add(double a, double b){
        real += a;
        imaginary +=b;
    }
    public void add(ComplexNumber a) {
        real += a.real;
        imaginary += a.imaginary;
    }
    public void subtract(ComplexNumber a) {
        real -= a.real;
        imaginary -= a.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}
