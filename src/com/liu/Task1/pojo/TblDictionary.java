package com.liu.Task1.pojo;

import java.util.Date;

public class TblDictionary {
    /**
     *
     */
    private Integer intDictionaryID;

    /**
     *
     */
    private String nvcDictionaryCode;

    /**
     *
     */
    private String nvcindexcode;

    /**
     *
     */
    private String nvcValue;

    /**
     *
     */
    private String nvcDESCRIPTION;

    /**
     *
     */
    private Integer tintstatus;

    /**
     *
     */
    private Date dtupdatetime;

    @Override
    public String toString() {
        return "TblDictionary{" +
                "intDictionaryID=" + intDictionaryID +
                ", nvcDictionaryCode='" + nvcDictionaryCode + '\'' +
                ", nvcindexcode='" + nvcindexcode + '\'' +
                ", nvcValue='" + nvcValue + '\'' +
                ", nvcDESCRIPTION='" + nvcDESCRIPTION + '\'' +
                ", tintstatus=" + tintstatus +
                ", dtupdatetime=" + dtupdatetime +
                '}';
    }

    public Integer getIntDictionaryID() {
        return intDictionaryID;
    }

    public void setIntDictionaryID(Integer intDictionaryID) {
        this.intDictionaryID = intDictionaryID;
    }

    public String getNvcDictionaryCode() {
        return nvcDictionaryCode;
    }

    public void setNvcDictionaryCode(String nvcDictionaryCode) {
        this.nvcDictionaryCode = nvcDictionaryCode;
    }

    public String getNvcindexcode() {
        return nvcindexcode;
    }

    public void setNvcindexcode(String nvcindexcode) {
        this.nvcindexcode = nvcindexcode;
    }

    public String getNvcValue() {
        return nvcValue;
    }

    public void setNvcValue(String nvcValue) {
        this.nvcValue = nvcValue;
    }

    public String getNvcDESCRIPTION() {
        return nvcDESCRIPTION;
    }

    public void setNvcDESCRIPTION(String nvcDESCRIPTION) {
        this.nvcDESCRIPTION = nvcDESCRIPTION;
    }

    public Integer getTintstatus() {
        return tintstatus;
    }

    public void setTintstatus(Integer tintstatus) {
        this.tintstatus = tintstatus;
    }

    public Date getDtupdatetime() {
        return dtupdatetime;
    }

    public void setDtupdatetime(Date dtupdatetime) {
        this.dtupdatetime = dtupdatetime;
    }
}

