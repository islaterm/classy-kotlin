/**
 * "Memegram" (c) by Ignacio Slater M.
 * "Memegram" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
@file:Suppress("SpellCheckingInspection", "unused")

package cl.ravenhill.memegram

import java.io.File

/**
 * Common interface for all messages.
 *
 * @property id
 *    a unique identifier for the message
 * @property content
 *    the message's content
 */
interface IMessage {
  val id: Int
  val content: Any

  /**
   * Sends a message with aa caption.
   */
  fun sendTo(sender: User, receiver: User, caption: String)
}

data class Meme(override val id: Int, override val content: String) : IMessage {

  override fun sendTo(sender: User, receiver: User, caption: String) {
    receiver.show("${sender.name}: $this\n$caption")
    println("${receiver.name}: lol")
  }
}

open class Animol(override val id: Int, override val content: File, open val cuteness: Int) :
  IMessage {

  override fun sendTo(sender: User, receiver: User, caption: String) {
    receiver.show("${sender.name}: $this\n$caption")
    println("${receiver.name}: " + "a${"w".repeat(this.cuteness)}")
  }
}

data class AnimolPic(
  override val id: Int,
  override val content: File,
  override val cuteness: Int
) : Animol(id, content, cuteness)

data class AnimolGif(
  override val id: Int,
  override val content: File,
  override val cuteness: Int,
  val frames: Int
) : Animol(id, content, cuteness)
