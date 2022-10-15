package pl.niepracuj.logs_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.niepracuj.logs_service.model.LogMapper;
import pl.niepracuj.logs_service.model.dto.LogDto;
import pl.niepracuj.logs_service.repository.LogRepository;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogMapper logMapper;
    private final LogRepository logRepository;

    @Override
    public LogDto saveLog(LogDto log) {
        return logMapper.toDto(logRepository.save(logMapper.toNewEntity(log)));
    }
}
