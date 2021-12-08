/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.alimentos.controller;

import com.fcastillo.alimentos.model.Alimento;
import com.fcastillo.alimentos.service.AlimentoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcastillo
 */
@RestController
@RequestMapping(value = "/alimentos")
public class AlimentoController {

  @Autowired
  private AlimentoServiceImpl alimentoService;

  @GetMapping(value = "/sin-gluten")
  public ResponseEntity<Object> findAll() {
    List<Alimento> alimentos = alimentoService.findAll();
    return new ResponseEntity<>(alimentos, HttpStatus.OK);
  }
}
