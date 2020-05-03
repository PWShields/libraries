package com.example.libraries.service;

import com.example.libraries.domain.Libraries;
import com.example.libraries.repository.LibrariesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpClientErrorException;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class LibrariesService {
    
    private LibrariesRepository librariesRepository;

    public LibrariesService(LibrariesRepository librariesRepository) {
        this.librariesRepository = librariesRepository;
    }

    public Libraries findById(Long id) {
        return librariesRepository.findById(id).orElse(null);
    }

    public List<Libraries> findAll(){
        return (List<Libraries>) librariesRepository.findAll();
    }
}
