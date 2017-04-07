package com.horsunenko.dao;

import com.horsunenko.model.Info;

public interface InfoDao {
    void insertInfo(Info info);
    Info getById(int id);
}
