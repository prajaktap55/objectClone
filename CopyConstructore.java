package cloneOfObject;

public class CopyConstructore {
	public static void main(String[] args) {
		Address1 add1=new Address1("kolhapur","INDIA",1222);
		Employee emp=new Employee(55,"RAM",add1);
		System.out.println("Original object emp= "+emp);
		
		Employee empnew=new Employee(emp);//call to copy constructore
		System.out.println("\nCopied Object empnew ="+empnew);
		
		//emp.id=10;
		//emp.name="shyam";
		
		emp.addr.city="Mumbai";
////		emp and empnew(bcz of shallow copy)here 
////		we are using the immutable and primitive types, i.e int and String.
		
		System.out.println("\nAfter change in Original emp="+emp);
		System.out.println("\nAfter change empnew="+empnew);
		
		System.out.println("\nHashcode emp = "+emp.hashCode());
		System.out.println("Hashcode empnew = "+empnew.hashCode());
	}
}
//OUTPUT:->
//Original object emp= Employee [id=55, name=RAM, addr=Address1 [city=kolhapur, country=INDIA, pin=1222]]
//
//Copied Object empnew =Employee [id=55, name=RAM, addr=Address1 [city=kolhapur, country=INDIA, pin=1222]]
//
//After change in Original emp=Employee [id=55, name=RAM, addr=Address1 [city=Mumbai, country=INDIA, pin=1222]]
//
//After change empnew=Employee [id=55, name=RAM, addr=Address1 [city=Mumbai, country=INDIA, pin=1222]]

//Hashcode emp = 1586600255
//Hashcode empnew = 474675244

