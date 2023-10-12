class Vehicle {
  Long id;
  String pemilik;
  String merk;
  double price;
 
  public Vehicle() {
  }

  public Vehicle(Long id, String pemilik, String merk, double price) {
    this.id = id;
    this.pemilik = pemilik;
    this.merk = merk;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPemilik() {
    return pemilik;
  }

  public void setPemilik(String pemilik) {
    this.pemilik = pemilik;
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void tampilkanInfo() {
    System.out.println("Id: " + id);
    System.out.println("Pemilik: " + pemilik);
    System.out.println("Merk: " + merk);
    System.out.println("Harga: $" + price);
  }

  public static void main(String args[]){
    //INI ADALAH OBJECT
    Vehicle vehicleRudi = new Vehicle(1L, "Rudi Darmawan", "Honda", 26000.0);
    
    vehicleRudi.tampilkanInfo();
  }
}
 
