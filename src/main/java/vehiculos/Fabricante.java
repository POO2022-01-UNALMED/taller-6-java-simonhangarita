package vehiculos;
import java.util.ArrayList;
public class Fabricante{
  private String nombre;
  private Pais pais;
  static ArrayList<Pais> listaPaises= new ArrayList<Pais>();
  public Fabricante(String nombre, Pais pais){
    this.nombre=nombre;
    this.pais=pais;
    listaPaises.add(pais);
  }
  public void setPais(Pais pais){
    this.pais=pais;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public Pais getPais(){
    return pais;
  }
  public static Fabricante fabricaMayorVentas(){
    return Vehiculo.revisionFabricantes();
  }
  public static Pais revisionPaises(){
    int n=0;
    Pais p=null;
    for(Pais i:listaPaises){
      int c=0;
      for(Pais e:listaPaises){
        if(i.getNombre()==e.getNombre()){
          c+=1;
        }
      }
      if (c>n){
        n=c;
        p=i;
      }   
    }
    return p;
  }
}