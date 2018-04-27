package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees_memos")
public class EmployeeMemo {
    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name="notes")
    private String notes;
    @Column(name = "date")
    private Date date;
    @Column(name = "created_date")
    private Date created_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    @Column(name = "modified_date")
    private Date modified_date;
    @Column(name = "created_user_id")
    private long created_user_id;
    @Column(name = "modified_user_id")
    private long modified_user_id;
    @Column(name = "last_sync_time")
    private Date last_sync_time;

    public EmployeeMemo() {
        super();
    }

    public EmployeeMemo(long id, long employee_id, String notes, Date date, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {
        this.id = id;
        this.employee_id = employee_id;
        this.notes = notes;
        this.date = date;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }
}
