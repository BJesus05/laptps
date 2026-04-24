package com.codeapp.laptps.laptop.dtoLaptop;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "marca",
        "modelo",
        "procesador",
        "ram",
        "almacenamiento",
        "tipoDisco",
        "sistemaOperativo",
        "tamanioPantalla"
})
public class LaptopDTO {

    private Integer id;
    private String marca;
    private String modelo;
    private String procesador;
    private Integer ram;
    private Integer almacenamiento;
    private String tipoDisco;
    private String sistemaOperativo;
    private Double tamanioPantalla;

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
