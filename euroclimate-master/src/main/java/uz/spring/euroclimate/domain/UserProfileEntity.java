package uz.spring.euroclimate.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

import static uz.spring.euroclimate.util.Constants.TABLE_USER_PROFILE;

@Table(name = TABLE_USER_PROFILE)
public class UserProfileEntity implements Persistable<UUID> {

  private String avatar;
  private String birthDate;
  @CreatedDate private Instant createdDate;
  private String email;
  private String firstName;
  private String fullName;
  @Id private UUID id;
  @Transient private Boolean isNew;
  @LastModifiedDate private Instant lastModifiedDate;
  private String midName;
  private String mobPhoneNo;

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(final String birthDate) {
    this.birthDate = birthDate;
  }

  public Instant getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(final Instant createdDate) {
    this.createdDate = createdDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(final String fullName) {
    this.fullName = fullName;
  }

  @Override
  public UUID getId() {
    return id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  @Override
  public boolean isNew() {
    return isNew;
  }

  public void setNew(final Boolean aNew) {
    isNew = aNew;
  }

  public Instant getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(final Instant lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public String getMidName() {
    return midName;
  }

  public void setMidName(final String midName) {
    this.midName = midName;
  }

  public String getMobPhoneNo() {
    return mobPhoneNo;
  }

  public void setMobPhoneNo(final String mobPhoneNo) {
    this.mobPhoneNo = mobPhoneNo;
  }

  @Override
  public String toString() {
    return "UserProfileEntity{" +
            "avatar='" + avatar + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", createdDate=" + createdDate +
            ", email='" + email + '\'' +
            ", firstName='" + firstName + '\'' +
            ", fullName='" + fullName + '\'' +
            ", id=" + id +
            ", isNew=" + isNew +
            ", lastModifiedDate=" + lastModifiedDate +
            ", midName='" + midName + '\'' +
            ", mobPhoneNo='" + mobPhoneNo + '\'' +
            '}';
  }
}
