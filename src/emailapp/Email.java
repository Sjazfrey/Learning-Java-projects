//Creating email account for new employees

package emailapp;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "daycompany.com";

	//Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	
	//call method asking for department and return department	
		this.department = setDepartment();
//		System.out.println("Department: " + this.department);
		
		//call a method that returns a password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is" + this.password);
	
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//		System.out.println("Your email is: " + email);
	}
	
	//Ask for Department
	private String setDepartment() {
		System.out.println("New Employee: " + firstName + " \nDepartment Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none \n Enter Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "Sales"; }
		else if (depChoice == 2) { return "Dev"; }
		else if (depChoice == 3 ) { return "Acc"; }
		else { return ""; }   //go up to line 20 department = setDepartment and then print this.department
	}
		
	//Generate password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password); // go to line 24 this.password
		}
	
	
	// Set the mailbox Capacity
			public void setMailboxCapacity(int capacity) {
				this.mailboxCapacity = capacity;
			}
	// Set the alternative email
			public void setAlternateEmail(String altEmail) {
				this.alternateEmail = altEmail;
			}
	
	//Change the password
			public void changePassword(String password) {
				this.password = password;
			}
	
	//mailbox capacity set up with a GET METHOD
			public int getMailboxCapacity() { return mailboxCapacity; }
			public String getAlterateEmail() { return alternateEmail; }
			public String getPassword() { return password; }
			
			//print name email and mailbox capacity with a get method
			public String showInfo() {
				return "DISPLAY NAME: " + firstName + " " + lastName + 
					    "\nCOMPANY EMAIL: " + email +
					    "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
						
			}
}
