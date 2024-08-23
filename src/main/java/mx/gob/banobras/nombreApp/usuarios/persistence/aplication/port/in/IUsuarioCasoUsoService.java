package mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.in;

import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;

public interface IUsuarioCasoUsoService {

	Usuario findById(Integer id);

}
