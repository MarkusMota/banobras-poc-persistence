package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.customexception;

import lombok.Data;

@Data
public class RequestException extends RuntimeException{

	private static final long serialVersionUID = -6621119796732484726L;
	private String code;
	private String message;

	public RequestException(String code, String message) {
		super(message);
		this.code = code;
		this.message = message;
		
	}
}
