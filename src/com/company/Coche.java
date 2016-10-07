package com.company;

/**
 * Created by usu26 on 06/10/2016.
 */
public class Coche {


    private String Matricula;
    private String Marca;
    private String Modelo;
    private int Precio;


    public Coche(){}

    public Coche(String Matricula, String Marca, String Modelo,int Precio){
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
