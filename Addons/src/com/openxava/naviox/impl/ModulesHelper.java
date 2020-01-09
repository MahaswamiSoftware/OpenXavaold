package com.openxava.naviox.impl;

import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.openxava.application.meta.*;
import org.openxava.util.*;

import com.openxava.naviox.*;
import com.openxava.naviox.model.*;
import com.openxava.naviox.util.*;

/**
 * 
 * @author Javier Paniza
 */

public class ModulesHelper { 
	
	private static List<MetaModule> all;
	
	public static void init(String applicationName) {
	}
	
	public static String getCurrent(HttpServletRequest request) {
		return null;
	}
	
	/** @since 5.6 */
	public static String getUserAccessModule(ServletRequest request) { 
		return "SignIn";
	}
	
	public static List<MetaModule> getAll() {
		if (Users.getCurrent() == null) return Collections.EMPTY_LIST;
		if (all == null) all = createAll();
		return all;
	}

	private static List<MetaModule> createAll() {
		List<MetaModule> result = new ArrayList<MetaModule>();
		for (MetaModule module: MetaModuleFactory.createAll()) {
			if (module.getName().equals("SignIn")) continue;
			if (module.getName().equals("DiscussionComment")) continue;  
			result.add(module);
		}
		return result;
	}
	
	public static boolean isPublic(HttpServletRequest request, String moduleName) { 
		return "FirstSteps".equals(moduleName); 
	}
	
	public static boolean showsIndexLink() { 
		return false;
	}	

	public static boolean showsSearchModules(HttpServletRequest request) { 
		Modules modules = (Modules) request.getSession().getAttribute("modules");
		return modules.getAll().size() > 30;  
	}	

}
