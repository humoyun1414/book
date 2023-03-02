package uz.spring.euroclimate.exception;

public class FileUploadException extends RuntimeException {

  public FileUploadException() {}

  public FileUploadException(final String message) {
    super(message);
  }

  public FileUploadException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
