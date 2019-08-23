package com.oasis.lee.dao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

public class Dept {
    private Integer dno;

    private String dname;

    private String dtype;

    private String dphone;
 @DateTimeFormat(pattern = "yy-MM-dd")
 @JsonFormat(pattern = "yy-MM-dd")
    private Date dfounddate;

    private Integer superdno;

    public Dept(Integer dno, String dname, String dtype, String dphone, Date dfounddate, Integer superdno) {
        this.dno = dno;
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
        this.superdno = superdno;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", dtype='" + dtype + '\'' +
                ", dphone='" + dphone + '\'' +
                ", dfounddate=" + dfounddate +
                ", superdno=" + superdno +
                '}';
    }

    public Dept() {
        super();
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype == null ? null : dtype.trim();
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone == null ? null : dphone.trim();
    }

    public Date getDfounddate() {
        return dfounddate;
    }

    public void setDfounddate(Date dfounddate) {
        this.dfounddate = dfounddate;
    }

    public Integer getSuperdno() {
        return superdno;
    }

    public void setSuperdno(Integer superdno) {
        this.superdno = superdno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(dno, dept.dno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dno);
    }
}