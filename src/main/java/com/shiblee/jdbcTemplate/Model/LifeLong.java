package com.shiblee.jdbcTemplate.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LifeLong {

    private int id;
    private String name;
    private String tech;

    public LifeLong(int id, String name, String tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }

    public LifeLong( ) {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "LifeLong{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
