package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="expenses")
public class Expense
{
    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;
    @Column(name = "amount")
    private Float amount;
    @Column(name = "category_id")
    private long category_id;
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "report_id")
    private long report_id;
    @Column(name="cleared")
    private Boolean cleared;
    @Column(name = "date")
    private Date date;
    @Column(name="description")
    private String description;
    @Column(name="notes")
    private String notes;
    @Column(name = "created_date")
    private Date created_date;
    @Column(name = "modified_date")
    private Date modified_date;
    @Column(name = "created_user_id")
    private long created_user_id;
    @Column(name = "modified_user_id")
    private long modified_user_id;
    @Column(name = "last_sync_time")
    private Date last_sync_time;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getReport_id() {
        return report_id;
    }

    public void setReport_id(long report_id) {
        this.report_id = report_id;
    }

    public Boolean getCleared() {
        return cleared;
    }

    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public Expense(long id, Float amount, long category_id, long employee_id, long report_id, Boolean cleared, Date date, String description, String notes, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {

        this.id = id;
        this.amount = amount;
        this.category_id = category_id;
        this.employee_id = employee_id;
        this.report_id = report_id;
        this.cleared = cleared;
        this.date = date;
        this.description = description;
        this.notes = notes;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }

    public Expense() {
        super();
    }


}
