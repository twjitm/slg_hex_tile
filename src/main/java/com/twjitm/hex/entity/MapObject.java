package com.twjitm.hex.entity;

import java.util.Map;

/**
 * 一张地图
 */
public class MapObject {
    private int mapId;
    private String name;
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    private Map<Integer, AreaObject> areas;
}
