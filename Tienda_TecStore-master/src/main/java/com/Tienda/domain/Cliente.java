package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

 private static final long serialVersionUID = 1L;   
    
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column (name="id_cliente")
 private Long idCliente;
 
 
private String Nombre;
private String Apellidos;
private String Correo;
private String Telefono;

@JoinColumn (name="id_credito", referencedColumnName="id_credito")
@ManyToOne
private Credito credito;

    public Cliente(String Nombre, String Apellidos, String Correo, String Telefono, Credito credito) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.credito = credito;
    }

    public Cliente() {
    }


    
}
