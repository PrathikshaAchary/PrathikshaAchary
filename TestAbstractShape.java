/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k88;
abstract class Shape1{
    abstract double calculateArea();
     abstract double calculatePerimeter();}
class Circle1 extends Shape1{
     private double radius;
     public Circle1(double radius){
         this.radius=radius;}
     double calculateArea(){
         return Math.PI*radius*radius;}
     double calculatePerimeter(){
         return 2*Math.PI*radius;}}
class Triangle1 extends Shape1{
     private double side1,side2,side3;
     public Triangle1(double side1,double side2,double side3){
         this.side1=side1;
         this.side2=side2;
         this.side3=side3;}
     double calculateArea(){
         double s=(side1+side2+side3)/2;
         return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));}
     double calculatePerimeter(){
         return side1+side2+side3;}}
     
    


/**
 *
 * @author smv
 */
public class TestAbstractShape {
    public static void main(String[] args){
        Circle1 circle1=new Circle1(5);
        System.out.println("Area and Circumferrence of Circle are");
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        Triangle1 triangle1=new Triangle1(3,4,5);
        System.out.println("Area and Perimeter of Triangle are");
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle1.calculatePerimeter());
    }
    
}
