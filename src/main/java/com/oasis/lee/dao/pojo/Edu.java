package com.oasis.lee.dao.pojo;

public class Edu {
    private Integer master;
    private Integer bachelor;
    private  Integer college;
    private Integer senior;

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getBachelor() {
        return bachelor;
    }

    public void setBachelor(Integer bachelor) {
        this.bachelor = bachelor;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Integer getSenior() {
        return senior;
    }

    public void setSenior(Integer senior) {
        this.senior = senior;
    }

    public Edu() {
    }

    @Override
    public String toString() {
        return "Edu{" +
                "master=" + master +
                ", bachelor=" + bachelor +
                ", college=" + college +
                ", senior=" + senior +
                '}';
    }
}
