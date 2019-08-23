package com.oasis.lee.dao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EmpPro {
    private Integer eno;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date epstartdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ependdate;

    private String epstate;

    public EmpPro(Integer eno, Date epstartdate, Date ependdate, String epstate) {
        this.eno = eno;
        this.epstartdate = epstartdate;
        this.ependdate = ependdate;
        this.epstate = epstate;
    }

    @Override
    public String toString() {
        return "EmpPro{" +
                "eno=" + eno +
                ", epstartdate=" + epstartdate +
                ", ependdate=" + ependdate +
                ", epstate='" + epstate + '\'' +
                '}';
    }

    public EmpPro() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getEpstartdate() {
        return epstartdate;
    }

    public void setEpstartdate(Date epstartdate) {
        this.epstartdate = epstartdate;
    }

    public Date getEpenddate() {
        return ependdate;
    }

    public void setEpenddate(Date ependdate) {
        this.ependdate = ependdate;
    }

    public String getEpstate() {
        return epstate;
    }

    public void setEpstate(String epstate) {
        this.epstate = epstate == null ? null : epstate.trim();
    }
}