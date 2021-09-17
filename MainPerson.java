package phoneBookProject;

import java.util.Scanner;



public class MainPerson {

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		Person contact = new Person("John","Doe"," E","John Doe","Mo","St.Louis","Market St",63403, 6366435698L);
		Person contact2 = new Person("John","Doe"," E","John Doe","Mo","St.Louis","Market St",63303, 8475390126L);
		Person contact3 = new Person("John","Michael West"," E","John Doe","Mo","St. Peters","574 Pole ave",63333, 5628592375L);
	
		
		
		
		
		
		
		Directory c1 = new Directory();
		c1.addPerson(contact);
		c1.addPerson(contact2);
		c1.addPerson(contact3);
		
		
		
		int select = 0;
		int updateChoice = 0;
		
		while (select != 5) {
			select = menu();
			switch(select) {
			case 1:
				System.out.println("Insert FirstName");
				contact.setFirstName(input.nextLine());
				System.out.print("Insert middleName  ");
				contact.setMiddleName(input.nextLine());
				System.out.print("Insert lastName  ");
				contact.setLastName(input.nextLine());
				System.out.print("Insert fullName  ");
				contact.setFullName(input.nextLine());
				System.out.print("Insert state ");
				contact.setState(input.nextLine());
				System.out.print("Insert city  ");
				contact.setCity(input.nextLine());
				System.out.print("Insert Street ");
				contact.setStreet(input.nextLine());
				System.out.print("Insert Zipcode ");
				contact.setZipcode(input.nextDouble());
				System.out.print("Insert your Phone Number");
				contact.setPhoneNumber(input.nextLong());
				System.out.println();
				c1.printPersonArray(c1.getDirectory());
		
				break;
			case 2:
				System.out.println("Enter the person phone number you would like to remove");
				long case2 = input.nextLong();
				c1.removePerson(c1.getByPhone(case2));
				
				c1.printPersonArray(c1.getDirectory());
				break;
				
			case 3:
				
				System.out.println("Enter the person phone number you would like to update");
				long case3 = input.nextLong();
				
				c1.getByPhone(case3).getPerson();
				
				updateChoice = 0;
				
				
				while(updateChoice != 1) {
					
					updateChoice = newMenu();
					
					switch(updateChoice) {
					
					case 1 :
						
						System.out.println("Enter your new First Name");
						
						String newFirstName = input.next();
						
						c1.getByPhone(case3).setFirstName(newFirstName);
						
						
						
	                    System.out.println("Enter your new LastName");
						
						String newLastName = input.next();
						
						c1.getByPhone(case3).setFirstName(newLastName);
						
						
						
	             
						
	                    System.out.println("Enter your new MiddleName");
						
						String newMiddleName = input.next();
						
						c1.getByPhone(case3).setMiddleName(newMiddleName);
						
						
						
	             
						
	                  System.out.println("Enter your new newfullName");
						
						String newfullName = input.next();
						
						c1.getByPhone(case3).setFullName(newfullName);
						
						
						
	            
						
	                  System.out.println("Enter new your state");
						
					  String newState = input.next();
						
					  c1.getByPhone(case3).setState(newState);
						
						
						
	              
						
	                  System.out.println("Enter new your city");
						
					  String newCity = input.next();
						
					  c1.getByPhone(case3).setCity(newCity);
						
						
	            
						
	                  System.out.println("Enter new your street");
						
						String newStreet = input.next();
						
						c1.getByPhone(case3).setStreet(newStreet);
						
						
	              
						
	                  System.out.println("Enter new your zipcode");
						
					   Double newZipCode = input.nextDouble();
						
						c1.getByPhone(case3).setZipcode(newZipCode);
						
						System.out.println();
						
	             
						
	                  System.out.println("Enter your new phoneNumber");
						
					  Long newPhoneNumber = input.nextLong();
						
					  c1.getByPhone(case3).setPhoneNumber(newPhoneNumber);
						
						
						contact.getPerson();
						
						
						break;
					
					
					}
					
				}
				
			case 4:
				
				
				int newChoice = 0;
				
				
				while(newChoice != 7) {
					
					newChoice = searchMenu();
					
					switch(newChoice) {
					
					case 1 : 
						
						System.out.println("Enter the person first name you would like to find");
						
						String firstName = input.nextLine();

						c1.printSearchArray(c1.getByFirstName(firstName));
						break;
						
                    case 2 : 
						
						System.out.println("Enter the person last Name you would like to find");
						
						String lastName = input.nextLine();

						c1.printSearchArray(c1.getByLastName(lastName));
						break;
						
						
                   case 3 : 
						
						System.out.println("Enter the person middleName you would like to find");
						
						String middleName = input.nextLine();

						c1.printSearchArray(c1.getByMiddleName(middleName));
						break;
						
						
                   case 4 : 
						
						System.out.println("Enter the person full Name you would like to find");
						
						String fullName = input.nextLine();

						c1.printSearchArray(c1.getByFullName(fullName));
						break;
						
						
                   case 5 : 
						
						System.out.println("Enter the person State you would like to find");
						
						String state = input.nextLine();

						c1.printSearchArray(c1.getByFirstName(state));
						break;
						
						
                   case 6 : 
						
						System.out.println("Enter the person City you would like to find");
						
						String city = input.nextLine();

						c1.printSearchArray(c1.getByCity(city));
						break;
						
						
                   case 7 : 
						
						System.out.println("Enter the person Street you would like to find");
						
						String street = input.nextLine();

						c1.printSearchArray(c1.getByStreet(street));
						break;
					
					
					
					
					
					
					}
					}
				
				
				
				
				
				
			}
		}
		
		
		
		

	}
	
	

	public static int menu() {

		Scanner in = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("--------PHONEBOOK--------");
		System.out.println("************************************");
		System.out.println("--PLEASE SELECT FROM THE FOLLOWING--");
		
		System.out.println("Enter your contact here: ");
		
		System.out.println(" 1  Add a new entry");
        System.out.println(" 2  Delete an entry");
        System.out.println(" 3  Update for an entry");
        System.out.println(" 4  Searchr an entry");
        System.out.println(" 5  Exit program");
        int choice = in.nextInt();
        return choice;
        
      
        
	}
	
	public static int newMenu() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("--PLEASE SELECT FROM THE FOLLOWING--");
		
		System.out.println("Enter 1 to update your contact: ");
		
		
        int choice = in.nextInt();
        return choice;
        
	}
	
     public static int searchMenu() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("--PLEASE SELECT FROM THE FOLLOWING--");
		
		System.out.println("Enter 1 to search your contact by First Name: ");
		System.out.println("Enter 2 to search your contact by Last Name: ");
		System.out.println("Enter 3 to search your contact by MiddleName: ");
		System.out.println("Enter 4 to search your contact by FullName: ");
		System.out.println("Enter 5 to search your contact by State: ");
		System.out.println("Enter 6 to search your contact by City: ");
		System.out.println("Enter 7 to search your contact by Street: ");
		
		
        int choice = in.nextInt();
        return choice;
        
	}

}
