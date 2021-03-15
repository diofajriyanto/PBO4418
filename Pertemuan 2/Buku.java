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
class Buku {
    String Judul;
    String Pengarang;
    String Penerbit;
    int TahunTerbit;

    public Buku(String Judul, String Pengarang, String Penerbit, int TahunTerbit) {
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.TahunTerbit = TahunTerbit;
    }

    public void isiBuku() {
        System.out.println("Judul: " + this.Judul);
        System.out.println("Pengarang: " + this.Pengarang);
        System.out.println("Penerbit: " + this.Penerbit);
        System.out.println("Tahun: " + this.TahunTerbit);
    }
    
    
}
