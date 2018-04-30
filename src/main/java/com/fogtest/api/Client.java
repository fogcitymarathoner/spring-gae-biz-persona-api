package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="street1")
    private String street1;
    @Column(name="street2")
    private String street2;
    @Column(name="city")
    private String city;
    @Column(name="state_id")
    private long state_id;
    @Column(name="zip")
    private String zip;
    @Column(name="active")
    private Boolean active;
    @Column(name="terms")
    private int terms;
    @Column(name="hq")
    private Boolean hq;
    @Column(name="created_date")
    private Date created_date;
    @Column(name="modified_date")
    private Date modified_date;
    @Column(name="created_user")
    private long created_user;
    @Column(name="last_sync_time")
    private Date last_sync_time;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "client")
    private Set<Contract> contracts = new HashSet<>();

    public Client() {
        super();
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Client(long id,
                  String name,
                  String street1,
                  String street2,
                  String city,
                  long state_id,
                  String zip,
                  Boolean active,
                  int terms,
                  Boolean hq,
                  Date created_date,
                  Date modified_date,
                  long created_user,
                  Date last_sync_time) {
        this.id = id;
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state_id = state_id;
        this.zip = zip;
        this.active = active;
        this.terms = terms;
        this.hq = hq;
        this.created_date = created_date;
        this.modified_date = modified_date;
        this.created_user = created_user;
        this.last_sync_time = last_sync_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getState_id() {
        return state_id;
    }

    public void setState_id(long state_id) {
        this.state_id = state_id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public Boolean getHq() {
        return hq;
    }

    public void setHq(Boolean hq) {
        this.hq = hq;
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

    public long getCreated_user() {
        return created_user;
    }

    public void setCreated_user(long created_user) {
        this.created_user = created_user;
    }

    public Date getLast_sync_time() {
        return last_sync_time;
    }

    public void setLast_sync_time(Date last_sync_time) {
        this.last_sync_time = last_sync_time;
    }
}
