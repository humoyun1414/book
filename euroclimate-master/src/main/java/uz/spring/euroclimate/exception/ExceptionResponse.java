package uz.spring.euroclimate.exception;

import org.immutables.builder.Builder;
import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.NoSuchElementException;

import static uz.spring.euroclimate.exception.ErrorCodes.*;

public record ExceptionResponse(
    int code, String status, String path, String message, String timestamp) {

  @Builder.Constructor
  public ExceptionResponse(final Exception exception, final String path, final HttpStatus status) {
    this(
        findErrorCode(exception),
        String.format("%d %s", status.value(), status.getReasonPhrase()),
        path,
        exception.getMessage(),
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
            .withZone(ZoneId.of("UTC+5"))
            .format(Instant.now()));
  }

  private static int findErrorCode(final Exception e) {
    if (e instanceof ApiException) {
      return API_ERROR_CODE;
    }

    if (e instanceof AlreadyExistsException) {
      return ALREADY_EXISTS_ERROR_CODE;
    }

    if (e instanceof NoSuchElementException) {
      return NOT_FOUND_ERROR_CODE;
    }

    if (e instanceof NullPointerException) {
      return NULL_POINTER_ERROR_CODE;
    }

    if (e instanceof UnsupportedOperationException) {
      return UNSUPPORTED_OPERATION_ERROR_CODE;
    }

    if (e instanceof InvalidArgumentException) {
      return INVALID_ARGUMENT_ERROR_CODE;
    }

    if (e instanceof InvalidCredentialsException) {
      return INVALID_CREDENTIALS_ERROR_CODE;
    }

    if (e instanceof InvalidTokenException) {
      return INVALID_TOKEN_ERROR_CODE;
    }

    if (e instanceof InvalidOperationException) {
      return INVALID_OPERATION_ERROR_CODE;
    }

    if (e instanceof LockingConflictException) {
      return LOCKING_CONFLICT_ERROR_CODE;
    }

    if (e instanceof UnauthorizedException) {
      return UNAUTHORIZED_ERROR_CODE;
    }

    if (e instanceof CreateForbiddenException) {
      return CREATE_FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof DeleteForbiddenException) {
      return DELETE_FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof ListForbiddenException) {
      return LIST_FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof RetrieveForbiddenException) {
      return RETRIEVE_FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof UpdateForbiddenException) {
      return UPDATE_FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof UserBlockedException) {
      return USER_BLOCKED_ERROR_CODE;
    }

    if (e instanceof ForbiddenException) {
      return FORBIDDEN_ERROR_CODE;
    }

    if (e instanceof JsonParsingException) {
      return JSON_PARSING_ERROR_CODE;
    }

    if (e instanceof FileDownloadException) {
      return FILE_DOWNLOAD_ERROR_CODE;
    }

    if (e instanceof FileRemoveException) {
      return FILE_REMOVE_ERROR_CODE;
    }

    if (e instanceof FileUploadException) {
      return FILE_UPLOAD_ERROR_CODE;
    }

    if (e instanceof TimeoutException) {
      return TIMEOUT_ERROR_CODE;
    }

    if (e instanceof ServiceUnavailableException) {
      return SERVICE_UNAVAILABLE_ERROR_CODE;
    }

    return INTERNAL_ERROR_CODE;
  }
}
