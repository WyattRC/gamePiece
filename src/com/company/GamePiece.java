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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int X, int Y) {
        if (!this.freeze) {
            this.positionX = X;
            this.positionY = Y;
            System.out.println("X: "  + X + " Y: " + Y);
        }
    }



    public void freeze() {

        this.freeze = true;
        System.out.println("Piece is frozen in place.");
    }
    public void unFreeze(){
        this.freeze = false;
    }






    public String toString() {
        return "My coordinates are X: " + this.positionX + " Y: " + this.positionY + ". " + "Frozen status = " + this.freeze + ". " + "Your name is " + this.name + ". " + "Your color is " + this.color;
    }
}


