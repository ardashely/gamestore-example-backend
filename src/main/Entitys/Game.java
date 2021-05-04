package main.Entitys;

public class Game extends Base {
    private int ID;
    private String name;
    private String descreption;
    private int unitPrice;

    public Game() { super(); }

    public Game(int ID, String name, String descreption, int unitPrice) {
        this.ID = ID;
        this.name = name;
        this.descreption = descreption;
        this.unitPrice = unitPrice;
    }

    @Override
    public int getID() { return ID; }
    @Override
    public void setID(int ID) { this.ID = ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescreption() { return descreption; }
    public void setDescreption(String descreption) { this.descreption = descreption; }
    public int getUnitPrice() { return unitPrice; }
    public void setUnitPrice(int unitPrice) { this.unitPrice = unitPrice; }

}
