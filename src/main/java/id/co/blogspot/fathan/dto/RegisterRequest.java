package id.co.blogspot.fathan.dto;

import java.io.Serializable;

/**
 * Created by fathan.mustaqiim on 10/24/2016.
 */
public class RegisterRequest implements Serializable {

  private String username;
  private String password;
  private String name;

  public RegisterRequest() {
  }

  public RegisterRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public RegisterRequest(String username, String password, String name) {
    this(username, password);
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "RegisterRequest{" +
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

}
