package org.openmrs.module.hr;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class HrCompetency  implements java.io.Serializable {


    // Fields    

     private int competencyId;
     private Integer nationalId;
     private String name;
     private String subname;
     private String levels;
     private int creator;
     private Date dateCreated;
     private Integer changedBy;
     private Date dateChanged;
     private short retired;
     private Integer retiredBy;
     private Date dateRetired;
     private String retireReason;
     private String editPrivilege;
     private String uuid;
     private Double sortWeight;
    // private Set hrTrainingCompetencies = new HashSet(0);
     private Set hrEvaluations = new HashSet(0);


    // Constructors

    /** default constructor */
    public HrCompetency() {
    }

	/** minimal constructor */
    public HrCompetency(int competencyId, String name, String subname, String levels, int creator, Date dateCreated, short retired, String uuid) {
        this.competencyId = competencyId;
        this.name = name;
        this.subname = subname;
        this.levels = levels;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.retired = retired;
        this.uuid = uuid;
    }
    
    /** full constructor */
    public HrCompetency(int competencyId, Integer nationalId, String name, String subname, String levels, int creator, Date dateCreated, Integer changedBy, Date dateChanged, short retired, Integer retiredBy, Date dateRetired, String retireReason, String editPrivilege, String uuid, Double sortWeight, Set hrTrainingCompetencies, Set hrEvaluations) {
        this.competencyId = competencyId;
        this.nationalId = nationalId;
        this.name = name;
        this.subname = subname;
        this.levels = levels;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.changedBy = changedBy;
        this.dateChanged = dateChanged;
        this.retired = retired;
        this.retiredBy = retiredBy;
        this.dateRetired = dateRetired;
        this.retireReason = retireReason;
        this.editPrivilege = editPrivilege;
        this.uuid = uuid;
        this.sortWeight = sortWeight;
     //   this.hrTrainingCompetencies = hrTrainingCompetencies;
        this.hrEvaluations = hrEvaluations;
    }
    

   
    // Property accessors

    public int getCompetencyId() {
        return this.competencyId;
    }
    
    public void setCompetencyId(int competencyId) {
        this.competencyId = competencyId;
    }

    public Integer getNationalId() {
        return this.nationalId;
    }
    
    public void setNationalId(Integer nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return this.subname;
    }
    
    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getLevels() {
        return this.levels;
    }
    
    public void setLevels(String levels) {
        this.levels = levels;
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

    public short getRetired() {
        return this.retired;
    }
    
    public void setRetired(short retired) {
        this.retired = retired;
    }

    public Integer getRetiredBy() {
        return this.retiredBy;
    }
    
    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }

    public Date getDateRetired() {
        return this.dateRetired;
    }
    
    public void setDateRetired(Date dateRetired) {
        this.dateRetired = dateRetired;
    }

    public String getRetireReason() {
        return this.retireReason;
    }
    
    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }

    public String getEditPrivilege() {
        return this.editPrivilege;
    }
    
    public void setEditPrivilege(String editPrivilege) {
        this.editPrivilege = editPrivilege;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Double getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Double sortWeight) {
        this.sortWeight = sortWeight;
    }

   /* public Set getHrTrainingCompetencies() {
        return this.hrTrainingCompetencies;
    }
    
    public void setHrTrainingCompetencies(Set hrTrainingCompetencies) {
        this.hrTrainingCompetencies = hrTrainingCompetencies;
    }*/

    public Set getHrEvaluations() {
        return this.hrEvaluations;
    }
    
    public void setHrEvaluations(Set hrEvaluations) {
        this.hrEvaluations = hrEvaluations;
    }
   








}