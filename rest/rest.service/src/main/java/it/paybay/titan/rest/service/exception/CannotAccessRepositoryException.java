package it.paybay.titan.rest.service.exception;

/**
 * <code>CannotAccessRepositoryException.java</code> extends the Exception 
 * class and is thrown by the service layer (exception translation).
 */
public class CannotAccessRepositoryException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CannotAccessRepositoryException() {
		super();
	}

	public CannotAccessRepositoryException(String message, Throwable cause) {
		super(message, cause);

	}

	public CannotAccessRepositoryException(String message) {
		super(message);

	}

	public CannotAccessRepositoryException(Throwable cause) {
		super(cause);

	}
}
