package domain;

public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone(){
        super();
    }

    public SmartPhone(String name, String description, double price, boolean has5G){
        super(name,description,price);
        this.has5G = has5G;
    }

    @Override
    public String getInfo(){
        return "SmartPhone: " + super.getInfo() + ", Has 5G: " + has5G;
    }
}
