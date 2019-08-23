package com.oasis.lee.dao.pojo;

public class HrmReportDTO {
    private Integer dno;
    private Integer mbegin;
    private Integer mend;
    private Integer newemp;
    private Integer dimemp;
    private Integer master;
    private Integer bachelor;
    private  Integer college;
    private Integer senior;

    public HrmReportDTO(Integer dno, Integer mbegin, Integer mend, Integer newemp, Integer dimemp, Integer master, Integer bachelor, Integer college, Integer senior) {
        this.dno = dno;
        this.mbegin = mbegin;
        this.mend = mend;
        this.newemp = newemp;
        this.dimemp = dimemp;
        this.master = master;
        this.bachelor = bachelor;
        this.college = college;
        this.senior = senior;
    }

    public HrmReportDTO() {
    }

    @Override
    public String toString() {
        return "HrmReportDTO{" +
                "dno=" + dno +
                ", mbegin=" + mbegin +
                ", mend=" + mend +
                ", newemp=" + newemp +
                ", dimemp=" + dimemp +
                ", master=" + master +
                ", bachelor=" + bachelor +
                ", college=" + college +
                ", senior=" + senior +
                '}';
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public Integer getMbegin() {
        return mbegin;
    }

    public void setMbegin(Integer mbegin) {
        this.mbegin = mbegin;
    }

    public Integer getMend() {
        return mend;
    }

    public void setMend(Integer mend) {
        this.mend = mend;
    }

    public Integer getNewemp() {
        return newemp;
    }

    public void setNewemp(Integer newemp) {
        this.newemp = newemp;
    }

    public Integer getDimemp() {
        return dimemp;
    }

    public void setDimemp(Integer dimemp) {
        this.dimemp = dimemp;
    }

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
}
