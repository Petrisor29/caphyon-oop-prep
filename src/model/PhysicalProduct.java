public class PhysicalProduct extends Product {

    private double weight; 

    public PhysicalProduct(String id,
                           String name,
                           String version,
                           double price,
                           double weight) {
        super(id, name, version, price); 
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
               " Weight: " + weight + " kg\n";
    }
}

