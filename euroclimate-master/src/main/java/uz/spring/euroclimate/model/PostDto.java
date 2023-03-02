package uz.spring.euroclimate.model;

import java.time.Instant;
import java.util.UUID;

public record PostDto(String description,
                      String name,
                      Instant createdDate,
                      Instant lastModifiedDate,
                      UUID id,
                      Double price) {

}
