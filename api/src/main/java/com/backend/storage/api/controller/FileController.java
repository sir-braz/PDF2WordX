package com.backend.storage.api.controller;

import com.backend.storage.api.utility.BackendException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileController {


    @GetMapping("/api/convert/text/{field}")
    public ResponseEntity<String> convertText(@PathVariable String field){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/api/convert/image/{filed}")
    public ResponseEntity<String> convertImage(@PathVariable String field){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/api/convert/html/{field}")
    public ResponseEntity<String> convertHtml(@PathVariable String field){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
