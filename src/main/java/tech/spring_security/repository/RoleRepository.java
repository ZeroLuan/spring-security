package tech.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.spring_security.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
