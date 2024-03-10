package com.shiblee.jdbcTemplate.Dao.Java;

import java.util.List;
import java.util.Optional;

public interface Dao <T>{

    List<T> list( );
    void create( T t );
    Optional<T> get(int id );
     void delete(T t, int i);

     void update( T t , int d);







}
