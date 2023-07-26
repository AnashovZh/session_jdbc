package org.peaksoft.dao.impl;

import org.peaksoft.config.JdbcConfig;
import org.peaksoft.dao.ShowTimeDao;
import org.peaksoft.models.ShowTime;
import org.peaksoft.services.ShowTimeService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ShowTimeDaoImpl implements ShowTimeDao {
    private Connection connection= JdbcConfig.getConnection();
    @Override
    public void createShowTime(String tableName, List<String> columns) {
//        StringBuilder stringBuilder =new StringBuilder(String.format("create table %s (", tableName));
//        try {
//            Statement statement = connection.createStatement();
//            for (int i = 0; i < columns.size(); i++) {
//                stringBuilder.append(columns.get(i));
//                if (i < columns.size() - 1) {
//                    stringBuilder.append(", ");}}
//            stringBuilder.append(")");
//            statement.executeUpdate(stringBuilder.toString());
//            statement.close();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
        StringBuilder stringBuilder=new StringBuilder(String.format("create table %s (",tableName));
        try{
            Statement statement=connection.createStatement();
            for (int i = 0; i < columns.size(); i++) {
                stringBuilder.append(columns.get(i));
                if (i< columns.size() -1){
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(")");
            statement.executeUpdate(stringBuilder.toString());
            statement.close();
        }catch (SQLException s){
            System.out.println(s.getMessage());
        }
    }

    @Override
    public ShowTime save(ShowTime showTime) {
        connection.prepareStatement("""
insert into show_time (mo)
""");
        return null;
    }
}
