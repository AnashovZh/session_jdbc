package org.peaksoft.dao;

import org.peaksoft.services.MovieService;

import java.util.List;

public interface MovieDao {
    void createMovie(String tableName, List<String > columns);
}
