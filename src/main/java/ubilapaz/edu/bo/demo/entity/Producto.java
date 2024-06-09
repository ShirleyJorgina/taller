package ubilapaz.edu.bo.demo.entity;

//@Entity
import jakarta.persistence.*;

@Entity(name="PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "CODIGO")
    String codigo;

    @Column(name = "NOMBRE")
    String nombre;

    @Column(name = "PRECIO")
    int precio;

    @Column(name = "FECHA_REGISTRO")
    String fecha_registro;
    
    @Column(name = "FECHA_MODIFICACION")
    String fecha_modificacion;
}