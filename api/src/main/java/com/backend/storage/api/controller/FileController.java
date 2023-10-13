package com.backend.storage.api.controller;

import com.backend.storage.api.entity.File;
import com.backend.storage.api.utility.BackendException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @PostMapping("/api/upload")
    public ResponseEntity<File> uploadFile(@RequestParam("file") MultipartFile multipartFile){

    }

    @GetMapping("/api/convert/text/{field}")

    @GetMapping("/api/convert/image/{filed}")

    @GetMapping("/api/convert/html/{field}")

}
