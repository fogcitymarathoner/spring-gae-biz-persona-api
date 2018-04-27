package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contracts_items")
public class ContractItem {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;
    @Column(name = "contract_id")
    private long contract_id;
    @Column(name = "description")
    private String description;
    @Column(name = "amt")
    private Float amt;
    @Column(name = "cost")
    private Float cost;
    @Column(name = "notes")
    private String notes;
    @Column(name = "ordering")
    private Integer ordering;
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

    public ContractItem() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getContract_id() {
        return contract_id;
    }

    public void setContract_id(long contract_id) {
        this.contract_id = contract_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAmt() {
        return amt;
    }

    public void setAmt(Float amt) {
        this.amt = amt;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
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

    public ContractItem(long id, long contract_id, String description, Float amt, Float cost, String notes, Integer ordering, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {

        this.id = id;
        this.contract_id = contract_id;
        this.description = description;
        this.amt = amt;
        this.cost = cost;
        this.notes = notes;
        this.ordering = ordering;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }
}
