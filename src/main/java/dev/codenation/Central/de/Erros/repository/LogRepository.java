package dev.codenation.Central.de.Erros.repository;

import dev.codenation.Central.de.Erros.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

    @Query(value = "select * from logs where :filter = :value", nativeQuery = true)
    List<Log> findAllByFilter(@Param("filter") String filter,@Param("value") String value);
}