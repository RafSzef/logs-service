package pl.niepracuj.logs_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.niepracuj.logs_service.model.LogMapper;
import pl.niepracuj.logs_service.model.dto.LogDto;
import pl.niepracuj.logs_service.service.LogService;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogMapper logMapper;
    private final LogService logService;

    @PostMapping
    public LogDto createLog(@RequestBody LogDto logDto) {
        return logService.saveLog(logDto);
    }
}
