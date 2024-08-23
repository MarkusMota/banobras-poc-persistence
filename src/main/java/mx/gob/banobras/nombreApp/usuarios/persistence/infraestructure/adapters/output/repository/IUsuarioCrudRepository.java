package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.adapters.output.repository;


import org.springframework.data.repository.CrudRepository;

import mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.entity.UsuarioEntity;



public interface IUsuarioCrudRepository extends CrudRepository<UsuarioEntity,Integer> {
    
}
