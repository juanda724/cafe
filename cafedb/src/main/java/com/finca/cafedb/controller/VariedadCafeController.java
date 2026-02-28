package com.finca.cafedb.controller;

import com.finca.cafedb.entity.VariedadCafe;
import com.finca.cafedb.service.VariedadCafeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cafes")
public class VariedadCafeController {

    private final VariedadCafeService service;

    public VariedadCafeController(VariedadCafeService service) {
        this.service = service;
    }

    // Endpoint POST
    @PostMapping
    public VariedadCafe crear(@RequestBody VariedadCafe variedadCafe) {
        return service.guardar(variedadCafe);
    }

    // Endpoint GET
    @GetMapping
    public List<VariedadCafe> listar() {
        return service.listarTodas();
    }
}