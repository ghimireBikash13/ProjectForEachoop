
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cerate a person object
		Person obj=new Person();
		obj.setFirstName("Bikash");
		obj.setLastName("Ghimire");
		obj.setHourlyRate(10);
		
		
		//print the state of the current person object
		System.out.println(obj.toString());
		//print the 40 hours weekly
		System.out.println(obj.getPayment(40));

	}

}
