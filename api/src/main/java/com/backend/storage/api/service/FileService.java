package com.backend.storage.api.service;

import com.backend.storage.api.entity.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FileService {
    File store(MultipartFile file) throws IOException;

    File findByName(String filename);

    List<File> findAll();

}
