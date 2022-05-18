package com.example.Timbrado_Enlaces.service.impl;

import com.example.Timbrado_Enlaces.model.CtlSbDocumentosTimbradoEnlaces;
import com.example.Timbrado_Enlaces.repository.CtlSbDocumentosTimbradoEnlacesRepository;
import com.example.Timbrado_Enlaces.service.CtlSbDocumentosTimbradoEnlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtlSbDocumentosTimbradoEnlacesServiceImpl implements CtlSbDocumentosTimbradoEnlacesService {

    @Autowired
    private CtlSbDocumentosTimbradoEnlacesRepository ctlSbDocumentosTimbradoEnlacesRepository;

    public CtlSbDocumentosTimbradoEnlacesServiceImpl(CtlSbDocumentosTimbradoEnlacesRepository ctlSbDocumentosTimbradoEnlacesRepository) {
        this.ctlSbDocumentosTimbradoEnlacesRepository = ctlSbDocumentosTimbradoEnlacesRepository;
    }

    @Override
    public List<CtlSbDocumentosTimbradoEnlaces> findAll() {
        return ctlSbDocumentosTimbradoEnlacesRepository.findAll();
    }

    @Override
    public CtlSbDocumentosTimbradoEnlaces findById(Integer id) {
        return null;
    }

    @Override
    public CtlSbDocumentosTimbradoEnlaces save(CtlSbDocumentosTimbradoEnlaces ctlSbDocumentosTimbradoEnlaces) {
        return null;
    }

    @Override
    public CtlSbDocumentosTimbradoEnlaces update(CtlSbDocumentosTimbradoEnlaces ctlSbDocumentosTimbradoEnlaces, Integer id) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
