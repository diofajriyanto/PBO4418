/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author DIO
 */
public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    GamePlayer() {
           
    }
    
    public GamePlayer(double width,double height,int positionX,int positionY){
           
    }
    
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public double getwidth (){
        return this.width;
    }
    
    public double getheight(){
        return this.height;
    }
    
    public int getX(){
        return this.positionX;   
    }
    
    public int getY(){
        return this.positionY;
    }
    
    public void run(){
        System.out.println("Running: ");
    }
    
    public void run(int incrementX)  {
        incrementX = positionX + incrementX;
        System.out.println(" Player still running...current X position = " +incrementX);
        
    }
    
}

