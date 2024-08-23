package mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.out;

import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;

public interface IUsuarioRepository {

    Usuario findById(Integer id);
}
