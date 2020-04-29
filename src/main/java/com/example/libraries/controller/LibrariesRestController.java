package com.example.libraries.controller;

import com.example.libraries.domain.Libraries;
import com.example.libraries.service.LibrariesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/libraries")
public class LibrariesRestController {

    private LibrariesService librariesService;

    public LibrariesRestController(LibrariesService librariesService) {
        this.librariesService = librariesService;
    }

    @GetMapping("/{id}")
    public Libraries findLibraryById(@PathVariable Long id){
        return librariesService.findById(id);
    }

    @GetMapping()
    public List<Libraries> findAll(){
        return librariesService.findAll();
    }
}
