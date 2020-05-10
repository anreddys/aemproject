package com.aem.test.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aem.test.core.service.PageService;
import com.aem.test.core.serviceimpl.CreateSamplePage;
import com.aem.test.core.serviceimpl.PageServiceImp;

@Model(adaptables=Resource.class)
public class CreationPage {
	
	private static Logger log = LoggerFactory.getLogger(CreationPage.class);	   
   
	@OSGiService
    private PageService ps;
	//private CreateSamplePage ps;
   
    private String message;

    @PostConstruct
    protected void init() {
       
      message += "\tNew Page name is: " + ps.CreatePage("AEM_PAGE") + "\n";
    	// message += "\tNew Page name is: " + ((PageService) ps).CreatePage("CreateSamplePage") + "\n";
        log.info("message ********"+message);
    }

    public String getMessage() {
        return message;
    }


}
