package com.techcognitives.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techcognitives.model.ERole;
import com.techcognitives.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
