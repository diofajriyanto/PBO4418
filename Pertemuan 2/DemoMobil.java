/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

/**
 *
 * @author DIO
 */
public class MobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OBJEK
        xMobil mobilku = new xMobil();
        mobilku.nyalakanMobil();
        mobilku.setGigi(1);
        
        //PEMANGGILAN
        mobilku.warna = "Abuabu";
        mobilku.TahunProduksi = 2001;
        mobilku.getGigi = 1;
        System.out.println("warnanya: " + mobilku.warna);
        System.out.println("tahunnya: " + mobilku.TahunProduksi);
        System.out.println("giginya: " + mobilku.getGigi);
    }
    
}
