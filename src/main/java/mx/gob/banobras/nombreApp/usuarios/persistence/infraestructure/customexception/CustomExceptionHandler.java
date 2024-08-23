package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.customexception;







import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;





@RestControllerAdvice
//ontrollerAdvice
public class CustomExceptionHandler {

		
	@ExceptionHandler({ RequestException.class })
	public ResponseEntity<Object> noSuchElementException(RequestException ex, WebRequest request) {
		ErrorDTO errorDTO = new ErrorDTO("NE005", ex.getMessage());

	    return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> Exception(RequestException ex, WebRequest request) {
		ErrorDTO errorDTO = new ErrorDTO("NE002", ex.getMessage());

	    return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler({ MethodArgumentTypeMismatchException.class })
	public ResponseEntity<Object> handleMethodArgumentTypeMismatch(
	  MethodArgumentTypeMismatchException ex, WebRequest request) {
		ErrorDTO errorDTO = new ErrorDTO("NE003", ex.getMessage());
	    return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	

}
