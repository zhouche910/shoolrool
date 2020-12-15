package com.liu.Task1.service;

import com.liu.Task1.dao.scoresDao;
import com.liu.Task1.pojo.Scores;

import java.util.List;

public class ScoresService implements scoresDao {
    @Override
    public boolean addscores(Scores scores) {
        return false;
    }

    @Override
    public boolean updatescores(Scores scores) {
        return false;
    }

    @Override
    public boolean deletescores(String scoresId) {
        return false;
    }

    @Override
    public Scores selectscores(String scoresId) {
        return null;
    }

    @Override
    public List<Scores> selectAllscores() {
        return null;
    }
}
