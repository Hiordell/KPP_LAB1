package com.Lab1;

public class Triangle {

    private Float side1;
    private Float side2;
    private Float side3;
    private Float perimeter;
    private Float area;

    public Triangle(Float side1, Float side2, Float side3, Float perimeter, Float area) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Float getSide1() {
        return side1;
    }

    public Float getSide2() {
        return side2;
    }

    public Float getSide3(){
        return side3;
    }

    public Float getArea() {
        return area;
    }

    public Float getPerimeter() {
        return perimeter;
    }
}