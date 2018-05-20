package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="invoices")
public class Invoice {
    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;

    @Column(name = "contract_id")
    private long contract_id;
    @Column(name = "date")
    private Date date;
    @Column(name="po")
    private String po;
    @Column(name="employerexpenserate")
    private Float employerexpenserate;
    @Column(name="terms")
    private Integer terms;
    @Column(name="timecard")
    private Boolean timecard;
    @Column(name="notes")
    private String notes;
    @Column(name="period_start")
    private Date period_start;
    @Column(name="period_end")
    private Date period_end;
    @Column(name="posted")
    private Boolean posted;
    @Column(name="cleared")
    private Boolean cleared;
    @Column(name = "cleared_date")
    private Date cleared_date;
    @Column(name="prcleared")
    private Boolean prcleared;
    @Column(name="timecard_receipt_sent")
    private Boolean timecard_receipt_sent;
    @Column(name="message")
    private String message;
    @Column(name = "amount")
    private Float amount;
    @Column(name="voided")
    private Boolean voided;
    @Column(name="token")
    private String token;
    @Column(name="view_count")
    private Integer view_count;
    @Column(name="mock")
    private Boolean mock;

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
    @JoinColumn(name = "contract_id", nullable = false, insertable = false, updatable = false)
    private Contract contract;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public long getContract_id() {
        return contract_id;
    }

    public void setContract_id(long contract_id) {
        this.contract_id = contract_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public Float getEmployerexpenserate() {
        return employerexpenserate;
    }

    public void setEmployerexpenserate(Float employerexpenserate) {
        this.employerexpenserate = employerexpenserate;
    }

    public Integer getTerms() {
        return terms;
    }

    public void setTerms(Integer terms) {
        this.terms = terms;
    }

    public Boolean getTimecard() {
        return timecard;
    }

    public void setTimecard(Boolean timecard) {
        this.timecard = timecard;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getPeriod_start() {
        return period_start;
    }

    public void setPeriod_start(Date period_start) {
        this.period_start = period_start;
    }

    public Date getPeriod_end() {
        return period_end;
    }

    public void setPeriod_end(Date period_end) {
        this.period_end = period_end;
    }

    public Boolean getPosted() {
        return posted;
    }

    public void setPosted(Boolean posted) {
        this.posted = posted;
    }

    public Boolean getCleared() {
        return cleared;
    }

    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }

    public Date getCleared_date() {
        return cleared_date;
    }

    public void setCleared_date(Date cleared_date) {
        this.cleared_date = cleared_date;
    }

    public Boolean getPrcleared() {
        return prcleared;
    }

    public void setPrcleared(Boolean prcleared) {
        this.prcleared = prcleared;
    }

    public Boolean getTimecard_receipt_sent() {
        return timecard_receipt_sent;
    }

    public void setTimecard_receipt_sent(Boolean timecard_receipt_sent) {
        this.timecard_receipt_sent = timecard_receipt_sent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Boolean getMock() {
        return mock;
    }

    public void setMock(Boolean mock) {
        this.mock = mock;
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

    public Invoice(long id, long contract_id, Date date, String po, Float employerexpenserate, Integer terms, Boolean timecard, String notes, Date period_start, Date period_end, Boolean posted, Boolean cleared, Date cleared_date, Boolean prcleared, Boolean timecard_receipt_sent, String message, Float amount, Boolean voided, String token, Integer view_count, Boolean mock, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {

        this.id = id;
        this.contract_id = contract_id;
        this.date = date;
        this.po = po;
        this.employerexpenserate = employerexpenserate;
        this.terms = terms;
        this.timecard = timecard;
        this.notes = notes;
        this.period_start = period_start;
        this.period_end = period_end;
        this.posted = posted;
        this.cleared = cleared;
        this.cleared_date = cleared_date;
        this.prcleared = prcleared;
        this.timecard_receipt_sent = timecard_receipt_sent;
        this.message = message;
        this.amount = amount;
        this.voided = voided;
        this.token = token;
        this.view_count = view_count;
        this.mock = mock;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user_id = created_user_id;
        this.modified_user_id = modified_user_id;
        this.last_sync_time = last_sync_time;
    }

    public Invoice() {
        super();
    }
}
