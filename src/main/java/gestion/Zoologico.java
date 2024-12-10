package gestion;
import java.util.ArrayList;

public class Zoologico {
    String nombre;
    String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();
    public Zoologico(String nombre, String ubicacion, Zona zonas){

    }
    public Zoologico(){

    }
    public int cantidadTotalAnimales(){
        int cantidad=0;
        for(Zona r:zonas){
            cantidad+=r.cantidadAnimales();
        }
        return cantidad;
    }
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    public Zoologico(String nombre,String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return this.zonas;
    }

    public void setZona(ArrayList<Zona> zona){
        this.zonas = zona;
    }
}