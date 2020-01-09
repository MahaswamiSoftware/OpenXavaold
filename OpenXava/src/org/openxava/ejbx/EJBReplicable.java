package org.openxava.ejbx;

import javax.ejb.*;

import org.openxava.util.*;


/**
 * Remote interface of a <i>EntityBean</i> that can be replicate. <p> 
 *
 * Basically
 * B�sicamente it allow update and read a group of property values
 * in one hit.<br>
 * 
 * @author  Javier Paniza
 */

public interface EJBReplicable extends EJBObject, IPropertiesContainer {

}
