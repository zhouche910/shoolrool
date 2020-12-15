package com.liu.Task1.service;

import com.liu.Task1.dao.tblDictionaryDao;
import com.liu.Task1.pojo.TblDictionary;

import java.util.List;

public class TblDictionaryservice implements tblDictionaryDao {
    @Override
    public boolean addtblDictionary(TblDictionary tblDictionary) {
        return false;
    }

    @Override
    public boolean updatetblDictionary(TblDictionary tblDictionary) {
        return false;
    }

    @Override
    public boolean deletetblDictionary(String tblDictionaryid) {
        return false;
    }

    @Override
    public TblDictionary selecttblDictionary(String tblDictionaryid) {
        return null;
    }

    @Override
    public List<TblDictionary> selectAlltblDictionary() {
        return null;
    }
}
