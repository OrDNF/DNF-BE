package com.example.danafood.service.Role;

import com.example.danafood.model.Role;
import com.example.danafood.repository.IRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepo iRoleRepo;

    @Override
    public Role getRoleByName(String name) {
        return iRoleRepo.findByRoleName(name);
    }
}
