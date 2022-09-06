package oop.practices.Contact;

public class Main {
    public static void main(String[] args){
        ContactsManager myContactManager = new ContactsManager();

        Contact friendKharen = new Contact();
        friendKharen.name = "Kharen";
        friendKharen.phoneNumber = "09123456789";
        myContactManager.addContact(friendKharen);

        Contact friendVevien = new Contact();
        friendVevien.name = "Vevien";
        friendVevien.phoneNumber = "09090909090";
        myContactManager.addContact(friendVevien);

        Contact friendFatima = new Contact();
        friendFatima.name = "Fatima";
        friendFatima.phoneNumber = "09131313131";
        myContactManager.addContact(friendFatima);

        Contact result = myContactManager.searchCotact("Kharen");
        System.out.println(result.phoneNumber);
    }
}
