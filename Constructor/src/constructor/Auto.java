/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 * uwu esta clase sirve para ser un auto i think
 * @author clases
 */
public class Auto {
    private String marca;
    private String modelo;
    private String numeroSerie;
    private Integer anio;

    //Esta clase tiene tres constructores 
    Auto(){ //Este es el constructor por defecto
        super();
    }
    public Auto(String marca){
        this.marca = marca;
    }
    public Auto(String marca, String modelo){
        super();
        this.marca = marca;
        this.modelo = modelo;
    }
    // TO DO
    // Generar los constructores faltantes
    
    
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

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    
} 
