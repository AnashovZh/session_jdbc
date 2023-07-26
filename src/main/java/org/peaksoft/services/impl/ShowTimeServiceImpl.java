package org.peaksoft.services.impl;

import org.peaksoft.dao.ShowTimeDao;
import org.peaksoft.dao.TheatreDao;
import org.peaksoft.dao.impl.ShowTimeDaoImpl;
import org.peaksoft.dao.impl.TheatreDaoImpl;
import org.peaksoft.services.ShowTimeService;

import java.util.List;

public class ShowTimeServiceImpl implements ShowTimeService {
   ShowTimeDao showTimeDao=new ShowTimeDaoImpl();
   TheatreDao theatreDao=new TheatreDaoImpl();
    @Override
    public void createShowTime(String tableName, List<String> columns) {
        showTimeDao.createShowTime(tableName,columns);
    }
}
