package com.oasis.lee.dao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EmpDim {
    private Integer eno;

   @DateTimeFormat(pattern = "yyyy-MM-dd")
   @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eddate;

    private String edtype;

    private String edtalent;

    public EmpDim(Integer eno) {
        this.eno = eno;
    }

    public EmpDim(Integer eno, Date eddate, String edtype, String edtalent) {
        this.eno = eno;
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    @Override
    public String toString() {
        return "EmpDim{" +
                "eno=" + eno +
                ", eddate=" + eddate +
                ", edtype='" + edtype + '\'' +
                ", edtalent='" + edtalent + '\'' +
                '}';
    }

    public EmpDim(Date eddate, String edtype, String edtalent) {
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public EmpDim() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getEddate() {
        return eddate;
    }

    public void setEddate(Date eddate) {
        this.eddate = eddate;
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype == null ? null : edtype.trim();
    }

    public String getEdtalent() {
        return edtalent;
    }

    public void setEdtalent(String edtalent) {
        this.edtalent = edtalent == null ? null : edtalent.trim();
    }
}