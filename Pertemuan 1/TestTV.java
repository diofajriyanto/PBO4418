/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtv;

/**
 *
 * @author DIO
 */
public class TestTV {
    

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      TV tv1 = new TV();
      tv1.nyalakan();
      tv1.setChannel(9);
      tv1.setVolume(3);
      
      TV tv2 = new TV();
      tv2.nyalakan();
      tv2.channelNaik();
      tv2.channelNaik();
      tv2.volumeNaik();
      
      System.out.println("TV1 Channel " + tv1.channel + " Volume " + tv1.volumeLevel);
      
      System.out.println("TV2 Channel " + tv2.channel + " Volume " + tv2.volumeLevel);
       
    }
    
}
