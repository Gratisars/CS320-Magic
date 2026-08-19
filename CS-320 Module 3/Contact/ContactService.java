/**Mark Geisler
*mark.geisler@snhu.edu
*CS-320 3-2 Milestone: Contact Service
*7/14/2026
*/

package Contact;


import java.util.List;
import java.util.ArrayList;


public class ContactService {
	
	int currentIDNum = 0; //pseudo GUID

	//creates new arraylist that holds the objects
	public static List<Contact> contactList = new ArrayList<Contact>();
	
	/**
	 *adds contact at the system control index id
	 *param firstName
	 *param lastName
	 *param phoneNumber
	 *param address
	 */
	public void addContact(String firstName, String lastName,
			String phoneNumber, String address) {
		
		String stringID = Integer.toString(currentIDNum);
		
		Contact newContact = new Contact(stringID, firstName, lastName, phoneNumber, address);
		contactList.add(newContact.getContactID(),newContact);
		
		//increment ID NUM
		++currentIDNum;

	}
	
	/**
	 *deletes contact as the index ID
	 *param ID
	 */	
	public void deleteContact(String ID) {
		int intID = Integer.valueOf(ID);


		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == intID) {
				contactList.remove(i);
			}
		}
	}
	
	/**
	 *edits the First Name of the Contact Object contactID
	 *uses the setFirstName method
	 *param contactID
	 *param firstName
	 */
	public void editFirstName(String contactID, String firstName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setFirstName(firstName);				
			}			
		}	
	}
	
	/**
	 *edits the Lame Name of the Contact Object contactID
	 *uses the setLastName method
	 *param contactID
	 *param lastName
	 */
	public void editLastName(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLastName(lastName);				
			}			
		}	
	}
	public void editNumber(String contactID, String phoneNumber) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setPhoneNumber(phoneNumber);				
			}			
		}	
	}
	public void editAddress(String contactID, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);				
			}			
		}	
	}

}
