package com.codeapp.laptps.laptop.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String procesador;
    @Column(nullable = false)
    private Integer ram;     // en GB
    @Column(nullable = false)
    private Integer almacenamiento; // en GB
    @Column(nullable = false)
    private String tipoDisco;     // SSD / HDD
    @Column(nullable = false)
    private String sistemaOperativo;
    @Column(nullable = false)
    private Double tamanioPantalla; // en pulgadas

    public Laptop() {
    }

    public Laptop(Integer id, String marca, String modelo, String procesador, Integer ram, Integer almacenamiento, String tipoDisco, String sistemaOperativo, Double tamanioPantalla) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipoDisco = tipoDisco;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Integer almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(Double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

}
