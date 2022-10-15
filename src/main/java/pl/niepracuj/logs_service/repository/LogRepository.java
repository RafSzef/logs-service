package pl.niepracuj.logs_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.logs_service.model.entity.Log;

@Repository
public interface LogRepository  extends JpaRepository<Log, Long> {
}
