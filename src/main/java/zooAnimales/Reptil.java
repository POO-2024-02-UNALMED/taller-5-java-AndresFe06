package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
    static private ArrayList<Reptil> listado=new ArrayList<>();
    static public int iguanas;
    static public int serpientes;
    private String colorEscamas;
    private int largoCola;

    // Constructor vacío
    public Reptil() { listado.add(this); 
    }
    
    // Constructor con parámetros
    public Reptil(String nombre,int edad, String habitat, String genero, 
                  String colorEscamas, int largoCola) {
        super(nombre,edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this); 
    } 
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil iguana=new Reptil(nombre,edad,"humedal", genero, "verde",3);
        Reptil.iguanas++; 
        return iguana; 
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente=new Reptil(nombre,edad,"jungla",genero,"blanco",1); 
        Reptil.serpientes++; 
        return serpiente;
    }
    public String movimiento(){
        return "reptar"; 
    }
    static int cantidadReptiles(){
        return listado.size(); 
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
        System.out.println();
    }
}