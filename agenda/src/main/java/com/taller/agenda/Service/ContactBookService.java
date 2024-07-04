package com.taller.agenda.Service;

import com.taller.agenda.Model.ContactBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContactBookService {
  private ArrayList<ContactBook> listContacts = new ArrayList<>();
  private Long id_contact = 1L;
  
  public ArrayList<ContactBook> getAll(){
    return listContacts;
  }
  
  public ContactBook addContact(ContactBook contact){
    contact.setId(id_contact++);
    listContacts.add(contact);
    return contact;
  }
  
  public ContactBook findContact(Long id){
    for (ContactBook contact: listContacts){
      if(contact.getId().equals(id)){
        return contact;
      }
    }
    return null;
  }
  
  public void deleteContact(Long id){
    ContactBook contact = findContact(id);
    if(contact != null){
      listContacts.remove(contact);
    }
  }
  // método en proceso
  public void updateContact(Long id, String name){
    ContactBook contact = findContact(id);
    if(contact != null){
      contact.setName(name);
    }
  }
  
}
