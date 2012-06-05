package org.openmrs.module.hr.api.impl;

import org.openmrs.module.hr.*;
import org.openmrs.module.hr.api.HRPostService;
import org.openmrs.module.hr.api.db.HRISCOCodeDAO;
import org.openmrs.module.hr.api.db.HRJobTitleDAO;
import org.openmrs.module.hr.api.db.HRPostDAO;
import org.openmrs.module.hr.api.db.HRPostHistoryDAO;

import java.util.List;
import java.util.Map;

public class HRPostServiceImpl implements HRPostService {

    HRISCOCodeDAO hriscoCodeDAO;
    HRJobTitleDAO hrJobTitleDAO;
    HRPostDAO hrPostDAO;
    HRPostHistoryDAO hrPostHistoryDAO;

    public void setHrPostHistoryDAO(HRPostHistoryDAO hrPostHistoryDAO) {
        this.hrPostHistoryDAO = hrPostHistoryDAO;
    }

    public void setHrPostDAO(HRPostDAO hrPostDAO) {
        this.hrPostDAO = hrPostDAO;
    }

    public void setHrJobTitleDAO(HRJobTitleDAO hrJobTitleDAO) {
        this.hrJobTitleDAO = hrJobTitleDAO;
    }

    public void setHriscoCodeDAO(HRISCOCodeDAO hriscoCodeDAO) {
        this.hriscoCodeDAO = hriscoCodeDAO;
    }

    public List<HrJobTitle> getAllJobTitles() {
		List<HrJobTitle> list=hrJobTitleDAO.getAllJobTitles();
		return list;
	}
	public void saveJobTitle(HrJobTitle jobTitle) {
		hrJobTitleDAO.saveJobTitle(jobTitle);

	}

    public HrPost savePost(HrPost post) {
		return hrPostDAO.savePost(post);
	}

    public List<HrPost> getAllPosts(boolean includeAllPosts,boolean includeAllLocations) {
		List<HrPost> list=hrPostDAO.getAllPosts(includeAllPosts,includeAllLocations);
		return list;
	}

    public void retireJobTitle(HrJobTitle jobTitle,String retireReason){
		hrJobTitleDAO.saveJobTitle(jobTitle);
	}
	public void unretireJobTitle(HrJobTitle jobTitle) {
		hrJobTitleDAO.saveJobTitle(jobTitle);
	}
	public HrJobTitle getJobTitleById( int id)
	{
		return hrJobTitleDAO.getJobTitleById(id);
	}

    public List<HrIscoCodes> getAllIscoCodes() {
		return hriscoCodeDAO.getAllIscoCodes();
	}
	public HrIscoCodes getIscoCodeById( String id) {
		return hriscoCodeDAO.getIscoCodeById(id);
	}

    public String getMostRecentIncumbentForPostbyId(int id){
		return hrPostDAO.getMostRecentIncumbentForPostbyId(id);
	}

    public HrPost getPostById( int id) {
		return hrPostDAO.getPostById(id);
	}
	public void retirePost(HrPost post,String reitreReason){
		hrPostDAO.savePost(post);
	}
	public void unretirePost(HrPost post){
		hrPostDAO.savePost(post);
	}

    public Map<String,Object> getCurrentJobLocationForStaff(int id){
		return hrPostDAO.getCurrentJobLocationForStaff(id);
	}

    public List<HrPostHistory> getPostHistoriesForStaff(HrStaff staff) {
		return hrPostHistoryDAO.getPostHistoriesForStaff(staff);
	}

    public HrPostHistory getPostHistoryById(int id) {
		return hrPostHistoryDAO.getPostHistoryById(id);
	}

    public HrPostHistory getCurrentPostForStaff(int staffId){
		return hrPostHistoryDAO.getCurrentPostForStaff(staffId);
	}

    public void savePostHistory(HrPostHistory postHistory){
		hrPostHistoryDAO.savePostHistory(postHistory);
	}
}
