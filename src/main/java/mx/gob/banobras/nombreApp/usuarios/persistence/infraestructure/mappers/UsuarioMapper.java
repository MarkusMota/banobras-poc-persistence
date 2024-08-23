package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.mappers;



import org.springframework.stereotype.Component;

import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;
import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.entity.UsuarioEntity;

@Component
public class UsuarioMapper {
    
	public Usuario toUsuario(UsuarioEntity usuarioEntity) {
		return new Usuario(
				usuarioEntity.getId(),
				usuarioEntity.getDireccion(),
				usuarioEntity.getCelular(),
				usuarioEntity.getEmail(),
				usuarioEntity.getApellidoPaterno(),
				usuarioEntity.getApellidoMaterno(),
				usuarioEntity.getNombre(),
				usuarioEntity.getContrasena(),
				usuarioEntity.getTipoUsuario(),
				usuarioEntity.getUsuario(),
				usuarioEntity.getActivo()
				);
	}


}
