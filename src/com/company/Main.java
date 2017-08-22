package com.company;

public class Main {

    public static void main(String[] args) {
       GamePiece game = new GamePiece();
       game.move(4, 5);
       game.freeze(false);
       game.name("fuck");
       game.color("bread");
       System.out.print(game);
    }
}


