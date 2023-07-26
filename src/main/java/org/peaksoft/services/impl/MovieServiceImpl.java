package org.peaksoft.services.impl;

import org.peaksoft.dao.MovieDao;
import org.peaksoft.dao.impl.MovieDaoImpl;
import org.peaksoft.services.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    MovieDao movieDao=new MovieDaoImpl();


    @Override
    public void createMovie(String tableName, List<String> columns) {
        movieDao.createMovie(tableName,columns);
        System.out.println("Successfully saved table");
    }
}
