package com.bppr.projetDavid.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class FactModel {

    @Id
    @Column

    Integer Id;
    String Name;
    String Apellido;
    String Cedula;
    String Telefono;


}
