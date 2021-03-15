/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

/**
 *
 * @author DIO
 */


public class MatematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematika xMatematika = new matematika();
        
        xMatematika.angka = 11;
        xMatematika.tambah(11);
        
        xMatematika.angka = 4;
        xMatematika.kurang(2);
        
        xMatematika.angka = 10;
        xMatematika.kali(5);
        
        xMatematika.angka = 15;
        xMatematika.bagi(3);
    }
    
}
