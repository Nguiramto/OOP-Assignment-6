

public class Main {
    public static void main(String[]args) {

        Walls walls = new Walls("Kessely Douglas", 25,"Male", 786546354,350,"John Derule");
        Building building = new Building("Mbainaissem Roi",27,"Male", 798765456,4,"Tales");
        Room room = new Room("Kuir Celas", 24,"Male", 789123456,57,"Sky High");

        System.out.println("Walls Details are : ");
        walls.displayDetails();

        System.out.println("Building Details are : ");
        walls.displayDetails();

        System.out.println("Room Details are : ");
        room.displayDetails();
    }
}
