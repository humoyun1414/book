package uz.spring.euroclimate.exception;

public class InternalException extends RuntimeException {

  public InternalException() {}

  public InternalException(final String message) {
    super(message);
  }

  public InternalException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public InternalException(final Throwable cause) {
    super(cause);
  }

  public InternalException(
      final String message,
      final Throwable cause,
      final boolean enableSuppression,
      final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
