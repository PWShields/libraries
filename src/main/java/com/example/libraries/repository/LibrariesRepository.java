package com.example.libraries.repository;

import com.example.libraries.domain.Libraries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrariesRepository extends CrudRepository<Libraries, Long> {

}
