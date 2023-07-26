package org.peaksoft.dao;

import org.peaksoft.models.Theatre;

public interface TheatreDao {
    Theatre findById(Long theaterId);
}
