package JavaII;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by roxana on 5/29/17.
 */
public class ContactsManager {
    private List<String> contacts;
    private Path contactsPath;
    private PrintStream out;
    private Input input;

    public ContactsManager(String directory, String filename) throws IOException {
        contacts = new ArrayList<>();
        contactsPath = Paths.get(directory, filename);
        createDirectory(directory);
        createFile();
        input = new Input();
        out = System.out;
        readAllContacts();
    }

    private void createFile() throws IOException {
        if(Files.notExists(contactsPath)) {
            Files.createFile(contactsPath);
        }
    }

    private void createDirectory(String directory) throws IOException {
        Path contactsDirectory = Paths.get(directory);
        if(Files.notExists(contactsDirectory)) {
            Files.createDirectory(contactsDirectory);
        }
    }

    public void readAllContacts() throws IOException {
        contacts.addAll(Files.readAllLines(contactsPath));
    }

    public void printContacts() throws IOException {
        for (String contact : contacts) {
            out.println(contact);
        }
    }

    public int mainMenu() {
        out.println(
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        return input.getInt();
    }

    public void addContact() {
        String name, phone;
        out.println("Enter name");
        name = input.getStringLn();
        out.println("Enter phone number");
        do {
            phone = input.getStringLn().trim();
        } while (!ifValidPhone(phone));
        phone = formatNumber(phone);
        contacts.add(name + " | " + phone);
    }

    private boolean ifValidPhone(String phone) {
        if(phone.length() == 10 || phone.length() == 7) {
            return true;
        } else {
            out.println("Enter a valid Phone Number");
            return false;
        }
    }

    public int searchContactByName(String name) {
        // return index from contacts if contact exist, or -1
        int index = 0;
        for (String contact : contacts) {
            String contactName = contact.substring(0, contact.indexOf("|")-1).trim();
            if(contactName.equalsIgnoreCase(name.trim())) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void displayContact() {
        out.println("Enter name");
        String name = input.getStringLn();
        if(searchContactByName(name) == -1) {
            out.println("This contact doesn't exist");
        } else {
            String info = contacts.get(searchContactByName(name));
            String phone = info.substring(info.indexOf("|")+1, info.length()).trim();
            out.println("Phone number of " + name + " is: " + phone);
        }
    }

    public void deleteContact() {
        out.println("Enter name");
        String name = input.getStringLn();
        if(searchContactByName(name) != -1) {
            contacts.remove(searchContactByName(name));
        }
    }

    public void writeFile() throws IOException {
        Files.write(contactsPath, contacts);
    }

    public void performAction(int option) throws IOException {
        switch (option) {
            case 1:
                printContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                displayContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                writeFile();
        }
    }

    public String formatNumber(String phone) {
        if(phone.length() == 10) {
            return "(" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6, phone.length());
        }
        return phone.substring(0, 3) + "-" + phone.substring(3, phone.length());
    }
}

class TestingContactManager {
    public static void main(String[] args) throws IOException {
        ContactsManager contacts = new ContactsManager("info", "contacts");
        int option;

        do {
            option = contacts.mainMenu();
            contacts.performAction(option);
        } while (option !=5);
    }
}