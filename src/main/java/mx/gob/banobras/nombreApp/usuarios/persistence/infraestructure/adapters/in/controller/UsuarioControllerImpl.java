package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.in.IUsuarioCasoUsoService;
import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;
import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.in.dto.UsuarioDTO;

@RestController
public class UsuarioControllerImpl implements IUsuarioController{

	private final IUsuarioCasoUsoService iUsuarioCasoUsoService;

	public UsuarioControllerImpl(IUsuarioCasoUsoService iUsuarioCasoUsoService) {
		this.iUsuarioCasoUsoService = iUsuarioCasoUsoService;
	}
	
	@Override
	@GetMapping("/{id}")
	public Usuario findById(
			@RequestHeader(value = "credentials") String credentials,
			@RequestHeader(value = "app-name") String appName, 
			@RequestHeader(value = "consumer-id") String consumerId,
			@RequestHeader(value = "functional-id") String functionalId,
			@RequestHeader(value = "transaction-id") String transactionId, @PathVariable Integer id) {

		System.out.println("Servicio Persistencia 111");
		//HeaderInDTO headerInDTO = new HeaderInDTO(credentials, appName, consumerId, functionalId, transactionId);
		UsuarioDTO userInDTO = new UsuarioDTO(id, null, null, null, null, null, null, null, null, null, 0);
		return iUsuarioCasoUsoService.findById(userInDTO.getId());
	}

}
