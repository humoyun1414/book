package uz.spring.euroclimate.exception;

public class ForbiddenException extends RuntimeException {

  public ForbiddenException() {}

  public ForbiddenException(final String message) {
    super(message);
  }

  public ForbiddenException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public ForbiddenException(final Throwable cause) {
    super(cause);
  }
}
