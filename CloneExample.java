package cloneOfObject;

 class CloneExample  {
	 
public static void main(String[] args) throws CloneNotSupportedException {

	Address add = new Address("Pune","IND",123);

	System.out.println("****BEFORE CLONING  OBJECT ss ****");
	StudentInfo ss=new StudentInfo(20,"praj",add);
//	ss.name="riya";
    System.out.println("\nOriginal object ss  " +ss);
    System.out.println("hashcode of object ss before clone="+ss.hashCode());
    System.out.println("ss-address hashcode before clone = "+ss.address.hashCode());
    
    System.out.println("\n****AFTER CLONING ss into ss1****");
    StudentInfo ss1=(StudentInfo)ss.clone();
    System.out.println("\nCloned ss1="+ss1);
    ss1.name="riya";// change name in ss1
    ss1.roll=50;//change roll in ss1
    System.out.println("\nafter change ss1= "+ss1);
    System.out.println("hashcode of object ss1 after clone ="+ss1.hashCode());
    System.out.println("ss1-address hashcode after clone = "+ss1.address.hashCode());
}
}	 
// In the deep copy, we create a clone which is independent of original object 
// and making changes in the cloned object should not affect original object.
	    

// ****BEFORE CLONING  OBJECT ss ****
//
// Original object ss  StudentInfo{roll=20, name='praj', address=Address [city=Pune, country=IND, pin=123]}
// hashcode of object ss before clone=1586600255
// ss-address hashcode before clone = 474675244
//
// ****AFTER CLONING ss into ss1****
//
// Cloned ss1=StudentInfo{roll=20, name='praj', address=Address [city=Pune, country=IND, pin=123]}
//
// after change ss1= StudentInfo{roll=50, name='riya', address=Address [city=Pune, country=IND, pin=123]}
// hashcode of object ss1 after clone =932583850
// ss1-address hashcode after clone = 212628335