/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik1;

/**
 *
 * @author DIO
 */
import java.io.*;
public class Praktik1 {
    
    public static void main(String args[])throws IOException{
        InputStreamReader cin = null;
        
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Masukan karakter, 'q' to quit. ");
            char c;
            do{
                c = (char) cin.read();
                System.out.println(c);
            } while(c != 'q');
        }finally {
            if (cin != null){
                cin.close();
            }
        }
    }
}
