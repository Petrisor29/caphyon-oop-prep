public class License{
  private String key;
  private String expiryDate;
  private Product product;

  public License(String key, String expiryDate, Product product){
    this.key = key;
    this.expiryDate = expiryDate;
    this.product = product;
  }

  @Override
  public String toString(){
    return "License key: " + key + "\n"
       + "Expiry date: " + expiryDate + "\n"
       + "Product: " + product
       + "\n"  ;
  }
}
