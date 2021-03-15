/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIO
 */
public class TestSimpleCircle {
    //Main
    public static void main(String[] args){
        SimpleCircle circle1 = new SimpleCircle(5);
        System.out.println(circle1.radius + " Area is " + circle1.getArea());
        
        SimpleCircle circle2 = new SimpleCircle(10);
        System.out.println(circle2.radius + " Area is " + circle2.getArea());
        
        SimpleCircle circle3 = new SimpleCircle(15);
        System.out.println(circle3.radius + " Area is " + circle3.getArea());
    }
}

class SimpleCircle{
    double radius = 0;
            
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    /**
    double setRadius(double newRadius){
        radius = newRadius;
        **/
}

