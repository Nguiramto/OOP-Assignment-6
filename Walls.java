

public class Walls extends Foundation {

    private int dimensions;
    private String constructorName;

    public Walls(String founderName, int founderAge, String founderGender, int phoneNumber, int dimensions, String constructorName) {
        super(founderName, founderAge, founderGender, phoneNumber);
        this.dimensions = dimensions;
        this.constructorName = constructorName;


    }


    @Override
    public void displayDetails() {

        System.out.println("The Founder Name is : " +founderName);
        System.out.println("The Founder Age is : " +founderAge);
        System.out.println("The Founder Gender is : " +founderGender);
        System.out.println("The Founder's Phone Number is : " +phoneNumber);
        System.out.println("The Walls Dimensions are : " +dimensions);
        System.out.println("The Walls Constructor Name is : " +constructorName);

    }
}
