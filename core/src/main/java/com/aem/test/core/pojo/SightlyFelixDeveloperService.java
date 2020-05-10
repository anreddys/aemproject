package com.aem.test.core.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.test.core.service.SightlyFelixServicInterface;
import com.aem.test.core.service.SightlyServiceInterface;

public class SightlyFelixDeveloperService extends WCMUsePojo {

	
	Logger logger = LoggerFactory.getLogger(SightlyFelixDeveloperService.class);
//	@Override
	
	protected String details;
	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
				
       logger.info("inside activate method of Developer use pojo");	
		
       SightlyFelixServicInterface SightlyFelixServiceInterface=  getSlingScriptHelper().getService(SightlyFelixServicInterface.class);
		    details = SightlyFelixServiceInterface.getEmployeeData();
		
	}
	
}
