package com.backend.storage.api.controller;

import com.backend.storage.api.entity.File;
import com.backend.storage.api.service.ConversionService;
import com.backend.storage.api.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/convert")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/text/{fileId}")
    public ResponseEntity<String> convertToText(@PathVariable Long fileId) {
        File file = (File) conversionService.findById(fileId).orElse(null);

        if(file != null){

        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
