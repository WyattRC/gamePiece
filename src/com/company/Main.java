package com.company;

public class Main {

    public static void main(String[] args) {
        GamePiece game = new GamePiece();
        game.setName("Harold");
        game.setColor("Purple");
        game.move(4,9);
        game.freeze();
        game.move(7,7);
        game.unFreeze();
        game.move(9,9);
        System.out.println(game.getColor());
        System.out.println(game.getName());



    }
}


