package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
    private static  ArrayList<Pez> listado=new ArrayList<>();
    public static  int salmones;
    public static  int bacalaos;
    private String colorEscamas; 
    private int cantidadAletas;

    public Pez() {        listado.add(this);

    }
    
    public Pez(String nombre,int edad, String habitat, String genero, String colorEscamas,
               int cantidadAletas) {
        super(nombre,edad, habitat, genero);
        this.colorEscamas=colorEscamas; 
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }
    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez(nombre, edad, "océano", genero, "rojo", 6);
        salmones++; 
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "océano", genero, "gris", 6);
        bacalaos++; 
        return bacalao;
    }

    public static int cantidadPeces() {
        return listado.size(); 
    }
   

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    public String movimiento(){
        return "nadar";
    }
}
