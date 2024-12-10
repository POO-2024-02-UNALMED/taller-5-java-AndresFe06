package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public Anfibio(){listado.add(this);}
    public Anfibio( String nombre,int edad,String habitat,String genero,String colorPiel,Boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }
    public static ArrayList<Anfibio> getListado(){
        return Anfibio.listado;
    }

    public static void setListado(ArrayList<Anfibio> lista){
        Anfibio.listado = lista;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public Boolean isVenenoso(){
        return this.venenoso;
    }

    public void setVenenoso(Boolean venenoso){
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearSalamandra(String nombre,int edad,String genero){
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }

    public static Anfibio crearRana(String nombre,int edad,String genero){
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }
}
