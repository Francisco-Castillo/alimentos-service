/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.alimentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author fcastillo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "singluten")
public class Alimento {

  @Id
  @Field(name = "_id")
  private String id;

  @Field(name = "marca")
  private String mark;
  
  @Field(name = "nombre_fantasia")
  private String fantasyName;
  
  @Field(name = "denominacion")
  private String denomination;
  
  @Field(name = "RNPA")
  private String rnpa;
  

}
