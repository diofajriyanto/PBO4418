/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * @author DIO
 */
public class MotorVehicle  extends Vehicle{
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";
    
    public MotorVehicle(){
    }
    
    MotorVehicle(int sizeEng, String lcPlate){
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }
    
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    
    public String getLicencePlate(){
        return this.licencePlate; 
    }
    
}
