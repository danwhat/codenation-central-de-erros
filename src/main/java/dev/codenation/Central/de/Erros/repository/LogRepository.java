package dev.codenation.Central.de.Erros.repository;

import dev.codenation.Central.de.Erros.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

    List<Log> findByLevel(String value);
    List<Log> findByDescription(String value);
    List<Log> findByOrigin(String value);
    List<Log> findByDate(LocalDateTime value);
    List<Log> findByQuantity(Long value);
}