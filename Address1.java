package cloneOfObject;

public class Address1 {
	 String city;
	 String country;
	 int pin;
	 
	 public Address1()
	 {}

	 public Address1(String city,String country,int pin)
	 {
		 this.city=city;
		 this.country=country;
		 this.pin=pin;
	 }

	@Override
	public String toString() {
		return "Address1 [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
}



