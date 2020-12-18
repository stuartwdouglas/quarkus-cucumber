package controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class DateProvider {

  public LocalDateTime getNow() {
    return LocalDateTime.now();
  }

}
