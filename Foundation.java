

public abstract class Foundation {

    protected String founderName;
    protected int founderAge;
    protected String founderGender;
    protected int phoneNumber;

    public Foundation(String founderName, int founderAge, String founderGender, int phoneNumber) {
        this.founderName = founderName;
        this.founderAge = founderAge;
        this.founderGender = founderGender;
        this.phoneNumber = phoneNumber;
    }

    public abstract void  displayDetails();

    public double ComputeValue (double cost) {
        return cost*1000;

    }


}
