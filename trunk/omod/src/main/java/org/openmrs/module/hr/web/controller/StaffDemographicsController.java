package org.openmrs.module.hr.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Person;
import org.openmrs.api.context.Context;
import org.openmrs.module.hr.HRService;
import org.openmrs.module.hr.HrStaff;
import org.openmrs.module.hr.HrStaffAttribute;
import org.openmrs.module.hr.HrStaffAttributeType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"staff","AttributeToDisplay"})
public class StaffDemographicsController {
	/** Logger for this class and subclasses */
	protected static final Log log = LogFactory.getLog(StaffController.class);
	
	private final String SUCCESS_VIEW = "/module/hr/manager/staffDemographics";
	
	@RequestMapping(value = "module/hr/manager/staffDemographics.htm",method = RequestMethod.GET)
	public String showPage(ModelMap model,@RequestParam(required=false,value="staffId") Integer staffId){
		HRService hrService=Context.getService(HRService.class);
		if(staffId!=null){
		model.addAttribute("staff",hrService.getStaffById(staffId));
		String property=Context.getAdministrationService().getGlobalProperty("HR.Staff_Attribute_to_display");
		HrStaffAttribute AttributeToDisplay=null;
		HrStaffAttributeType sat=null;
		if(property!=null)
		{
			sat=hrService.getStaffAttributeTypeByName(property);
			if(sat!=null){
			AttributeToDisplay=hrService.getStaffById(staffId).getAttribute(sat);
			}
		}
		if(sat!=null && AttributeToDisplay!=null)
		model.addAttribute("AttributeToDisplay",sat.getName()+":"+AttributeToDisplay.getValue());
		}
		return SUCCESS_VIEW;
	}
}