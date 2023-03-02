package uz.spring.euroclimate.exception;

public class ApiException extends RuntimeException {

  public ApiException() {}

  public ApiException(final String message) {
    super(message);
  }

  public ApiException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
