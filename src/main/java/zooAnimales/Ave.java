package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public Ave(){
        listado.add(this);
    }
    public Ave( String nombre,int edad,String habitat,String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public static ArrayList<Ave> getListado(){
        return Ave.listado;
    }

    public static void setListado(ArrayList<Ave> lista){
        Ave.listado = lista;
    }

    public String getColorPlumas(){
        return this.colorPlumas;
    }

    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"cafe");
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
    }
    public String movimiento(){
        return "volar";
    }
    
}