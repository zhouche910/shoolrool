package com.liu.Task1.dao;

import com.liu.Task1.pojo.TblDictionary;
import com.liu.Task1.pojo.TblDictionaryindex;

import java.util.List;

public interface tblDictionaryindexDao {
    public  boolean addtbltblDictionaryindex(TblDictionaryindex tblDictionaryindex);

    public  boolean updatetblDictionaryindex( TblDictionaryindex tblDictionaryindex);
    public  boolean deletetblDictionaryindex( String tblDictionaryindexid);
    public  TblDictionaryindex selecttblDictionaryindex( String tblDictionaryindexid);
    public List<TblDictionaryindex> selectAlltblDictionaryindex();
}
