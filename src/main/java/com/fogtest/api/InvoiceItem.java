package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoices_items")
public class InvoiceItem {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;
    @Column(name = "invoice_id")
    private long invoice_id;
    @Column(name = "description")
    private String description;
    @Column(name = "amount")
    private Float amount;
    @Column(name = "quantity")
    private Float quantity;
    @Column(name = "cost")
    private Float cost;

    @Column(name = "ordering")
    private Integer ordering;
    @Column(name="cleared")
    private Boolean cleared;
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

    public long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Boolean getCleared() {
        return cleared;
    }

    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
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

    public InvoiceItem(long id, long invoice_id, String description, Float amount, Float quantity, Float cost, Integer ordering, Boolean cleared, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {

        this.id = id;
        this.invoice_id = invoice_id;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
        this.cost = cost;
        this.ordering = ordering;
        this.cleared = cleared;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }

    public InvoiceItem() {
        super();
    }


}
