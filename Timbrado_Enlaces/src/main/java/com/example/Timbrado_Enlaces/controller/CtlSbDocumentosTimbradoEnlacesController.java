package com.example.Timbrado_Enlaces.controller;

import com.example.Timbrado_Enlaces.model.CtlSbDocumentosTimbradoEnlaces;
import com.example.Timbrado_Enlaces.service.CtlSbDocumentosTimbradoEnlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CtlSbDocumentosTimbradoEnlacesController {

    @Autowired
    private CtlSbDocumentosTimbradoEnlacesService ctlSbDocumentosTimbradoEnlacesService;

    public CtlSbDocumentosTimbradoEnlacesController(CtlSbDocumentosTimbradoEnlacesService ctlSbDocumentosTimbradoEnlacesService) {
        this.ctlSbDocumentosTimbradoEnlacesService = ctlSbDocumentosTimbradoEnlacesService;
    }

    @GetMapping("/obtenertodos")
    private List<CtlSbDocumentosTimbradoEnlaces> obtenerTodos(){

        return ctlSbDocumentosTimbradoEnlacesService.findAll();
    }

}
