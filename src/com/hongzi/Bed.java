package com.hongzi;

/**
 * Created by ZhuHongzi on 12/7/17.
 */
public class Bed {
    private String size;

    public Bed(String size) {
        this.size = size;
    }

    public void make() {
        System.out.println("Bed -> my bed is made");
    }
    public String getSize() {
        return size;
    }
}
