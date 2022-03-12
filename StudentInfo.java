package cloneOfObject;

public class StudentInfo implements Cloneable {
	int roll;
    String name;
  Address address;

    public StudentInfo() 
    {
    }

    public StudentInfo (int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    protected Object clone() throws CloneNotSupportedException {
    	StudentInfo dummyStd = (StudentInfo) super.clone(); //create dummy copy of Student using clone
        Address newaddr = (Address) address.clone(); //also create copy of Address
        dummyStd.address = newaddr; // assign newaddress copy to dummystudent object
        return dummyStd; //return dummyStudent

      }
}
