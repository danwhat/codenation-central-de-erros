package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.controller.dto.LogDTO;
import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.service.Impl.LogServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/logs")
public class LogController {

    public LogController(LogServiceImpl logService) {
        this.logService = logService;
    }

    private final LogServiceImpl logService;

    //create
    @PostMapping
    public Log create(@RequestBody Log log) {
        return logService.create(log);
    }
    //getAll
    @GetMapping
    public List<LogDTO> getAll() {
        List<Log> listaLog = logService.getAll();
        return listaLog.stream().map(log -> new LogDTO(log)).collect(Collectors.toList());
    }
    //getById
    //@GetMapping("/{id}")

    //getByFilter
}
