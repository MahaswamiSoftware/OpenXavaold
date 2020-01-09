package org.openxava.test.actions;

import java.util.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;

import org.openxava.actions.*;
import org.openxava.jpa.*;
import org.openxava.model.*;
import org.openxava.test.model.*;
import org.openxava.util.*;
import org.openxava.validators.*;

/**
 * Report of products of the selected subfamily. <p>
 * 
 * Uses JasperReports. <br>
 * 
 * @author Javier Paniza
 */
public class FamilyProductsReportAction extends JasperReportBaseAction implements IChangeControllersAction {  
	
	private Subfamily2 subfamily;
	private boolean goBackOnFinish = true; 
		
	public void execute() throws Exception {
		super.execute();		
		if (goBackOnFinish)	closeDialog(); 				
	}

	public Map getParameters() throws Exception  {		
		Messages errors = MapFacade.validate("FilterBySubfamily", getView().getValues());
		if (errors.contains()) throw new ValidationException(errors);
		Map parameters = new HashMap();				
		parameters.put("family", getSubfamily().getFamily().getDescription());				
		parameters.put("subfamily", getSubfamily().getDescription());
		return parameters;
	}

	protected JRDataSource getDataSource() throws Exception {
		return new JRBeanCollectionDataSource(getSubfamily().getProductsValues());		
	}
	
	protected String getJRXML() {
		return "Products.jrxml";
	}
	
	private Subfamily2 getSubfamily() throws Exception {
		if (subfamily == null) {
			int subfamilyNumber = getView().getValueInt("subfamily.number");
			subfamily = XPersistence.getManager().find(Subfamily2.class, new Integer(subfamilyNumber));
		}
		return subfamily;
	}
	
	public String[] getNextControllers() throws Exception { 		
		return goBackOnFinish?PREVIOUS_CONTROLLERS:SAME_CONTROLLERS;
	}	
	
	public boolean isGoBackOnFinish() {
		return goBackOnFinish;
	}

	public void setGoBackOnFinish(boolean goBackOnFinish) {
		this.goBackOnFinish = goBackOnFinish;
	}
	
}
