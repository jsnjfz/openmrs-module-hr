package org.openmrs.module.hr.web.controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.ConceptAnswer;
import org.openmrs.Location;
import org.openmrs.LocationTag;
import org.openmrs.api.ConceptService;
import org.openmrs.api.LocationService;
import org.openmrs.api.context.Context;
import org.openmrs.module.hr.HRManagerService;
import org.openmrs.module.hr.HRService;
import org.openmrs.module.hr.HrAssignment;
import org.openmrs.module.hr.HrPost;
import org.openmrs.module.hr.HrPostHistory;
import org.openmrs.module.hr.HrStaff;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("staff")
public class PostHistoryController {
	/** Logger for this class and subclasses */
	protected static final Log log = LogFactory.getLog(StaffController.class);
	
	private final String SUCCESS_FORM_VIEW = "/module/hr/manager/postHistory";
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		NumberFormat nf = NumberFormat.getInstance(Context.getLocale());
		binder.registerCustomEditor(java.lang.Integer.class, new CustomNumberEditor(java.lang.Integer.class, nf, true));
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(Context.getDateFormat(), true, 10));
	}
	
	@RequestMapping(value = "module/hr/manager/postHistory.form",method = RequestMethod.GET)
	@ModelAttribute("postHistory")
	public HrPostHistory showList(ModelMap model,@RequestParam(required=false,value="alllocations") boolean includeAllLocations,@RequestParam(required=false,value="addprev") boolean addprev,@RequestParam(required=false,value="postHistoryId") Integer postHistoryId,@ModelAttribute("staff") HrStaff staff){
		return prepareModel(postHistoryId,model,staff,addprev,includeAllLocations);
		
	}
	private HrPostHistory prepareModel(Integer postHistoryId,ModelMap model,HrStaff staff,boolean addprev,boolean includeAllLocations){
		HRManagerService hrManagerService=Context.getService(HRManagerService.class);
		ConceptService cs=Context.getConceptService();
		HrPostHistory postHistory;
		if(postHistoryId==null||postHistoryId==0){
		LocationService locService=Context.getLocationService();
		List<Location> locationList=new ArrayList<Location>();
		if(!includeAllLocations){
		LocationTag HrManagedLocations=locService.getLocationTagByName("HR Managed");
		if(HrManagedLocations!=null){
			locationList=locService.getLocationsByTag(HrManagedLocations);
		}
		}
		else {
			locationList=locService.getAllLocations();
		}
		model.addAttribute("locationList",locationList);
		if(addprev==false){
		model.addAttribute("createNew",true);
		List<HrPost> postList=hrManagerService.getOpenPostByJobTitle();
		model.addAttribute("postList",postList);
		}
		else
		{
			model.addAttribute("addprev",true);
			List<HrPost> postList=hrManagerService.getPostsByJobTitle();
			model.addAttribute("postList",postList);
			
		}
		postHistory=new HrPostHistory();
		}
		else {
			postHistory=hrManagerService.getPostHistoryById(postHistoryId);
		}
		Concept endReason=cs.getConceptByMapping("Post history end reason","HR Module");
		Collection<ConceptAnswer> postHistoryEndReasons;
		if(endReason!=null)
			postHistoryEndReasons=endReason.getAnswers();
		else {
			postHistoryEndReasons=new ArrayList<ConceptAnswer>();
		}
		model.addAttribute("EndReasons",postHistoryEndReasons);
		return postHistory;
		
	}
}
