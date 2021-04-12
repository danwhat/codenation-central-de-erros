package dev.codenation.Central.de.Erros.controller;

import dev.codenation.Central.de.Erros.controller.dto.LogDTO;
import dev.codenation.Central.de.Erros.model.Log;
import dev.codenation.Central.de.Erros.service.Impl.LogServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
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
    // getByFilter
    @GetMapping
    public List<LogDTO> getAllAndgetByFilter(@PathParam("filter") String filter, @PathParam("value")String value) {
        if (filter == null) {
            List<Log> listaLog = logService.getAll();
            return listaLog.stream().map(log -> new LogDTO(log)).collect(Collectors.toList());
        }  else {
            List<Log> listaLog = logService.getByFilter(filter, value);
            return listaLog.stream().map(log -> new LogDTO(log)).collect(Collectors.toList());
        }
    }
    //getById
    @GetMapping("/{id}")
    public ResponseEntity<Log> getById(@PathVariable Long id) {
        Optional<Log> log = logService.getById(id);
        return log.map(value -> ResponseEntity.status(HttpStatus.OK).body(value))
               .orElseGet(() -> ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null));
    }

}