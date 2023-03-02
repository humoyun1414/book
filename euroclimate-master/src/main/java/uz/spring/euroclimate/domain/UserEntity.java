package uz.spring.euroclimate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import uz.spring.euroclimate.util.UserType;

import java.util.UUID;

import static uz.spring.euroclimate.util.Constants.TABLE_USER;

@Table(name = TABLE_USER)
public class UserEntity {

    private Boolean accountNonLocked;
    private Boolean enabled;
    @Id
    private UUID id;
    private String password;
    private String username;
    private UserType userType;

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(final Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(final UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserEntity{"
                + "accountNonLocked="
                + accountNonLocked
                + ", enabled="
                + enabled
                + ", id="
                + id
                + ", password='"
                + password
                + '\''
                + ", username='"
                + username
                + '\''
                + ", userType="
                + userType
                + '}';
    }
}
