package tech.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.spring_security.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
