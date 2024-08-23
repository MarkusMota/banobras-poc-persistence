package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.customexception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
private String code;
private String message;


}
