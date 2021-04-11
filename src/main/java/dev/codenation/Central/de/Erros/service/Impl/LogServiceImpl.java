package dev.codenation.Central.de.Erros.service.Impl;

import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.repository.LogRepository;
import dev.codenation.Central.de.Erros.service.Interfaces.LogServiceInterface;
import org.springframework.stereotype.Service;

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
    public Log getAll() {
        return null;
    }

    @Override
    public Log getById(Long id) {
        return null;
    }

    @Override
    public Log getByFilter() {
        return null;
    }
}
