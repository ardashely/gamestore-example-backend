package main.Entitys;

public class Campaign extends Base {
    private int ID;
    private String name;
    private String discountRate;
    private String time;

    public Campaign(int ID, String name, String time, String discountRate) {
        this.ID = ID;
        this.name = name;
        this.discountRate = discountRate;
        this.time = time;
    }

    @Override
    public int getID() { return ID; }
    @Override
    public void setID(int ID) { this.ID = ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDiscountRate() { return discountRate; }
    public void setDiscountRate(String discountRate) { this.discountRate = discountRate; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time;

    }
}
