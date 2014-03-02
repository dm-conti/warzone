package it.paybay.titan.rest.model;

import java.io.Serializable;

/**
 *  Model - Contains the Bean or Plain Old Java Object (POJO) representing 
 *  the application data model.
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
public class Entity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The Entity name */
	private String name;

	/**
	 * Get the entity name.
	 * 
	 * @return the entity name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the entity name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * All data attributes are significant.
     * 
     * @param object the object
     * 
     * @return true, if equals
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object object){
    	Entity that = null;
        return (this == object)
               || ((object instanceof Entity)
                   && ((that = (Entity)object) != null)
                   && checkEquals(this.name, that.getName()));
    }	
	
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode(){
        int result = 17;
        result = 37*result + (name == null ? 0 : name.hashCode());             
        return result;
    }	
	
	/**
     * Check equals.
     * 
     * @param thiis the thiis
     * @param that the that
     * 
     * @return true, if check equals
     */
    private boolean checkEquals(Object thiis, Object that){
        return (thiis == that) || ((thiis != null) && thiis.equals(that)); 
    }

	/**
	 * Override the toString method in order to return all of the interesting 
	 * information contained in the object.
	 */
    @Override
	public String toString() {
		return name;
	}
}
