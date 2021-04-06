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
public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(3, "H 4370 KS");
        
        sepeda.ringBell();
        
        System.out.println("Plat Sepeda Motor : "+motor.getLicencePlate());
        System.out.println("Mesin : "+motor.getSizeofEngine());
    }
    
}
