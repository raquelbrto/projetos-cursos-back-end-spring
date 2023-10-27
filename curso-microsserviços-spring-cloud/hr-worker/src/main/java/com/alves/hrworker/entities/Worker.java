package com.alves.hrworker.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double dailyIncome;

    public Worker() {

    }

    public Worker(Long id, String name, double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(getId(), worker.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
