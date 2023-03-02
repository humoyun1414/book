package uz.spring.euroclimate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import static uz.spring.euroclimate.util.Constants.TABLE_ROLE;

@Table(name = TABLE_ROLE)
public class RoleEntity {
  @Id private int id;
  private String name;

  private String displayNameRu;

  private String displayNameUzCryl;

  private String displayNameUzLatn;

  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getDisplayNameRu() {
    return displayNameRu;
  }

  public void setDisplayNameRu(String displayNameRu) {
    this.displayNameRu = displayNameRu;
  }

  public String getDisplayNameUzCryl() {
    return displayNameUzCryl;
  }

  public void setDisplayNameUzCryl(String displayNameUzCryl) {
    this.displayNameUzCryl = displayNameUzCryl;
  }

  public String getDisplayNameUzLatn() {
    return displayNameUzLatn;
  }

  public void setDisplayNameUzLatn(String displayNameUzLatn) {
    this.displayNameUzLatn = displayNameUzLatn;
  }

  @Override
  public String toString() {
    return "RoleEntity{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
