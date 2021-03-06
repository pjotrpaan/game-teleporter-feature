package com.company;

// @Lombok getter and setter
public class Character {
    private int xCoord;
    private int yCoord;

    private String name;
    private Inventory inventory;
    private CharacterType type;
    private Direction direction = Direction.UP;
    private String symbol;
    private boolean isVisible;

    public Character(String name, CharacterType type, String symbol, int worldHeight, int worldWidth) {
        randomiseCoordinates(1, worldWidth-1, worldHeight-1);
        this.name = name;
        this.type = type;
        this.symbol = symbol;
        this.isVisible = true;
    }

    public void randomiseCoordinates(int min, int worldWidth, int worldHeight) {
        this.xCoord = (int) ((Math.random() * ((worldWidth - min) + 1)) + min);
        this.yCoord = (int) ((Math.random() * ((worldHeight - min) + 1)) + min);
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
                this.yCoord--;
                break;
            case DOWN:
                this.yCoord++;
                break;
            case LEFT:
                this.xCoord--;
                break;
            case RIGHT:
                this.xCoord++;
                break;
        }
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

    public String getSymbol() {
        return symbol;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
