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
class matematika{
        int angka = 0;
        int hasil = 0;

        void tambah(int AngkaBaru){
            hasil = angka + AngkaBaru;
            System.out.println(angka + " + "+ AngkaBaru + " = "+ hasil);
        }
        
        void kurang(int AngkaBaru){
            hasil = angka - AngkaBaru;
            System.out.println(angka + " - "+ AngkaBaru + " = "+ hasil);
        }
        
        void kali(int AngkaBaru){
            hasil = angka * AngkaBaru;
            System.out.println(angka + " * "+ AngkaBaru + " = "+ hasil);
        }
        
        void bagi(int AngkaBaru){
            hasil = angka / AngkaBaru;
            System.out.println(angka + " / "+ AngkaBaru + " = "+ hasil);
        }
}
