package com.zoro.springbootjwtserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoro.springbootjwtserver.models.ERole;
import com.zoro.springbootjwtserver.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
Optional<Role> findByName(ERole name);    
}
