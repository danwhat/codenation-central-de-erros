package dev.codenation.Central.de.Erros.service.Impl;

import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.repository.LogRepository;
import dev.codenation.Central.de.Erros.service.Interfaces.LogServiceInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LogServiceImpl implements LogServiceInterface {

    private final LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public Log create(Log log) {
        return logRepository.save(log);
    }

    @Override
    public List<Log> getAll() {
        return logRepository.findAll();
    }

    @Override
    public Optional<Log> getById(Long id) {
        return logRepository.findById(id);
    }

    @Override
    public List<Log> getByFilter(String filter, String value) {
        switch (filter) {
            case "level" :
                return logRepository.findByLevel(value);
            case "description" :
                return logRepository.findByDescription(value);
            case "origin" :
                return logRepository.findByOrigin(value);
            case "date" :
                return logRepository.findByDate(LocalDateTime.parse(value));
            case "quantity" :
                return logRepository.findByQuantity(Long.valueOf(value));
            default:
                return null;
    }
}
}