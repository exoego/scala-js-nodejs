package io.scalajs.nodejs.buffer

import com.thoughtworks.enableMembersIf
import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.typedarray.ArrayBuffer

@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
@JSImport("buffer", "Blob")
class Blob() extends js.Object {

  def this(source: BlobSources, options: BlobOptions) = this()
  def this(source: BlobSources) = this()

  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native

  def size: Double = js.native

  def slice(start: Double, end: Double, `type`: String): Blob = js.native
  def slice(start: Double, end: Double): Blob                 = js.native
  def slice(start: Double): Blob                              = js.native

  def text(): js.Promise[String] = js.native

  def `type`: String = js.native

  /** Alias for [[`type`]]
    */
  @JSName("type")
  def contentType: String = js.native
}

@Factory
trait BlobOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String]   = js.undefined
}
