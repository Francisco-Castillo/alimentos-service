/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.alimentos.service;

import com.fcastillo.alimentos.model.Alimento;
import com.fcastillo.alimentos.repository.AlimentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcastillo
 */
@Service
public class AlimentoServiceImpl implements IAlimentoService {

  @Autowired
  private AlimentoRepository alimentoRepository;

  @Override
  public List<Alimento> findAll() {
    return alimentoRepository.findAll().subList(0, 50);
  }

}
