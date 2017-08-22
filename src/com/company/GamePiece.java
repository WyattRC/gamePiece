package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean freeze;
    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.freeze = false;
        this.name = "";
        this.color = "";
    }


    public void move(int X, int Y) {
        if (!freeze) {
            this.positionX = X;
            this.positionY = Y;

        }
    }



    public void freeze(boolean T) {

        this.freeze = T;
    }

    public void name(String name){
        this.name = name;
    }

    public void color(String color){
        this.color = color;
    }


    public String toString() {
        return "My coordinates are X: " + this.positionX + " Y: " + this.positionY + ". " + "Frozen status = " + this.freeze + ". " + "Your name is " + this.name + ". " + "Your color is " + this.color;
    }
}


