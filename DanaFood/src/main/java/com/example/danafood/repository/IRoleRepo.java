package com.example.danafood.repository;

import com.example.danafood.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepo extends CrudRepository<Role, Long> {
}
