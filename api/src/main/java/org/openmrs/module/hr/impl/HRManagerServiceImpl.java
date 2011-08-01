package org.openmrs.module.hr.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.hr.HRManagerService;
import org.openmrs.module.hr.HrAssignment;
import org.openmrs.module.hr.HrPost;
import org.openmrs.module.hr.HrPostHistory;
import org.openmrs.module.hr.HrStaff;
import org.openmrs.module.hr.db.HRDAO;

public class HRManagerServiceImpl implements HRManagerService{
	private Log log = LogFactory.getLog(getClass());
	private HRDAO dao;
	public void setDao(HRDAO dao)
	{
		this.dao = dao;
	}
	public List<HrPostHistory> getPostHistoriesForStaff(HrStaff staff) {
		return dao.getPostHistoriesForStaff(staff);
	}
	public HrAssignment getAssignmentById( int id){
	    return dao.getAssignmentById(id);
	}
	public HrPostHistory getPostHistoryById(int id) {
		return dao.getPostHistoryById(id);
	}
	public HrPostHistory getCurrentPostForStaff(int staffId){
		return dao.getCurrentPostForStaff(staffId);
	}
	public List<HrPost> getOpenPostByJobTitle(){
		return dao.getOpenPostByJobTitle();
	}
	public List<HrPost> getPostsByJobTitle(){
		return dao.getPostsByJobTitle();
	}
}
