package enum1;

public enum FoodItem {
  //  IDLY, DOSA, PURI, WADA;
    IDLY(25), DOSA(30), PURI(40), WADA(45);

    double price;
private FoodItem(double price){
    this.price = price;
}
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}
