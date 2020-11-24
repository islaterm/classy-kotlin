/**
 * "Memegram" (c) by Ignacio Slater M.
 * "Memegram" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
@file:Suppress("unused")

package cl.ravenhill.memegram

import java.util.*

/**
 * Example of implementing a user on Kotlin.
 *
 * Things to note:
 *  - Constructor defined in the class' signature
 *  - Access modifier for username on the class' constructor
 *  - Custom getter/setter for bio and name
 *  - ``equals`` and ``hasCode`` methods
 *
 * @constructor
 *    Creates a user with a username, a name and a bio.
 * @property username
 *    the username of the user; this should be a unique identifier for the user
 * @property name
 *    (optional) the name of the user with a max length of 20 characters; defaults to ``username``
 * @property bio
 *    (optional) a short description (max. 50 characters) for the user; defaults to blank
 *
 * @author [Ignacio Slater Muñoz](mailto:islaterm@gmail.com)
 */
class User(internal val username: String, name: String = username, bio: String = "") {

  var bio = bio.take(50)
    get() = field.replace("\n", " ")
    set(value) {
      field = value.take(50)
    }

  var name = name.take(20)
    set(value) {
      field = value.take(20)
    }

  fun sendMsg(receiver: User, msg: IMessage, caption: String = "") {
    msg.sendTo(this, receiver, caption)
  }

  fun show(msg: String) {
    println(msg)
  }

  override fun equals(other: Any?): Boolean { // Same as ``override operator fun equals(...)``
    if (this === other) { // ``===`` compares for _reference_ equality
      return true
    }
    if (other !is User) { // Same as ``if (!(other is User)) { ... }``
      return false
    }
    // Note that we don't need to cast ``other`` because of the previous ``if``
    return other.username == username
  }

  override fun hashCode() = Objects.hash(username)
}
