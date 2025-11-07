package domain;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop(){
        super();
    }
    public Laptop(String name, String description, double price,String ram,String cpu){
        super(name,description,price);
        this.ram = ram;
        this.cpu = cpu;
    }
    @Override
    public String getInfo(){
        return "Laptop: " + super.getInfo() + ", Ram: " + ram + "GB, CPU: " + cpu + "Ghz";
    }
}
