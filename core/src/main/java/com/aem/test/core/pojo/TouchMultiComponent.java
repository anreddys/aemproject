package com.aem.test.core.pojo;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.commons.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.test.core.bean.TouchMultiFieldBean;

public class TouchMultiComponent extends WCMUsePojo{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TouchMultiComponent.class);
	private List<TouchMultiFieldBean> submenuItems = new ArrayList<TouchMultiFieldBean>();
	  
	@Override
	public void activate() throws Exception {
	setMultiFieldItems();
	}
	  
	/**
	* Method to get Multi field data
	* @return submenuItems
	*/
	private List<TouchMultiFieldBean> setMultiFieldItems() {
	  
	@SuppressWarnings("deprecation")
	JSONObject jObj;
	try{
	String[] itemsProps = getProperties().get("myUserSubmenu", String[].class);
	 
	if (itemsProps == null) {
	     
	   // Logger.info("PROPS IS NULL") ; 
	}
	 
	 
	if (itemsProps != null) {
	for (int i = 0; i < itemsProps.length; i++) {
	  
	jObj = new JSONObject(itemsProps[i]);
	TouchMultiFieldBean menuItem = new TouchMultiFieldBean();	  
	String title = jObj.getString("title");
	String link = jObj.getString("link");
	String flag = jObj.getString("flag");
	  
	menuItem.setTitle(title);
	menuItem.setLink(link);
	menuItem.setFlag(flag);
	submenuItems.add(menuItem);
	}
	}
	}catch(Exception e){
	LOGGER.error("Exception while Multifield data {}", e.getMessage(), e);
	}
	return submenuItems;
	}
	  
	public List<TouchMultiFieldBean> getMultiFieldItems() {
	return submenuItems;
	}

}
