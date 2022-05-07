package vehiculos;
public class Camioneta extends Vehiculo{
  private boolean volco;
  static int cantidadCamionetas=0;
  public Camioneta(String placa,int puertas,String nombre,int precio,int peso, Fabricante fabricante,boolean volco){
    super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
    this.volco=volco;
    cantidadCamionetas+=1;
  }
  public void setPuestos(boolean volco){
    this.volco =volco;
  }
  public boolean isVolco(){
    return volco;
  }
}