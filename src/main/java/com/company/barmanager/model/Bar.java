package com.company.barmanager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Bar {

  @Id
  @Column(name = "bar_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "bar_name")
  private String barName;

  @OneToMany(cascade = CascadeType.MERGE)
  @JoinColumn(name = "bar_id")
  private List<Item> items;



}