package com.taller.agenda.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactBook {
  private String name;
  private String phone;
  private boolean blocked;
  private Long id;
}
