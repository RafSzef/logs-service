package pl.niepracuj.logs_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogMapper logMapper;
    private final LogService logService;

    @PostMapping
    public LogDto createLog(@RequestBody LogDto logDto) {
        return logMapper.toDto(logService.saveLog(logMapper.toNewEntity(logDto)));
    }
}
