package zooAnimales;
import gestion.Zona ;

public class Animal {
    public static int totalAnimales=0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    public Animal(){
        totalAnimales++;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Zona getZona(){
        return this.zona;
    }

    public void setZona(Zona zoo){
        this.zona = zoo;
    }

    public static int getTotalAnimales(){
        return totalAnimales;
    }

    public static void setTotalAnimales(int total){
        Animal.totalAnimales = total;
    }
    public static String totalPorTipo(){
        return ("Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+Anfibio.cantidadAnfibios());
    }

    @Override
    public String toString(){
        if (zona==null) {
        return "Mi nombre es " +nombre+  ", tengo una edad de " +edad+ ", habito en " +habitat+ " y mi genero es " +genero;
        } else{
        return "Mi nombre es " +nombre+  ", tengo una edad de " +edad+ ", habito en " +habitat+ " y mi genero es " +genero+ ", la zona en la que me ubico es " +zona+ ", en el " +zona.getZoo();
        }
    }
    public String movimiento(){
        return "desplazarse";
    }
    
    
}
