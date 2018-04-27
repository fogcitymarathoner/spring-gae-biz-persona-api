package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="states")
public class State {

    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;
    @Column(name="post_ab")
    private String post_ab;
    @Column(name="capital")
    private String capital;
    @Column(name="flower")
    private String flower;
    @Column(name="state_no")
    private String state_no;
    @Column(name="date")
    private String date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPost_ab() {
        return post_ab;
    }

    public void setPost_ab(String post_ab) {
        this.post_ab = post_ab;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getState_no() {
        return state_no;
    }

    public void setState_no(String state_no) {
        this.state_no = state_no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public long getCreated_user_id() {
        return created_user_id;
    }

    public void setCreated_user_id(long created_user_id) {
        this.created_user_id = created_user_id;
    }

    public long getModified_user_id() {
        return modified_user_id;
    }

    public void setModified_user_id(long modified_user_id) {
        this.modified_user_id = modified_user_id;
    }

    public Date getLast_sync_time() {
        return last_sync_time;
    }

    public void setLast_sync_time(Date last_sync_time) {
        this.last_sync_time = last_sync_time;
    }

    public State() {
        super();
    }

    public State(long id, String post_ab, String capital, String flower, String state_no, Date date, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {
        this.id = id;
        this.post_ab = post_ab;
        this.capital = capital;
        this.flower = flower;
        this.state_no = state_no;
        this.date = date;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }

    @Column(name="created_date")
    private Date created_date;
    @Column(name="modified_date")
    private Date modified_date;
    @Column(name="created_user_id")
    private long created_user_id;
    @Column(name="modified_user_id")
    private long modified_user_id;
    @Column(name="last_sync_time")
    private Date last_sync_time;

}
