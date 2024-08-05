package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grocery.addItems("cherry,artichoke");
        Contact no1 = Contact.createContact("Şevval","05445415498");
        Contact no2 = Contact.createContact("Melih","05425415498");
        Contact no3 = Contact.createContact("Metin","05385415498");
        MobilePhone mp = new MobilePhone("Benim numaram");
        mp.getMyContacts();
        mp.addNewContact(no1);
        mp.addNewContact(no2);
        mp.printContact();
        System.out.println("*****************************");
        mp.updateContact(no1,no3);
        mp.addNewContact(no1);
        mp.printContact();
        MobilePhone mobilePhone;
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "123123123"));
        contacts.add(new Contact("Jane Doe", "124124124"));
        contacts.add(new Contact("Baby Doe", "125125125"));
        mobilePhone = new MobilePhone("11111111", contacts);
        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));
        mobilePhone.removeContact(contact);
        System.out.println(mobilePhone.findContact(contact));
        System.out.println(mobilePhone.getMyContacts().size());
    }

}
