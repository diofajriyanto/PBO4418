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
class xMobil {

    String warna;
    int TahunProduksi;
    private int ubahGigi;
    int getGigi;

    public void nyalakanMobil(boolean on) {
        on = true;
    }

    public void matikanMobil (boolean on) {
        on = false;
    }
    
    public void setGigi(int tambahGigi){
        ubahGigi = ubahGigi + tambahGigi;
    }
    int getGigi(){
        return ubahGigi;
    }

    void nyalakanMobil() {
        boolean on = true;
    }

    void setGigi() {
        boolean on = true;
    }
}

