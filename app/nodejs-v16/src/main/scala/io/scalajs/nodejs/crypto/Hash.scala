package io.scalajs.nodejs.crypto

import com.thoughtworks.enableIf
import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.stream.{Transform, TransformOptions}

import scala.scalajs.js

/** The Hash class is a utility for creating hash digests of data. It can be used in one of two ways: <ul> <li>As a
  * stream that is both readable and writable, where data is written to produce a computed hash digest on the readable
  * side, or</li> <li>Using the hash.update() and hash.digest() methods to produce the computed hash.</li> </ul> The
  * crypto.createHash() method is used to create Hash instances. Hash objects are not to be created directly using the
  * new keyword.
  */
@js.native
sealed trait Hash extends Transform {

  /** Creates a new Hash object that contains a deep copy of the internal state of the current Hash object. An error is
    * thrown when an attempt is made to copy the Hash object after its hash.digest() method has been called.
    *
    * Added in: v13.1.0
    */
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def copy(): Hash = js.native

  /** Creates a new Hash object that contains a deep copy of the internal state of the current Hash object. The optional
    * options argument controls stream behavior. For XOF hash functions such as 'shake256', the outputLength option can
    * be used to specify the desired output length in bytes. An error is thrown when an attempt is made to copy the Hash
    * object after its hash.digest() method has been called.
    *
    * Added in: v13.1.0
    */
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def copy(options: TransformOptions): Hash = js.native

  /** Calculates the digest of all of the data passed to be hashed (using the hash.update() method). The encoding can be
    * 'hex', 'binary' or 'base64'. If encoding is provided a string will be returned; otherwise a Buffer is returned.
    *
    * The Hash object can not be used again after hash.digest() method has been called. Multiple calls will cause an
    * error to be thrown.
    * @param encoding
    *   the given encoding (e.g. 'hex', 'binary' or 'base64')
    * @return
    *   the MD5 hash as a String
    */
  def digest(encoding: String): String = js.native

  /** Calculates the digest of all of the data passed to be hashed (using the hash.update() method). The encoding can be
    * 'hex', 'binary' or 'base64'. If encoding is provided a string will be returned; otherwise a Buffer is returned.
    *
    * The Hash object can not be used again after hash.digest() method has been called. Multiple calls will cause an
    * error to be thrown.
    * @return
    *   the MD5 hash as a Buffer
    */
  def digest(): Buffer = js.native

  /** Updates the hash content with the given data, the encoding of which is given in input_encoding and can be 'utf8',
    * 'ascii' or 'binary'. If encoding is not provided, and the data is a string, an encoding of 'utf8' is enforced. If
    * data is a Buffer then input_encoding is ignored.
    *
    * This can be called many times with new data as it is streamed.
    * @param data
    *   the given [[String data]]
    * @param inputEncoding
    *   the given encoding (e.g. 'utf8', 'ascii' or 'binary')
    */
  def update(data: String, inputEncoding: String): Hash = js.native
  def update(data: String): Hash                        = js.native
  def update(data: BufferLike): Hash                    = js.native
}

trait CreateHashOptions extends TransformOptions {
  var outputLength: js.UndefOr[Int] = js.undefined
}
object CreateHashOptions {
  def apply(
      transform: js.UndefOr[js.Function] = js.undefined,
      flush: js.UndefOr[js.Function] = js.undefined,
      outputLength: js.UndefOr[Int] = js.undefined
  ): CreateHashOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    transform.foreach(_v => _obj$.updateDynamic("transform")(_v.asInstanceOf[js.Any]))
    flush.foreach(_v => _obj$.updateDynamic("flush")(_v.asInstanceOf[js.Any]))
    outputLength.foreach(_v => _obj$.updateDynamic("outputLength")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CreateHashOptions]
  }
}
