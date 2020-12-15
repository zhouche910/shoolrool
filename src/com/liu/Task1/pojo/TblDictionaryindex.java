package com.liu.Task1.pojo;

import java.util.Date;

public class TblDictionaryindex {
    /**
     *
     */
    private Integer intindexid;

    /**
     *
     */
    private String nvcindexcode;

    /**
     *
     */
    private String nvcindexname;

    /**
     *
     */
    private String nvcdescription;

    /**
     *
     */
    private Integer tintstaus;

    /**
     *
     */
    private Date dtupdatetime;

    @Override
    public String toString() {
        return "TblDictionaryindex{" +
                "intindexid=" + intindexid +
                ", nvcindexcode='" + nvcindexcode + '\'' +
                ", nvcindexname='" + nvcindexname + '\'' +
                ", nvcdescription='" + nvcdescription + '\'' +
                ", tintstaus=" + tintstaus +
                ", dtupdatetime=" + dtupdatetime +
                '}';
    }

    public Integer getIntindexid() {
        return intindexid;
    }

    public void setIntindexid(Integer intindexid) {
        this.intindexid = intindexid;
    }

    public String getNvcindexcode() {
        return nvcindexcode;
    }

    public void setNvcindexcode(String nvcindexcode) {
        this.nvcindexcode = nvcindexcode;
    }

    public String getNvcindexname() {
        return nvcindexname;
    }

    public void setNvcindexname(String nvcindexname) {
        this.nvcindexname = nvcindexname;
    }

    public String getNvcdescription() {
        return nvcdescription;
    }

    public void setNvcdescription(String nvcdescription) {
        this.nvcdescription = nvcdescription;
    }

    public Integer getTintstaus() {
        return tintstaus;
    }

    public void setTintstaus(Integer tintstaus) {
        this.tintstaus = tintstaus;
    }

    public Date getDtupdatetime() {
        return dtupdatetime;
    }

    public void setDtupdatetime(Date dtupdatetime) {
        this.dtupdatetime = dtupdatetime;
    }
}

