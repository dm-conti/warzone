package it.paybay.titan.modular.dao.exception;

/**
 * The class <code>ResourceAccessException.java</code> extends the Exception
 * This class is used for the exception of resource access in data source.
 *
 */
public class ResourceAccessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ResourceAccessException(){
		super();
	}
	
	public ResourceAccessException(String message, Throwable cause) {
		super(message, cause);

	}

	public ResourceAccessException(String message) {
		super(message);

	}

	public ResourceAccessException(Throwable cause) {
		super(cause);

	}

}
