/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author DIO
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GamePlayer demo  = new GamePlayer();
        demo.setPosition(20,30);
        demo.run(80);
        demo.run();
    }
    
}
