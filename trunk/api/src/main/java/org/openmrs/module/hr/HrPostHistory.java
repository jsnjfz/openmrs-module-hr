package org.openmrs.module.hr;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class HrPostHistory  implements java.io.Serializable {


    // Fields    

     private int postHistoryId;
     private HrPost hrPost;
     private int staffId;
     private Date startDate;
     private Date endDate;
     private String endReason;
     private String endReasonOther;
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
     private Set hrLeaves = new HashSet(0);


    // Constructors

    /** default constructor */
    public HrPostHistory() {
    }

	/** minimal constructor */
    public HrPostHistory(int postHistoryId, HrPost hrPost, int staffId, Date startDate, int creator, Date dateCreated, short voided, String uuid) {
        this.postHistoryId = postHistoryId;
        this.hrPost = hrPost;
        this.staffId = staffId;
        this.startDate = startDate;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.voided = voided;
        this.uuid = uuid;
    }
    
    /** full constructor */
    public HrPostHistory(int postHistoryId, HrPost hrPost, int staffId, Date startDate, Date endDate, String endReason, String endReasonOther, int creator, Date dateCreated, Integer changedBy, Date dateChanged, short voided, Integer voidedBy, Date dateVoided, String voidReason, String uuid, Set hrAssignments, Set hrLeaves) {
        this.postHistoryId = postHistoryId;
        this.hrPost = hrPost;
        this.staffId = staffId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.endReason = endReason;
        this.endReasonOther = endReasonOther;
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
        this.hrLeaves = hrLeaves;
    }
    

   
    // Property accessors

    public int getPostHistoryId() {
        return this.postHistoryId;
    }
    
    public void setPostHistoryId(int postHistoryId) {
        this.postHistoryId = postHistoryId;
    }

    public HrPost getHrPost() {
        return this.hrPost;
    }
    
    public void setHrPost(HrPost hrPost) {
        this.hrPost = hrPost;
    }

    public int getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEndReason() {
        return this.endReason;
    }
    
    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public String getEndReasonOther() {
        return this.endReasonOther;
    }
    
    public void setEndReasonOther(String endReasonOther) {
        this.endReasonOther = endReasonOther;
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

    public Set getHrLeaves() {
        return this.hrLeaves;
    }
    
    public void setHrLeaves(Set hrLeaves) {
        this.hrLeaves = hrLeaves;
    }
   








}