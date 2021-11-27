/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author STUDENT
 */

class Game {
    void type() {
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game {
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}
class Chess extends Game {
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

public class Lab6ae_1 {
    public static void main(String args[]) {
        Game game = new Game();
        Cricket cricket = new Cricket();
        Chess chess = new Chess();
        Game r;
        
        r = game;
        r.type();
        
        r = cricket;
        r.type();
        
        r = chess;
        r.type();
    }
}
