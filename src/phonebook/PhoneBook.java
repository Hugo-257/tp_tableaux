package phonebook;

import java.util.ArrayList;

public class PhoneBook{
    ArrayList<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact tmp = new Contact(name, phoneNumber);
        this.contacts.add(tmp);
    }

    public ArrayList<String> getPhoneNumbers(String name) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (Contact contact : this.contacts) {
            if (contact.name == name) {
                phoneNumbers.add(contact.phoneNumber);
            }
        }
        return phoneNumbers;
    }

    public ArrayList<String> getNames(String phoneNumber) {
        ArrayList<String> names = new ArrayList<>();
        for (Contact contact : this.contacts) {
            if (contact.phoneNumber == phoneNumber) {
                names.add(contact.name);
            }
        }
        return names;
    }
}
