/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomanusia;

/**
 *
 * @author DIO
 */
public class DemoManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia man1 = new Manusia("dio");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        man1.jualSemuaTV();
    }
    
}
