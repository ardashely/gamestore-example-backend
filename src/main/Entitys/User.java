package main.Entitys;

public class User extends Base {
    private int ID;
    private String identificationNumber;
    private String firstName;
    private String lastName;
    private String birthDay;

    public User() { super(); }

    public User(int ID, String identificationNumber, String firstName, String lastName, String birthDay) {
        this.ID = ID;
        this.identificationNumber = identificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getIdentificationNumber() { return identificationNumber; }
    public void setIdentificationNumber(String identificationNumber) { this.identificationNumber = identificationNumber; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getBirthDay() { return birthDay; }
    public void setBirthDay(String birhDay) { this.birthDay = birhDay; }
    @Override
    public int getID() { return ID; }
    @Override
    public void setID(int ID) { this.ID = ID; }

}