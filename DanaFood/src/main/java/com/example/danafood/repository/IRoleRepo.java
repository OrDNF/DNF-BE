package com.example.danafood.repository;

import com.example.danafood.dto.RoleDto;
import com.example.danafood.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IRoleRepo extends CrudRepository<Role, Long> {
    RoleDto findByRoleName(String name);
}
