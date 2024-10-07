

public class Building extends Foundation{

    private int floors;
    private String materials;


    public Building(String founderName, int founderAge, String founderGender, int phoneNumber, int floors, String materials) {
        super(founderName, founderAge, founderGender, phoneNumber);
        this.floors = floors;
        this.materials = materials;
    }


    @Override
    public void displayDetails() {

        System.out.println("The Founder Name is : " +founderName);
        System.out.println("The Founder Age is : " +founderAge);
        System.out.println("The Founder Gender is : " +founderGender);
        System.out.println("The Founder's Phone Number is : " +phoneNumber);
        System.out.println("The Number of Floors is : " +floors);
        System.out.println("The Materials used are :" +materials);

    }
}
