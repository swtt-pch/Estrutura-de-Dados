package exception;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimiteExtrapoladoException extends Exception{
    String datahora;
    public LimiteExtrapoladoException(String message) {
        super(message);
        Clock c = Clock.systemUTC();
        this.datahora = LocalDateTime.now(c).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public String getDatahora() {
        return datahora;
    }
}
