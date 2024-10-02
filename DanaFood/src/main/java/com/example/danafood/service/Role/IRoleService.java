package com.example.danafood.service.Role;

import com.example.danafood.dto.RoleDto;
import com.example.danafood.model.Role;

public interface IRoleService {
    RoleDto getRoleByName(String name);
}
