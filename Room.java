

public class Room extends Foundation {

    private int roomNumber;
    private String roomName;

    public Room(String founderName, int founderAge, String founderGender, int phoneNumber, int roomNumber, String roomName) {
        super(founderName, founderAge, founderGender, phoneNumber);
        this.roomName = roomName;
        this.roomNumber = roomNumber;
    }


    @Override
    public void displayDetails() {

        System.out.println("The Founder Name is : " +founderName);
        System.out.println("The Founder Age is : " +founderAge);
        System.out.println("The Founder Gender is : " +founderGender);
        System.out.println("The Founder's Phone Number is : " +phoneNumber);
        System.out.println("The Room Number is : " +roomNumber);
        System.out.println("The Room Name is : " +roomName);

    }
}
