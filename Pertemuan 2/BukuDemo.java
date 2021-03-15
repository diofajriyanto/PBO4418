/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukudemo;

/**
 *
 * @author DIO
 */
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku_1 = new Buku("PBO dengan Java", "Ardi", "Granmedia", 2001);
        buku_1.isiBuku();
        
        Buku buku_2 = new Buku("Python", "Dio", "Granmedia", 2021);
        buku_2.isiBuku();
    }
}
