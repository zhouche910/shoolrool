package com.liu.Task1.dao;

import com.liu.Task1.pojo.Course;
import com.liu.Task1.pojo.TblDictionary;

import java.util.List;

public interface tblDictionaryDao {
    public  boolean addtblDictionary(TblDictionary tblDictionary);

    public  boolean updatetblDictionary( TblDictionary tblDictionary);
    public  boolean deletetblDictionary( String tblDictionaryid);
    public  TblDictionary selecttblDictionary( String tblDictionaryid);
    public List<TblDictionary> selectAlltblDictionary();
}
