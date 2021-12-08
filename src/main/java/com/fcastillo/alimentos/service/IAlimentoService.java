/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.alimentos.service;

import com.fcastillo.alimentos.model.Alimento;
import java.util.List;

/**
 *
 * @author fcastillo
 */
public interface IAlimentoService {

  List<Alimento> findAll();
}
