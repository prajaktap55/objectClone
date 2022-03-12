package cloneOfObject;

public class Employee {
	
	int id;
	String name;
	Address1 addr;
	public Employee() {}//No-arg Constructor
	
	public Employee(int id,String name,Address1 addr) //para-constructor
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	public Employee(Employee emp)//copy constructor
	{
		this.id=emp.id;
		this.name=emp.name;
		
		Address1 dummyAddr=new Address1();
		dummyAddr.city=emp.addr.city;
		dummyAddr.country=emp.addr.country;
		dummyAddr.pin=emp.addr.pin;
		this.addr=dummyAddr;//this code will give deep copy of Address1 class object

		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
}
