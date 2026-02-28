package com.finca.cafedb.service;

import com.finca.cafedb.entity.VariedadCafe;
import com.finca.cafedb.repository.VariedadCafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariedadCafeService {

    private final VariedadCafeRepository repository;

    // Inyección por constructor (mejor práctica)
    public VariedadCafeService(VariedadCafeRepository repository) {
        this.repository = repository;
    }

    // Guardar nueva variedad
    public VariedadCafe guardar(VariedadCafe variedadCafe) {
        return repository.save(variedadCafe);
    }

    // Obtener todas las variedades
    public List<VariedadCafe> listarTodas() {
        return repository.findAll();
    }
}