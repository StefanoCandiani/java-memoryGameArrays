
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;
import java.util.Random;
/**
 *
 * @author mlarrubia
 */
public class MemoryGame {

    static Random r = new Random();
    static final int GRIDSIZE = 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] deck = {'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};
        boolean[] cardDrawn = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,};
        char[][] gridArea = new char[GRIDSIZE][GRIDSIZE];
        
        for(int i = 0; i < deck.length; i++){
            
        }
    }
    
}
