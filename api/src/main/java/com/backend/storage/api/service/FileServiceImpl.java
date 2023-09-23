package com.backend.storage.api.service;
import com.backend.storage.api.entity.File;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class FileServiceImpl implements FileService{


    @Override
    public File store(MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public File findByName(String filename) {
        return null;
    }

    @Override
    public List<File> findAll() {
        return null;
    }
}