package com.backend.storage.api.controller;

import com.backend.storage.api.entity.File;
import com.backend.storage.api.utility.BackendException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ConversionController {

    @PostMapping("/api/upload")
    public ResponseEntity<File> uploadFile(@RequestParam("file") MultipartFile multipartFile){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
