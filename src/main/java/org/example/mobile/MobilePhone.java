package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }
    public MobilePhone(String myNumber, List<Contact> myContacts){
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }
    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        } else return false;
    }
    public boolean updateContact(Contact previous, Contact updated){
        if(myContacts.contains(previous)){
            previous.setName(updated.getName());
            previous.setPhoneNumber(updated.getPhoneNumber());
            return true;
        } else return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            getMyContacts().remove(contact);
            return true;
        } else {
            return false;
        }
    }
    public int findContact(Contact contact){
        if(myContacts.contains(contact)){
            return getMyContacts().indexOf(contact);
        } else return -1;
    }
    public int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for(Contact contact: myContacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    public void printContact(){
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println(i+1 + "." + myContacts.get(i).getName() + "->" + myContacts.get(i).getPhoneNumber());
        }
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }
}
