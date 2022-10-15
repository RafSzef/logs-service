package pl.niepracuj.logs_service.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.niepracuj.logs_service.model.dto.LogDto;
import pl.niepracuj.logs_service.model.entity.Log;

@Component
@RequiredArgsConstructor
public class LogMapper {

    public LogDto toDto(Log log) {
       return LogDto.builder()
               .message(log.getMessage())
               .loggedOn(log.getLoggedOn())
               .build();
    }

    public Log toNewEntity(LogDto logDto) {
        return Log.builder()
                .message(logDto.getMessage())
                .loggedOn(logDto.getLoggedOn())
                .build();
    }
}
