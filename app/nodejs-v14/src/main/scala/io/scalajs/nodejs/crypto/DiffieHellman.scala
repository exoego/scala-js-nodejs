package io.scalajs.nodejs.crypto

import io.scalajs.nodejs.buffer.Buffer

import scala.scalajs.js

@js.native
trait DiffieHellman extends js.Object {
  def computeSecret(otherPublicKey: String, inputEncoding: String, outputEncoding: String): String   = js.native
  def computeSecret(otherPublicKey: String, inputEncoding: String): Buffer                           = js.native
  def computeSecret(otherPublicKey: BufferLike, inputEncoding: Null, outputEncoding: String): String = js.native
  def computeSecret(otherPublicKey: BufferLike): Buffer                                              = js.native

  def generateKeys(): Buffer                 = js.native
  def generateKeys(encoding: String): String = js.native

  def getGenerator(): Buffer                 = js.native
  def getGenerator(encoding: String): String = js.native

  def getPrime(): Buffer                 = js.native
  def getPrime(encoding: String): String = js.native

  def getPrivateKey(): Buffer                 = js.native
  def getPrivateKey(encoding: String): String = js.native

  def getPublicKey(): Buffer                 = js.native
  def getPublicKey(encoding: String): String = js.native

  def setPrivateKey(privateKey: String, encoding: String): DiffieHellman = js.native
  def setPrivateKey(privateKey: BufferLike): DiffieHellman               = js.native

  def setPublicKey(privateKey: String, encoding: String): DiffieHellman = js.native
  def setPublicKey(privateKey: BufferLike): DiffieHellman               = js.native

  val verifyError: Int = js.native
}
