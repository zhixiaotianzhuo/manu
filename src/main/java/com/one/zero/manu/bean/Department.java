package com.one.zero.manu.bean;

import java.io.Serializable;

/**
 * Created by MANU on 2018/7/2.
 */
public class Department implements Serializable {

    private static final long serialVersionUID = 6067283535977178571L;

    private Integer id;
    private String name;
    private String descr;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}