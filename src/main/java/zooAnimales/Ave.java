package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    private static ArrayList<Ave> listado=new ArrayList<>();
    public static  int halcones;
    public static  int aguilas;
    private String colorPlumas;

    // Constructor vacío
    public Ave() {listado.add(this); }
    

    // Constructor con parámetros
    public Ave(String nombre,int edad, String habitat, String genero,
               String colorPlumas) {
        super(nombre,edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this); 
    }
    public String movimiento(){
        return "volar"; 
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave halcon=new Ave(nombre,edad, "montañas", genero, "café glorioso"); 
        Ave.halcones++; 
        return halcon;
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave aguila=new Ave(nombre,edad, "montañas", genero, "blanco y amarillo");
        Ave.aguilas++; 
        return aguila;      
}

    static int cantidadAves(){
        return listado.size();
    }


    public static ArrayList<Ave> getListado() {
        return listado;
    }


    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }


    public static int getHalcones() {
        return halcones;
    }


    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }


    public static int getAguilas() {
        return aguilas;
    }


    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }


    public String getColorPlumas() {
        return colorPlumas;
    }


    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
