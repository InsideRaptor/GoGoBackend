package com.tpfinal.gogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
public class ViajeUserAuto {

    //viaje
    @Id
    private int id;
    private LocalDateTime horarioSalida;
    private String turno;
    private String ubicacionInicio;
    private String ubicacionDestino;
    private int chofer;
    private int autoId;
    private int[] users;

    //user
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;

    //auto
    private String patente;
    private String color;
    private String modelo;
    private String marca;

}