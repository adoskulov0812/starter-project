package kz.adoskulov.test.quarkus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "players")
public class Player {
    @Column
    @Id
    private int id;

    @Column
    private String fullname;

    @Column
    private int age;

    @Column
    private int country;

    @Column (name = "salary")
    private int zp;

    public Player() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getSalary() {
        return zp;
    }

    public void setSalary(int zp) {
        this.zp = zp;
    }
}
