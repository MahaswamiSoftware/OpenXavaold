
// File generated by OpenXava: Thu Dec 05 11:50:01 CET 2019
// Archivo generado por OpenXava: Thu Dec 05 11:50:01 CET 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Color		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Color implements java.io.Serializable, org.openxava.test.model.IColor {	

	// Constructor
	public Color() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(null); 
		setName(null); 
		setVersion(0); 
		setHexValue(null); 	
	} 
	
	// Properties/Propiedades 
	private Integer number;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer newNumber) {
		this.number = newNumber;
	} 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Color", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setName(String newName) {
		try { 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Color", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter hexValueConverter;
	private org.openxava.converters.IConverter getHexValueConverter() {
		if (hexValueConverter == null) {
			try {
				hexValueConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("hexValue");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "hexValue"));
			}
			
		}	
		return hexValueConverter;
	} 
	private java.lang.String hexValue;
	private java.lang.String get_HexValue() {
		return hexValue;
	}
	private void set_HexValue(java.lang.String newHexValue) {
		this.hexValue = newHexValue;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getHexValue() {
		try {
			return (String) getHexValueConverter().toJava(get_HexValue());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "HexValue", "Color", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setHexValue(String newHexValue) {
		try { 
			set_HexValue((java.lang.String) getHexValueConverter().toDB(newHexValue));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "HexValue", "Color", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter versionConverter;
	private org.openxava.converters.IConverter getVersionConverter() {
		if (versionConverter == null) {
			try {
				versionConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("version");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "version"));
			}
			
		}	
		return versionConverter;
	} 
	private java.lang.Integer version;
	private java.lang.Integer get_Version() {
		return version;
	}
	private void set_Version(java.lang.Integer newVersion) {
		this.version = newVersion;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getVersion() {
		try {
			return ((Integer) getVersionConverter().toJava(get_Version())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Version", "Color", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setVersion(int newVersion) {
		try { 
			set_Version((java.lang.Integer) getVersionConverter().toDB(new Integer(newVersion)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Version", "Color", "int"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.lang.String getSample() { 		
		try {			
			org.openxava.test.calculators.ColorSampleCalculator sampleCalculator= (org.openxava.test.calculators.ColorSampleCalculator)
				getMetaModel().getMetaProperty("sample").getMetaCalculator().createCalculator();  	
			
			sampleCalculator.setColorName(getName()); 
			return (java.lang.String) sampleCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Sample", "Color", ex.getLocalizedMessage()));
		} 		
	}
	public void setSample(java.lang.String newSample) {
		// for it is in value object
		// para que aparezca en los value objects
	} 

	// References/Referencias 

	private org.openxava.test.model.ICharacteristicThing characteristicThing; 	
	public org.openxava.test.model.ICharacteristicThing getCharacteristicThing() {
		if (characteristicThing != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				characteristicThing.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return characteristicThing;
	}
	public void setCharacteristicThing(org.openxava.test.model.ICharacteristicThing newCharacteristicThing) {
		if (newCharacteristicThing != null && !(newCharacteristicThing instanceof org.openxava.test.model.CharacteristicThing)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.characteristicThing = newCharacteristicThing; 
	} 

	private org.openxava.test.model.IThing usedTo; 	
	public org.openxava.test.model.IThing getUsedTo() {
		if (usedTo != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				usedTo.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return usedTo;
	}
	public void setUsedTo(org.openxava.test.model.IThing newThing) {
		if (newThing != null && !(newThing instanceof org.openxava.test.model.Thing)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.usedTo = newThing; 
	} 

	private org.openxava.test.model.IMixture mixture; 	
	public org.openxava.test.model.IMixture getMixture() {
		if (mixture != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				mixture.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return mixture;
	}
	public void setMixture(org.openxava.test.model.IMixture newMixture) {
		if (newMixture != null && !(newMixture instanceof org.openxava.test.model.Mixture)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.mixture = newMixture; 
	} 

	private org.openxava.test.model.ICharacteristicThing anotherCT; 	
	public org.openxava.test.model.ICharacteristicThing getAnotherCT() {
		if (anotherCT != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				anotherCT.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return anotherCT;
	}
	public void setAnotherCT(org.openxava.test.model.ICharacteristicThing newCharacteristicThing) {
		if (newCharacteristicThing != null && !(newCharacteristicThing instanceof org.openxava.test.model.CharacteristicThing)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.anotherCT = newCharacteristicThing; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Color as o"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Color as o"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Color findByNumber(java.lang.Integer number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Color as o where o.number = :arg0"); 
		query.setParameter("arg0", number); 
		Color r = (Color) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Color"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Color").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Color"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}