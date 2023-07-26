package org.peaksoft.dao;

import org.peaksoft.models.ShowTime;

import java.util.List;

public interface ShowTimeDao {

    void createShowTime(String tableName, List<String > columns);
    ShowTime save(ShowTime showTime);
}
