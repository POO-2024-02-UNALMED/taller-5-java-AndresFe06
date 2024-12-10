package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {

    private static ArrayList<Mamifero> listado=new ArrayList<>(); 
    public static int caballos; 
    public static int leones; 
    private Boolean pelaje;
    private int patas; 
     // Constructor vacío
    public Mamifero() {listado.add(this);}
    // Constructor con parámetros
    public Mamifero(String nombre, int edad, String habitat, String genero,
                    Boolean pelaje, int patas) {
        super(nombre,edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
}
    public static Mamifero crearCaballo(String nombre, int edad, String genero ){
        Mamifero caballo=new Mamifero(nombre,edad,"pradera",genero,true, 4);
        Mamifero.caballos++;
        return caballo;
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon=new Mamifero(nombre,edad,"selva", genero, true, 4); 
        Mamifero.leones++; 
        return leon; 
    }
    static int cantidadMamiferos(){
        return listado.size();
    }
  
    public static ArrayList<Mamifero> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }
    public static int getCaballos() {
        return caballos;
    }
    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }
    public static int getLeones() {
        return leones;
    }
    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }
    public Boolean isPelaje() {
        return pelaje;
    }
    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
}
