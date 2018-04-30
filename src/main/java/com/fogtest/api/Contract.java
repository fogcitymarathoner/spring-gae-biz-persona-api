package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;
    @Column(name = "client_id")
    private long client_id;
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "period_id")
    private long period_id;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "notes")
    private String notes;
    @Column(name = "title")
    private String title;
    @Column(name = "terms")
    private int terms;
    @Column(name = "startdate")
    private Date startdate;
    @Column(name = "enddate")
    private Date enddate;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", nullable = false, insertable = false, updatable = false)
    private Client client;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "contract")
    private Set<Invoice> invoices = new HashSet<>();

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }


    public Contract() {
        super();
    }

    public Contract(long client_id, long employee_id, long period_id, Boolean active, String notes, String title, int terms, Date startdate, Date enddate, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {

        this.client_id = client_id;
        this.employee_id = employee_id;
        this.period_id = period_id;
        this.active = active;
        this.notes = notes;
        this.title = title;
        this.terms = terms;
        this.startdate = startdate;
        this.enddate = enddate;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(long period_id) {
        this.period_id = period_id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

}
