package org.peaksoft.dao.impl;

import org.peaksoft.config.JdbcConfig;
import org.peaksoft.dao.TheatreDao;
import org.peaksoft.models.Theatre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TheatreDaoImpl  implements TheatreDao {
    private final Connection connection= JdbcConfig.getConnection();
    @Override
    public Theatre findById(Long theaterId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("" +
                    "select *from theathres where id=?");
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
