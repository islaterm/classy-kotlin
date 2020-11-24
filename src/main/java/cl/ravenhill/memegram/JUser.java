// "Memegram" (c) by Ignacio Slater M.
// "Memegram" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 package cl.ravenhill.memegram;

import java.util.Objects;

/**
 * Example of implementing a user in Java.
 *
 * @author Ignacio Slater
 */
@SuppressWarnings("ALL")
public class JUser {
  private final String username;
  private String name;
  private String bio;

  /**
   * Creates a new user with a username, with a name and a bio.
   */
  public JUser(String username, String name, String bio) {
    this.username = username;
    this.name = name;
    this.bio = bio;
  }

  /**
   * Creates a new user with a username with default name and an empty bio.
   */
  public JUser(String username) {
    this.username = username;
    this.name = username;
    this.bio = "";
  }

  /**
   * This user's username.
   */
  public String getUsername() {
    return username;
  }

  /**
   * The user's name
   */
  public String getName() {
    return name;
  }

  /**
   * Changes the name of this user.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The bio of this user.
   */
  public String getBio() {
    return bio;
  }

  /**
   * Changes the bio of this user.
   */
  public void setBio(String bio) {
    this.bio = bio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof JUser)) {
      return false;
    }
    JUser jUser = (JUser) o;
    return getUsername().equals(jUser.getUsername());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUsername());
  }
}
