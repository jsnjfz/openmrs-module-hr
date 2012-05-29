package org.openmrs.module.hr.api;

import org.openmrs.annotation.Authorized;
import org.openmrs.module.hr.HrIscoCodes;
import org.openmrs.module.hr.HrJobTitle;
import org.openmrs.module.hr.HrPost;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface HRPostService {

    @Authorized("Manage Job Titles")
    public List<HrJobTitle> getAllJobTitles();

    @Authorized("Manage Job Titles")
    public void saveJobTitle(HrJobTitle jobTitle);

    @Authorized("Manage Posts")
    public HrPost savePost(HrPost post);

    @Authorized("View Posts")
    public List<HrPost> getAllPosts(boolean includeAllPosts,boolean includeAllLocations);

    @Authorized("Manage Job Titles")
    public void retireJobTitle(HrJobTitle jobTitle,String retireReason);

    @Authorized("Manage Job Titles")
    public void unretireJobTitle(HrJobTitle jobTitle);

    @Authorized("Manage Job Titles")
    public HrJobTitle getJobTitleById( int id);

    @Authorized("Manage Job Titles")
    public List<HrIscoCodes> getAllIscoCodes();

    @Authorized("Manage Job Titles")
	public HrIscoCodes getIscoCodeById( String id) ;


    public String getMostRecentIncumbentForPostbyId(int id);

    @Authorized("View Posts")
    public HrPost getPostById( int id);

    @Authorized("Manage Posts")
	public void retirePost(HrPost post,String reitreReason);

    @Authorized("Manage Posts")
	public void unretirePost(HrPost post);

	public Map<String,Object> getCurrentJobLocationForStaff(int id);

}
