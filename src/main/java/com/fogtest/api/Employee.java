package com.fogtest.api;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue
    private long id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
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
    @Column(name="bankaccountnumber")
    private String bankaccountnumber;
    @Column(name="bankaccounttype")
    private String bankaccounttype;
    @Column(name="bankname")
    private String bankname;
    @Column(name="bankroutingnumber")
    private String bankroutingnumber;
    @Column(name="directdeposit")
    private Boolean directdeposit;
    @Column(name="allowancefederal")
    private Integer allowancefederal;
    @Column(name="allowancestate")
    private Integer allowancestate;
    @Column(name="extradeductionsfederal")
    private Integer extradeductionsfederal;
    @Column(name="extradeductionsstate")
    private Integer extradeductionsstate;
    @Column(name="maritalstatusfed")
    private String maritalstatusfed;
    @Column(name="maritalstatusstate")
    private String maritalstatusstate;
    @Column(name="usworkstatus")
    private String usworkstatus;
    @Column(name="notes")
    private String notes;
    @Column(name="ssn")
    private String ssn;
    @Column(name="tcard")
    private Boolean tcard;
    @Column(name="voided")
    private Boolean voided;
    @Column(name="w4")
    private Boolean w4;
    @Column(name="de34")
    private Boolean de34;
    @Column(name="i9")
    private Boolean i9;
    @Column(name="medical")
    private Boolean medical;
    @Column(name="indust")
    private Boolean indust;
    @Column(name="info")
    private Boolean info;
    @Column(name="phone")
    private String phone;
    @Column(name="dob")
    private Date dob;
    @Column(name="startdate")
    private Date startdate;
    @Column(name="enddate")
    private Date enddate;
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

    public Employee() {
        super();
    }

    public Employee(long id, String firstname, String lastname, String street1, String street2, String city, long state_id, String zip, Boolean active, String bankaccountnumber, String bankaccounttype, String bankname, String bankroutingnumber, Boolean directdeposit, Integer allowancefederal, Integer allowancestate, Integer extradeductionsfederal, Integer extradeductionsstate, String maritalstatusfed, String maritalstatusstate, String usworkstatus, String notes, String ssn, Boolean tcard, Boolean voided, Boolean w4, Boolean de34, Boolean i9, Boolean medical, Boolean indust, Boolean info, String phone, Date dob, Date startdate, Date enddate, Date created_date, Date modified_date, long created_user_id, long modified_user_id, Date last_sync_time) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state_id = state_id;
        this.zip = zip;
        this.active = active;
        this.bankaccountnumber = bankaccountnumber;
        this.bankaccounttype = bankaccounttype;
        this.bankname = bankname;
        this.bankroutingnumber = bankroutingnumber;
        this.directdeposit = directdeposit;
        this.allowancefederal = allowancefederal;
        this.allowancestate = allowancestate;
        this.extradeductionsfederal = extradeductionsfederal;
        this.extradeductionsstate = extradeductionsstate;
        this.maritalstatusfed = maritalstatusfed;
        this.maritalstatusstate = maritalstatusstate;
        this.usworkstatus = usworkstatus;
        this.notes = notes;
        this.ssn = ssn;
        this.tcard = tcard;
        this.voided = voided;
        this.w4 = w4;
        this.de34 = de34;
        this.i9 = i9;
        this.medical = medical;
        this.indust = indust;
        this.info = info;
        this.phone = phone;
        this.dob = dob;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getBankaccountnumber() {
        return bankaccountnumber;
    }

    public void setBankaccountnumber(String bankaccountnumber) {
        this.bankaccountnumber = bankaccountnumber;
    }

    public String getBankaccounttype() {
        return bankaccounttype;
    }

    public void setBankaccounttype(String bankaccounttype) {
        this.bankaccounttype = bankaccounttype;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccountroutingnumber() {
        return bankroutingnumber;
    }

    public void setBankaccountroutingnumber(String bankroutingnumber) {
        this.bankroutingnumber = bankroutingnumber;
    }

    public Boolean getDirectdeposit() {
        return directdeposit;
    }

    public void setDirectdeposit(Boolean directdeposit) {
        this.directdeposit = directdeposit;
    }

    public Integer getAllowancefederal() {
        return allowancefederal;
    }

    public void setAllowancefederal(Integer allowancefederal) {
        this.allowancefederal = allowancefederal;
    }

    public Integer getAllowancestate() {
        return allowancestate;
    }

    public void setAllowancestate(Integer allowancestate) {
        this.allowancestate = allowancestate;
    }

    public Integer getExtradeductionsfederal() {
        return extradeductionsfederal;
    }

    public void setExtradeductionsfederal(Integer extradeductionsfederal) {
        this.extradeductionsfederal = extradeductionsfederal;
    }

    public Integer getExtradeductionsstate() {
        return extradeductionsstate;
    }

    public void setExtradeductionsstate(Integer extradeductionsstate) {
        this.extradeductionsstate = extradeductionsstate;
    }

    public String getMaritalstatusfed() {
        return maritalstatusfed;
    }

    public void setMaritalstatusfed(String maritalstatusfed) {
        this.maritalstatusfed = maritalstatusfed;
    }

    public String getMaritalstatusstate() {
        return maritalstatusstate;
    }

    public void setMaritalstatusstate(String maritalstatusstate) {
        this.maritalstatusstate = maritalstatusstate;
    }

    public String getUsworkstatus() {
        return usworkstatus;
    }

    public void setUsworkstatus(String usworkstatus) {
        this.usworkstatus = usworkstatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Boolean getTcard() {
        return tcard;
    }

    public void setTcard(Boolean tcard) {
        this.tcard = tcard;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public Boolean getW4() {
        return w4;
    }

    public void setW4(Boolean w4) {
        this.w4 = w4;
    }

    public Boolean getDe34() {
        return de34;
    }

    public void setDe34(Boolean de34) {
        this.de34 = de34;
    }

    public Boolean getI9() {
        return i9;
    }

    public void setI9(Boolean i9) {
        this.i9 = i9;
    }

    public Boolean getMedical() {
        return medical;
    }

    public void setMedical(Boolean medical) {
        this.medical = medical;
    }

    public Boolean getIndust() {
        return indust;
    }

    public void setIndust(Boolean indust) {
        this.indust = indust;
    }

    public Boolean getInfo() {
        return info;
    }

    public void setInfo(Boolean info) {
        this.info = info;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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
