package com.taller.agenda.Controller;

import com.taller.agenda.Model.ContactBook;
import com.taller.agenda.Service.ContactBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/V1") //<-- Buenas prácticas
public class ContactBookController {
  @Autowired
  private ContactBookService contactBookService;
  
  @GetMapping("/listar")
  public ArrayList<ContactBook> getAll(){
    return contactBookService.getAll();
  }
  
  @PostMapping("/agregar")
  public ContactBook addContact(@RequestBody ContactBook contact){
    return contactBookService.addContact(contact);
  }
  
  @DeleteMapping("/contact/{id}")
  public void deleteContact(@PathVariable Long id){
    contactBookService.deleteContact(id);
  }
}
