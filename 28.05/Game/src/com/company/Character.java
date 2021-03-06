package com.company;

// @Lombok getter and setter
public class Character {
    private int xCoord;
    private int yCoord;

    private String name;
    private Inventory inventory;
    private CharacterType type;
    private Direction direction = Direction.UP;

    public Character(String name, Inventory inventory, CharacterType type) {
        this.xCoord = 40;
        this.yCoord = 40;
        this.name = name;
        this.inventory = inventory;
        this.type = type;
        // String.valueof(type);
    }

    public Character(String name, CharacterType type) {
        this.xCoord = 50;
        this.yCoord = 50;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Olen kasutaja, koordinaadid:" +
                "x=" + xCoord +
                ", y=" + yCoord +
                "; Nimi='" + name +
                ". Olen tüübist: " + type;
    }


    public void changeDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        switch (this.direction) {
            case UP:
                this.yCoord++;
                break;
            case DOWN:
                this.yCoord--;
                break;
            case LEFT:
                this.xCoord--;
                break;
            case RIGHT:
                this.xCoord++;
                break;
        }
        System.out.println(this.name + " on koordinaatidel, X: " + this.xCoord + " , Y: " + this.yCoord);
    }


//    case 1 -> numericString = "one";
//      case 2 -> numericString = "two";
//      case 3 -> numericString = "three";
//    default -> numericString = "N/A";


    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
