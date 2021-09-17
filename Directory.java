package phoneBookProject;

public class Directory  {
	 //create an array of person
	Person[]Contact = new Person[0];
	
	// adds a person to the array
	public void addPerson(Person newPerson) {
		
		// // create temporary array that is 1 larger than the current array
		Person[]temp = new Person[Contact.length + 1];
		// add the Person in the original array to the temporary one
		for (int i = 0; i < Contact.length; i++) {
			temp[i] = Contact[i];
			
		}
		// add the new Person to the end of the temp array
		temp[temp.length - 1 ]= newPerson;
		// reassign the original array to the new one
		Contact = temp;
	}
	
	public Person[] getDirectory() {
		return Contact;
	}
	
	public void printPersonArray(Person[]findPerson) {
		for(int i = 0; i < findPerson.length; i++) {
			System.out.println("\n------Person Detail------\n");
			Contact[i].getPerson();
		}
		
	}
	
	public void printSearchArray(Person[] search) {
		for(int i = 0; i < search.length; i++) {
			System.out.println("\n------Person Detail------\n");
			search[i].getPerson();
		}
	}
	
	// removes  a person from the array 
	
	public void removePerson(Person removed ) {
	
	// cerates a temporary arrray
		
		Person[] temp = new Person[Contact.length - 1];
		
		int c =0;
		
		// loops through and adds everything the person to be removed to the empty arry
		
		for(int i =0; i < Contact.length; i++) {
			if(Contact[i] != removed) {
				temp[c] = Contact[i];
				c++;
			}
		}
		Contact = temp;
	}
	// search a person by a phone number
	public Person getByPhone(long phone) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getPhoneNumber() == phone) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	
	public void UpdateMenu(Person update) {
		
     Person[] temp = new Person[Contact.length - 1];
		
		int d =0;
		
		// loops through and adds everything the person to be update to the empty arry
		
		for(int i =0; i < Contact.length; i++) {
			if(Contact[i] == update) {
				temp[d] = Contact[i];
				d++;
			}
		}
		Contact = temp;
		
	}
	
	// search a person by a lastName
	
	public Person getUpdatelastName(String lastName) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getLastName() == lastName) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	
	public Person getUpdatefullName(String fullName) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getFullName() == fullName) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	public Person getUpdateState(String state) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getFullName() == state) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	public Person getUpdateCity(String city) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getCity() == city) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	
	public Person getUpdateStreet(String street) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getStreet() == street) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	public Person getUpdateZipcode(double zipcode) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getZipcode() == zipcode) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
	
	public Person getUpdatePhoneNumber(long phoneNumber) {
		int temp = 0;
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getPhoneNumber() == phoneNumber) {
				temp = i;
			break;
		}
		}
		return Contact[temp];
	}
	
 // search by methode( fistName, lastName,....)
   
	public Person[] getByFirstName(String fisrtName) {
		
		int count = 0;
		
		for(int i =0; i < Contact.length; i++) {
			if(Contact[i].getFirstName().equals(fisrtName)) {
				count++;
			}
		}
		Person[] newArray = new Person[count];
		
		int count2 = 0;
		
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getFirstName().equals(fisrtName)) {
				newArray[count2]=Contact[i];
				count2++;
			} 
			
		}
				
		return newArray;		
	}
	
     public Person[] getByLastName(String lastName) {
		
		int count = 0;
		
		for(int i =0; i < Contact.length; i++) {
			if(Contact[i].getLastName().equals(lastName)) {
				count++;
			}
		}
		Person[] newArray = new Person[count];
		
		int count2 = 0;
		
		for(int i = 0; i < Contact.length; i++) {
			if(Contact[i].getLastName().equals(lastName)) {
				newArray[count2]=Contact[i];
				count2++;
			} 
			
		}
				
		return newArray;		
	}
		
     
     public Person[] getByMiddleName(String middleName) {
 		
 		int count = 0;
 		
 		for(int i =0; i < Contact.length; i++) {
 			if(Contact[i].getMiddleName().equals(middleName)) {
 				count++;
 			}
 		}
 		Person[] newArray = new Person[count];
 		
 		int count2 = 0;
 		
 		for(int i = 0; i < Contact.length; i++) {
 			if(Contact[i].getMiddleName().equals(middleName)) {
 				newArray[count2]=Contact[i];
 				count2++;
 			} 
 			
 		}
 				
 		return newArray;		
 	}
 			
		
     public Person[] getByFullName(String fullName) {
  		
  		int count = 0;
  		
  		for(int i =0; i < Contact.length; i++) {
  			if(Contact[i].getFullName().equals(fullName)) {
  				count++;
  			}
  		}
  		Person[] newArray = new Person[count];
  		
  		int count2 = 0;
  		
  		for(int i = 0; i < Contact.length; i++) {
  			if(Contact[i].getFullName().equals(fullName)) {
  				newArray[count2]=Contact[i];
  				count2++;
  			} 
  			
  		}
  				
  		return newArray;		
  	}
  			
   
     public Person[] getByState(String state) {
   		
   		int count = 0;
   		
   		for(int i =0; i < Contact.length; i++) {
   			if(Contact[i].getState().equals(state)) {
   				count++;
   			}
   		}
   		Person[] newArray = new Person[count];
   		
   		int count2 = 0;
   		
   		for(int i = 0; i < Contact.length; i++) {
   			if(Contact[i].getState().equals(state)) {
   				newArray[count2]=Contact[i];
   				count2++;
   			} 
   			
   		}
   				
   		return newArray;		
   	}
     
     public Person[] getByCity(String city) {
    		
    		int count = 0;
    		
    		for(int i =0; i < Contact.length; i++) {
    			if(Contact[i].getCity().equals(city)) {
    				count++;
    			}
    		}
    		Person[] newArray = new Person[count];
    		
    		int count2 = 0;
    		
    		for(int i = 0; i < Contact.length; i++) {
    			if(Contact[i].getCity().equals(city)) {
    				newArray[count2]=Contact[i];
    				count2++;
    			} 
    			
    		}
    				
    		return newArray;		
    	}
     
      public Person[] getByStreet(String street) {
 		
 		int count = 0;
 		
 		for(int i =0; i < Contact.length; i++) {
 			if(Contact[i].getStreet().equals(street)) {
 				count++;
 			}
 		}
 		Person[] newArray = new Person[count];
 		
 		int count2 = 0;
 		
 		for(int i = 0; i < Contact.length; i++) {
 			if(Contact[i].getStreet().equals(street)) {
 				newArray[count2]=Contact[i];
 				count2++;
 			} 
 			
 		}
 				
 		return newArray;		
 	}
     
      
      
	
	
	
	
	
	
	
	

}
