package com.learn2crack.loadimage;

/**
 * Created by VISH on 10/18/2017.
 */

public class list_item {
    private String head;
    private String desc;
    //generating a constructor to initialize these strings


    public list_item(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}

