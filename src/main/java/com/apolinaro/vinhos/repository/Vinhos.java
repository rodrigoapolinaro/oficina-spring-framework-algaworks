package com.apolinaro.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apolinaro.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

}
