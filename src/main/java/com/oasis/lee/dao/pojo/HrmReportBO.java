package com.oasis.lee.dao.pojo;

public class HrmReportBO {
    private  Emp emp;
    private PersonNum personNum;
    private Edu edu;

    public HrmReportBO() {

    }

    @Override
    public String toString() {
        return "HrmReportBO{" +
                "emp=" + emp +
                ", personNum=" + personNum +
                ", edu=" + edu +
                '}';
    }

    public HrmReportBO(Emp emp, PersonNum personNum, Edu edu) {
        this.emp = emp;
        this.personNum = personNum;
        this.edu = edu;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public PersonNum getPersonNum() {
        return personNum;
    }

    public void setPersonNum(PersonNum personNum) {
        this.personNum = personNum;
    }

    public Edu getEdu() {
        return edu;
    }

    public void setEdu(Edu edu) {
        this.edu = edu;
    }
}
