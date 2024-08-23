package mx.gob.banobras.nombreApp.usuarios.persistence.infraestructure.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "USUARIOS")
@Data
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID") 
    private Integer id;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @Column(name = "NOMBRE")
    private String nombre;
     @Column(name = "CONTRASENA")
    private String contrasena;
    @Column(name = "TIPO_USUARIO")
    private String tipoUsuario;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ACTIVO")
    private Integer activo;
}
