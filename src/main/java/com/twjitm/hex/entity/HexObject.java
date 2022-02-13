package com.twjitm.hex.entity;

/**
 * 一个六边形格子 ：“odd-r”水平布局 将奇数行向右推
 */
public class HexObject {
    private int x;
    private int y;
    private int side = 1;
    private int type;

    public HexObject() {
    }

    public HexObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

