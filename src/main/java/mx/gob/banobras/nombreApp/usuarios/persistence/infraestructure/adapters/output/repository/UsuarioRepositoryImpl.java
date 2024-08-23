package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.output.repository;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Repository;

import mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.out.IUsuarioRepository;
import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;
import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.customexception.RequestException;
import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.mappers.UsuarioMapper;

@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository {
	
	 private final IUsuarioCrudRepository iUserCrudRepository;
	 private final UsuarioMapper usuarioMapper;
	 
	 public UsuarioRepositoryImpl(IUsuarioCrudRepository iUserCrudRepository, UsuarioMapper usuarioMapper ) {
	        this.iUserCrudRepository = iUserCrudRepository;
	        this.usuarioMapper = usuarioMapper;
	    }

	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		
	try {
		
		System.out.println(iUserCrudRepository.findById(id).get().getApellidoMaterno());
		return  usuarioMapper.toUsuario(iUserCrudRepository.findById(id).get());
		
	}catch (NoSuchElementException ex) {
		throw new RequestException("E200", "No existe registro");
	}catch (Exception ex) {
		throw new RequestException("E500", ex.getMessage());
	}
		
		
	}


	



}
