public class Product {

    public Product(int id, String name, String destription, double price, int stockAmount, String renk) {
        System.out.println("yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.price = price;
        this.destription = destription;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product() {

    }

    // attribute or field
    private int id;
    private String name;
    private String destription;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestription() {
        return destription;
    }

    public void setDestription(String destription) {
        this.destription = destription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }


}
