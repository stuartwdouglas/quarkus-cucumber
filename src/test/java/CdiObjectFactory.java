import io.cucumber.core.backend.ObjectFactory;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.spi.CDI;

public class CdiObjectFactory implements ObjectFactory {

  public CdiObjectFactory() {
  }

  public void start() {
    // HERE START QUARKUS
  }

  public void stop() {
    // HERE STOP QUARKUS
  }

  public boolean addClass(Class<?> clazz) {
    return true;
  }

  public <T> T getInstance(Class<T> type) {
    Instance<T> selected = CDI.current().select(type);
    if (selected.isUnsatisfied()) {
      throw new IllegalArgumentException(type.getName() + " is no CDI bean.");
    } else {
      return selected.get();
    }
  }

}
