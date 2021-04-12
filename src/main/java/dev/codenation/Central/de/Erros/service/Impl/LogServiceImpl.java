package dev.codenation.Central.de.Erros.service.Impl;

import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.repository.LogRepository;
import dev.codenation.Central.de.Erros.service.Interfaces.LogServiceInterface;
import org.springframework.stereotype.Service;

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
        return logRepository.findAllByFilter(filter, value);
    }
}
