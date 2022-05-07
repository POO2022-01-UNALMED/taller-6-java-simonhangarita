package vehiculos;
import java.util.ArrayList;
public class Vehiculo{
  private String placa;
  private int puertas;
  private int velocidadMaxima;
  private String nombre;
  private int precio;
  private int peso;
  private String traccion;
  private Fabricante fabricante;
  private static int cantidadVehiculos;
  static ArrayList<Fabricante> listaFabricantes= new ArrayList<Fabricante>();
  public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion, Fabricante fabricante){
    this.placa=placa;
    this.puertas=puertas;
    this.velocidadMaxima=velocidadMaxima;
    this.nombre=nombre;
    this.precio=precio;
    this.peso=peso;
    this.traccion=traccion;
    this.fabricante=fabricante;
    cantidadVehiculos+=1;
    listaFabricantes.add(fabricante);
  }
  public void setPlaca(String placa){
    this.placa=placa;
  }
  public void setPuertas(int puertas){
    this.puertas=puertas;
  }
  public void setVelocidadMaxima(int velocidadMaxima){
    this.velocidadMaxima=velocidadMaxima;
  }
  public void setnombre(String nombre){
    this.nombre=nombre;
  }
  public void setPrecio(int precio){
    this.precio=precio;
  }
  public void setPeso(int peso){
    this.peso=peso;
  }
  public void setTraccion(String traccion){
    this.traccion=traccion;
  }
  public void setFabricante(Fabricante fabricante){
    this.fabricante=fabricante;
  }
  public String getPlaca(){
    return placa;
  }
  public int getPuertas(){
    return puertas;
  }
   public int getVelocidadMaxima(){
    return velocidadMaxima;
  }
   public String getNombre(){
    return nombre;
  }
   public int getPrecio(){
    return precio;
  }
   public int getPeso(){
    return peso;
  }
   public String getTraccion(){
    return traccion;
  }
   public Fabricante getFabricante(){
    return fabricante;
  }
  public static String vehiculosPorTipo(){
    return "Automoviles: "+Automovil.cantidadAutomoviles+"/nCamionetas; "+Camioneta.cantidadCamionetas+"/nCamiones: "+Camion.cantidadCamiones;
  }
  public static Fabricante revisionFabricantes(){
    int n=0;
    Fabricante f=null;
    for(Fabricante i:listaFabricantes){
      int c=0;
      for(Fabricante e:listaFabricantes){
        if(i.getNombre()==e.getNombre()){
          c+=1;
        }
      }
      if (c>n){
        n=c;
        f=i;
      }   
    }
    return f;
  }
}