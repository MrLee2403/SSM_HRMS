package com.oasis.lee.dao.pojo;

public class PersonNum {

    private Integer mbegin;
    private Integer mend;
    private Integer newemp;
    private Integer dimemp;

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

    public PersonNum(Integer mbegin, Integer mend, Integer newemp, Integer dimemp) {
        this.mbegin = mbegin;
        this.mend = mend;
        this.newemp = newemp;
        this.dimemp = dimemp;
    }

    public PersonNum() {
    }

    @Override
    public String toString() {
        return "PersonNum{" +
                "mbegin=" + mbegin +
                ", mend=" + mend +
                ", newemp=" + newemp +
                ", dimemp=" + dimemp +
                '}';
    }
}
