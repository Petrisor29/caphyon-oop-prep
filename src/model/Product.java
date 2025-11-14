

public class Product{
  private final String id;
  private String name;
  private String version;
  private double price;

  public Product(String id, String name, String version, double price){
    this.id = id;
    this.name = name;
    this.version = version;
    this.price = price;
  }

  public String getId(){
    return id;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public String getVersion(){
    return version;
  }
  public void setVersion(String version){
    this.version = version;
  }

  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price = price;
  }




  @Override
  public String toString(){
    return "Product: " + name + "\n"
       + " ID: " + id + "\n"
       + " Version: " + version +  "\n"
       + " Price: " + price
       + "\n" ;
  }
}
