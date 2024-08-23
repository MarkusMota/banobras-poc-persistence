package mx.gob.banobras.nombreApp.usuarios.persistence.aplication.service;

import org.springframework.stereotype.Service;

import mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.in.IUsuarioCasoUsoService;
import mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.out.IUsuarioRepository;
import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;
@Service
public class UsuarioCasoUsoServiceImpl implements IUsuarioCasoUsoService{

	private final IUsuarioRepository iUserOutPort;
	
	public UsuarioCasoUsoServiceImpl(IUsuarioRepository iUserOutPort ) {
        this.iUserOutPort = iUserOutPort;
        
    }
	
	@Override
	public Usuario findById(Integer id) {
			
		return iUserOutPort.findById(id);
	}
    
	
	
	





}
