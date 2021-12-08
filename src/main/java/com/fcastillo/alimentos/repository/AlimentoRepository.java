/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.alimentos.repository;

import com.fcastillo.alimentos.model.Alimento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fcastillo
 */
@Repository
public interface AlimentoRepository extends MongoRepository<Alimento, String>{
  
}
