package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.banobras.nombreApp.usuarios.persistence.aplication.port.in.IUsuarioCasoUsoService;
import mx.gob.banobras.nombreApp.usuarios.persistence.dominio.model.Usuario;
import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.in.dto.UsuarioDTO;

@RequestMapping("/usuarios/v1/")
public interface IUsuarioController {

	@GetMapping("/{id}")
	public Usuario findById(
			@RequestHeader(value = "credentials") String credentials,
			@RequestHeader(value = "app-name") String appName, 
			@RequestHeader(value = "consumer-id") String consumerId,
			@RequestHeader(value = "functional-id") String functionalId,
			@RequestHeader(value = "transaction-id") String transactionId, @PathVariable Integer id);
}
