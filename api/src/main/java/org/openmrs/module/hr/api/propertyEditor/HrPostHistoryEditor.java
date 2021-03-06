package org.openmrs.module.hr.api.propertyEditor;

import java.beans.PropertyEditorSupport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.hr.HrPostHistory;
import org.openmrs.module.hr.api.HRPostService;
import org.springframework.util.StringUtils;

public class HrPostHistoryEditor extends PropertyEditorSupport{
	private Log log = LogFactory.getLog(this.getClass());
	
	public HrPostHistoryEditor(){
		
	}
	public void setAsText(String text) throws IllegalArgumentException {
		HRPostService hrPostService=Context.getService(HRPostService.class);
		if (StringUtils.hasText(text)) {
			try {
				setValue(hrPostService.getPostHistoryById(Integer.valueOf(text)));
			}
			catch (Exception ex) {
				log.error("Error setting text" + text, ex);
				throw new IllegalArgumentException("post not found: " + ex.getMessage());
			}
		} else {
			setValue(null);
		}
	}
	
	public String getAsText() {
		HrPostHistory postHistory = (HrPostHistory) getValue();
		if (postHistory == null) {
			return "";
		} else {
			return postHistory.getId().toString();
		}
	}
}
