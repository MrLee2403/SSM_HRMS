package com.oasis.lee.dao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class NewEmpDTO {
    private int id;
    private String dname;
    private String jname;
    private String ename;
    private String esex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date hireday;
    private String eedu;

    @Override
    public String toString() {
        return "NewEmpDTO{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", jname='" + jname + '\'' +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", hireday=" + hireday +
                ", eedu='" + eedu + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdname() {
        return dname;
    }

    public void setdname(String dname) {
        this.dname = dname;
    }

    public String getjname() {
        return jname;
    }

    public void setjname(String jname) {
        this.jname = jname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getesex() {
        return esex;
    }

    public void setesex(String esex) {
        this.esex = esex;
    }

    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    public String geteedu() {
        return eedu;
    }

    public void seteedu(String eedu) {
        this.eedu = eedu;
    }

    public NewEmpDTO(int id, String dname, String jname, String ename, String esex, Date hireday, String eedu) {
        this.id = id;
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.hireday = hireday;
        this.eedu = eedu;
    }

    public NewEmpDTO(String dname, String jname, String ename, String esex, Date hireday, String eedu) {
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.hireday = hireday;
        this.eedu = eedu;
    }

    public NewEmpDTO() {
    }
}
