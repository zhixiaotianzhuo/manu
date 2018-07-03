package com.one.zero.manu.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by MANU on 2018/7/2.
 */
@Entity
public class Role implements Serializable {

    private static final long serialVersionUID = 3926276668667517847L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
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