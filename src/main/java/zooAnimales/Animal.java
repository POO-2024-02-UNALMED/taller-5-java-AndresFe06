package zooAnimales;

import gestion.Zona; 
public class Animal {

   private  static int totalAnimales; 
    private String nombre; 
    private int edad; 
    private String habitat; 
    private String genero; 
    private Zona zona;  
    
    public Animal(){totalAnimales++;}
    public Animal(String n, int e, String h,String g){
        this.nombre=n; 
        this.edad=e; 
        this.habitat=h; 
        this.genero=g; 
        totalAnimales++;
     
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
        if (zona==null) {
        return "Mi nombre es " +nombre+  ", tengo una edad de " +edad+ ", habito en " +habitat+ " y mi genero es " +genero;
        } else{
        return "Mi nombre es " +nombre+  ", tengo una edad de " +edad+ ", habito en " +habitat+ " y mi genero es " +genero+ ", la zona en la que me ubico es " +zona+ ", en el " +zona.getZoo();
        }
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
    public String movimiento(){
        return "desplazarse";
    }
}
