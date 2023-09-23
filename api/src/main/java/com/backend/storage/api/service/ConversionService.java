package com.backend.storage.api.service;

import java.util.Optional;

public interface ConversionService {
    Optional<Object> findById(Long fileId);
}
