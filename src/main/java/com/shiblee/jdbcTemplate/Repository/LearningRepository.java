package com.shiblee.jdbcTemplate.Repository;

import com.shiblee.jdbcTemplate.Dao.Java.Dao;
import com.shiblee.jdbcTemplate.Model.LifeLong;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LearningRepository implements Dao<LifeLong> {

    private static final Logger log = LoggerFactory.getLogger(LifeLong.class);
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public LearningRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }







    @Override
    public List<LifeLong> list() {
        String sql = "SELECT * FROM LifeLong";
        return null;
    }

    @Override
    public void create(LifeLong lifeLong) {
        String sql = "insert into LifeLong values(?,?,? )";
        jdbcTemplate.update(sql,
                lifeLong.getId(),lifeLong.getName(),lifeLong.getTech()
                );


    }

    @Override
    public Optional<LifeLong> get(int id) {
        String sql = "SELECT * FROM LifeLong WHERE id = id";
        jdbcTemplate.execute(sql);

        return  null;
    }

    @Override
    public void delete(LifeLong lifeLong, int i) {

    }

    @Override
    public void update(LifeLong lifeLong, int d) {

    }
}
