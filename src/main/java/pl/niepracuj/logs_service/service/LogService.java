package pl.niepracuj.logs_service.service;

import pl.niepracuj.logs_service.model.dto.LogDto;
import pl.niepracuj.logs_service.model.entity.Log;

public interface LogService {
    public LogDto saveLog(LogDto logDto);
}
