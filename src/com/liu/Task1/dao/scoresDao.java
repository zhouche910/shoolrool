package com.liu.Task1.dao;

import com.liu.Task1.pojo.Course;
import com.liu.Task1.pojo.Scores;

import java.util.List;

public interface scoresDao {
    public  boolean addscores(Scores scores);

    public  boolean updatescores( Scores scores);
    public  boolean deletescores( String scoresId);
    public  Scores selectscores( String scoresId);
    public List<Scores> selectAllscores();
}
