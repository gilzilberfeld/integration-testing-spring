package atd.spring.server.exceptions;

public class UnknownCurrencyException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public UnknownCurrencyException(String currency) {
    super("Unknown currency "+currency);
  }

}