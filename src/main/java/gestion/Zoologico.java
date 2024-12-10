package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre; 
    private String ubicacion; 
    private ArrayList<Zona> zonas;
    public Zoologico(){}
    
    public Zoologico(String n, String u){
        this.nombre=n ; 
        this.ubicacion=u; 
    }
    public int cantidadTotalAnimales(){
        int suma=0;
        for(Zona z: zonas){
            suma+=z.cantidadAnimales();
        }
        return suma;
    }
    public void agregarZonas(Zona z){
        this.zonas.add(z); 
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public ArrayList<Zona> getZona() {
        return zonas;
    }
    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}
