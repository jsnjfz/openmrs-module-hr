package org.openmrs.module.hr;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class HrStaff  implements java.io.Serializable {


    // Fields    

     private int staffId;
     private Integer staffStatus;
     private Date initialHireDate;
     private int creator;
     private Date dateCreated;
     private Integer changedBy;
     private Date dateChanged;
     private short voided;
     private Integer voidedBy;
     private Date dateVoided;
     private String voidReason;
     private String uuid;
     private Set hrAssignments = new HashSet(0);
     private Set hrStaffNotes = new HashSet(0);
     private Set hrStaffAttributes = new HashSet(0);
     private Set hrEducations = new HashSet(0);
     private Set hrEvaluations = new HashSet(0);
     private Set hrStaffCerts = new HashSet(0);
     private Set hrPostHistories = new HashSet(0);


    // Constructors

    /** default constructor */
    public HrStaff() {
    }

	/** minimal constructor */
    public HrStaff(int staffId, int creator, short voided, String uuid) {
        this.staffId = staffId;
        this.creator = creator;
        this.voided = voided;
        this.uuid = uuid;
    }
    
    /** full constructor */
    public HrStaff(int staffId, Integer staffStatus, Date initialHireDate, int creator, Date dateCreated, Integer changedBy, Date dateChanged, short voided, Integer voidedBy, Date dateVoided, String voidReason, String uuid, Set hrAssignments, Set hrStaffNotes, Set hrStaffAttributes, Set hrEducations, Set hrEvaluations, Set hrStaffCerts, Set hrPostHistories) {
        this.staffId = staffId;
        this.staffStatus = staffStatus;
        this.initialHireDate = initialHireDate;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.changedBy = changedBy;
        this.dateChanged = dateChanged;
        this.voided = voided;
        this.voidedBy = voidedBy;
        this.dateVoided = dateVoided;
        this.voidReason = voidReason;
        this.uuid = uuid;
        this.hrAssignments = hrAssignments;
        this.hrStaffNotes = hrStaffNotes;
        this.hrStaffAttributes = hrStaffAttributes;
        this.hrEducations = hrEducations;
        this.hrEvaluations = hrEvaluations;
        this.hrStaffCerts = hrStaffCerts;
        this.hrPostHistories = hrPostHistories;
    }
    

   
    // Property accessors

    public int getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffStatus() {
        return this.staffStatus;
    }
    
    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }

    public Date getInitialHireDate() {
        return this.initialHireDate;
    }
    
    public void setInitialHireDate(Date initialHireDate) {
        this.initialHireDate = initialHireDate;
    }

    public int getCreator() {
        return this.creator;
    }
    
    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getChangedBy() {
        return this.changedBy;
    }
    
    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Date getDateChanged() {
        return this.dateChanged;
    }
    
    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public short getVoided() {
        return this.voided;
    }
    
    public void setVoided(short voided) {
        this.voided = voided;
    }

    public Integer getVoidedBy() {
        return this.voidedBy;
    }
    
    public void setVoidedBy(Integer voidedBy) {
        this.voidedBy = voidedBy;
    }

    public Date getDateVoided() {
        return this.dateVoided;
    }
    
    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return this.voidReason;
    }
    
    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Set getHrAssignments() {
        return this.hrAssignments;
    }
    
    public void setHrAssignments(Set hrAssignments) {
        this.hrAssignments = hrAssignments;
    }

     public Set getHrStaffNotes() {
        return this.hrStaffNotes;
    }
    
    public void setHrStaffNotes(Set hrStaffNotes) {
        this.hrStaffNotes = hrStaffNotes;
    }

    public Set getHrStaffAttributes() {
        return this.hrStaffAttributes;
    }
    
    public void setHrStaffAttributes(Set hrStaffAttributes) {
        this.hrStaffAttributes = hrStaffAttributes;
    }

    public Set getHrEducations() {
        return this.hrEducations;
    }
    
    public void setHrEducations(Set hrEducations) {
        this.hrEducations = hrEducations;
    }

    public Set getHrEvaluations() {
        return this.hrEvaluations;
    }
    
    public void setHrEvaluations(Set hrEvaluations) {
        this.hrEvaluations = hrEvaluations;
    }

    public Set getHrStaffCerts() {
        return this.hrStaffCerts;
    }
    
    public void setHrStaffCerts(Set hrStaffCerts) {
        this.hrStaffCerts = hrStaffCerts;
    }

    public Set getHrPostHistories() {
        return this.hrPostHistories;
    }
    
    public void setHrPostHistories(Set hrPostHistories) {
        this.hrPostHistories = hrPostHistories;
    }
   








}
