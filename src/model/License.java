public class License{
  private final String key;
  private final String expiryDate;
  private final Product product;

  public License(String key, String expiryDate, Product product){
    this.key = key;
    this.expiryDate = expiryDate;
    this.product = product;
  }

  public String getKey(){
    return key;
  }

  public String getExpiryDate(){
    return expiryDate;
  }

  public Product getProduct(){
    return product;
  }

  @Override
  public String toString(){
    return "License key: " + key + "\n"
       + "Expiry date: " + expiryDate + "\n"
       + "Product: " + product
       + "\n"  ;
  }
}
