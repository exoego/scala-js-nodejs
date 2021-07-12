package io.scalajs.nodejs.crypto

import com.thoughtworks.enableMembersIf
import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.tls.TLSCertificate
import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{DataView, TypedArray}
import scala.scalajs.js.|

@JSImport("crypto", "X509Certificate")
@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
@js.native
class X509Certificate private[this] () extends js.Object {
  def this(buffer: String | TypedArray[_, _] | Buffer | DataView) = this()

  def ca: Boolean = js.native

  def checkEmail(email: String, options: CheckOptions): js.UndefOr[String] = js.native
  def checkHost(host: String, options: CheckOptions): js.UndefOr[String]   = js.native
  def checkIP(ip: String, options: CheckOptions): js.UndefOr[String]       = js.native

  def checkIssued(otherCert: X509Certificate): Boolean = js.native
  def checkPrivateKey(privateKey: KeyObject): Boolean  = js.native

  def fingerprint: String    = js.native
  def fingerprint256: String = js.native

  def infoAccess: String = js.native

  def issuer: String                                 = js.native
  def issuerCertificate: js.UndefOr[X509Certificate] = js.native

  def keyUsage: js.Array[String] = js.native

  def publicKey: KeyObject = js.native

  def raw: Buffer = js.native

  def serialNumber: String = js.native

  def subject: String        = js.native
  def subjectAltName: String = js.native

  def toJSON(): String = js.native

  def toLegacyObject(): TLSCertificate = js.native

  def validFrom: String = js.native
  def validTo: String   = js.native

  def verify(publicKey: KeyObject): Boolean = js.native
}

@Factory
trait CheckOptions extends js.Object {
  var subject: js.UndefOr[String]                = js.undefined
  var wildcards: js.UndefOr[Boolean]             = js.undefined
  var partialWildcards: js.UndefOr[Boolean]      = js.undefined
  var multiLabelWildcards: js.UndefOr[Boolean]   = js.undefined
  var singleLabelSubdomains: js.UndefOr[Boolean] = js.undefined
}
