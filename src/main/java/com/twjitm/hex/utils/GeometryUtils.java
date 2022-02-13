package com.twjitm.hex.utils;


import com.twjitm.hex.entity.HexObject;

public class GeometryUtils {
    public static double SQRT3 = Math.sqrt(3);
    public static double SIN60 = Math.sin(60);

    /**
     * 一个中心对应的一周邻居
     */
    public static HexObject[] CENTER = new HexObject[]{
            new HexObject(2, 1), new HexObject(3, 1), new HexObject(3, 2),
            new HexObject(2, 2),
            new HexObject(3, 3), new HexObject(2, 3), new HexObject(1, 2)};


    /**
     * 两个坐标 的center 距离
     *
     * @param h1
     * @param h2
     * @return
     */
    public double range(HexObject h1, HexObject h2) {

        return 0;
    }
}
