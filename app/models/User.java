package models;

import io.ebean.*;
import org.hibernate.validator.constraints.Email;
import play.data.Form;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;


@Entity
public class User extends Model {
    @Id
    public Integer idUsuario;
    @Constraints.Required(message = "Por favor ingrese un nickname")
    @Column(unique = true)
    public String username;
    @Constraints.Required(message = "Por favor ingrese una contraseña")
    public String password;
    @Constraints.Required(message = "Por favor ingrese sus nombres")
    public String nombre;
    @Constraints.Required(message = "Por favor ingrese su teléfono o celular")
    @Column(length = 12)
    public String telefono;
    @Constraints.Required(message = "Por favor ingrese su correo")
    @Constraints.Email(message = "Por favor verifique su correo")
    public String email;
    @Column(columnDefinition = "boolean default 1")
    public Boolean activo1;

    public static Finder<Integer, User> find = new Finder<>(User.class);
}