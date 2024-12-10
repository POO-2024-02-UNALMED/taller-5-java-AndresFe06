package zooAnimales;

import gestion.Zona; 
public class Animal {

   private  static int totalAnimales; 
    private String nombre; 
    private int edad; 
    private String habitat; 
    private String genero; 
    private Zona zona;  
    {
        totalAnimales++; 
    }
    public Animal(){}
    public Animal(String n, int e, String h,String g){
        this.nombre=n; 
        this.edad=e; 
        this.habitat=h; 
        this.genero=g; 
     
    }
    public static String totalPorTipo() {
        return "Mamíferos: " + Mamifero.cantidadMamiferos() + "\n" +
               "Aves: " + Ave.cantidadAves() + "\n" +
               "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
               "Peces: " + Pez.cantidadPeces() + "\n" +
               "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString(){
        if (this.zona==null){
        return ("Mi nombre es "+ this.nombre+", tengo una edad de "+ 
        this.edad +", habito en "+ this.habitat+  ", y mi genero es "+ this.genero);  
    }else{
        return ("Mi nombre es "+ this.nombre+", tengo una edad de "+ 
        this.edad +", habito en "+ this.habitat+  ", y mi genero es "+ this.genero+
        ", la zona en la que me ubico es "+ this.zona + ", del zoologico "+ this.zona.zoo);  
    }
}
    public String movmiento(){
        return "desplazarse"; 
    }
    
    public static int getTotalAnimales() {
        return totalAnimales;
    }
    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
