package io.scalajs.nodejs
package url

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("url", "URL")
class URL protected () extends js.Object {
  def this(input: String, base: String) = this()
  def this(input: String, base: URL) = this()
  def this(input: String) = this()

  /** The auth property is the username and password portion of the URL, also referred to as "userinfo". This string
    * subset follows the protocol and double slashes (if present) and precedes the host component, delimited by an ASCII
    * "at sign" (@). The format of the string is {username}[:{password}], with the [:{password}] portion being optional.
    */
  var auth: String = js.native

  /** Gets and sets the fragment portion of the URL.
    */
  var hash: String = js.native

  /** Gets and sets the host portion of the URL.
    */
  var host: String = js.native

  /** Gets and sets the hostname portion of the URL. The key difference between url.host and url.hostname is that
    * url.hostname does not include the port.
    */
  var hostname: String = js.native

  /** Gets and sets the serialized URL.
    */
  var href: String = js.native

  /** Gets the read-only serialization of the URL's origin.
    */
  var origin: String = js.native

  /** Gets and sets the password portion of the URL.
    */
  var password: String = js.native

  /** Gets and sets the path portion of the URL.
    */
  var pathname: String = js.native

  /** Gets and sets the port portion of the URL.
    */
  var port: String = js.native

  /** Gets and sets the protocol portion of the URL.
    */
  var protocol: String = js.native

  /** Gets and sets the serialized query portion of the URL.
    */
  var search: String = js.native

  /** Gets the URLSearchParams object representing the query parameters of the URL. This property is read-only; to
    * replace the entirety of query parameters of the URL, use the url.search setter. See URLSearchParams documentation
    * for details.
    */
  var searchParams: URLSearchParams = js.native

  /** Gets and sets the username portion of the URL.
    */
  var username: String = js.native

  // ///////////////////////////////////////////////////////////////////////////////
  //      Methods
  // ///////////////////////////////////////////////////////////////////////////////

  /** The toJSON() method on the URL object returns the serialized URL. The value returned is equivalent to that of
    * url.href and url.toString().
    *
    * This method is automatically called when an URL object is serialized with JSON.stringify().
    * @return
    *   a JSON representation of the URL
    */
  def toJSON(): String = js.native
}

/** This module has utilities for URL resolution and parsing. Call require('url') to use it.
  */
@js.native
@JSImport("url", JSImport.Namespace)
object URL extends js.Object {

  /** Take a parsed URL object, and return a formatted URL string.
    * @example
    *   url.format(urlObj)
    */
  @deprecated("Use URL instead", "Node.js v11.0.0")
  def format(urlObj: URLObject): String = js.native

  /** Returns a customizable serialization of a URL String representation of a WHATWG URL object.
    * @param url
    *   the given [[URL]]
    * @param options
    *   the given [[UrlFormatOptions options]]
    * @return
    *   a customizable serialization of a URL String representation of a WHATWG URL object.
    */
  def format(url: URL, options: UrlFormatOptions): String = js.native
  def format(url: URL): String                            = js.native

  /** Take a URL string, and return an object.
    *
    * Pass true as the second argument to also parse the query string using the querystring module. If true then the
    * query property will always be assigned an object, and the search property will always be a (possibly empty)
    * string. If false then the query property will not be parsed or decoded. Defaults to false.
    *
    * Pass true as the third argument to treat //foo/bar as { host: 'foo', pathname: '/bar' } rather than { pathname:
    * '//foo/bar' }. Defaults to false.
    * @example
    *   url.parse(urlStr[, parseQueryString][, slashesDenoteHost])
    */
  @deprecated("Use URL instead", "Node.js v11.0.0")
  def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): URLObject = js.native

  @deprecated("Use URL instead", "Node.js v11.0.0")
  def parse(urlStr: String, parseQueryString: Boolean): URLObject = js.native

  @deprecated("Use URL instead", "Node.js v11.0.0")
  def parse(urlStr: String): URLObject = js.native

  /** Take a base URL, and a href URL, and resolve them as a browser would for an anchor tag. Examples:
    * url.resolve('/one/two/three', 'four') // '/one/two/four' url.resolve('http://example.com/', '/one') //
    * 'http://example.com/one' url.resolve('http://example.com/one', '/two') // 'http://example.com/two'
    * @example
    *   url.resolve(from, to)
    */
  @deprecated("Use URL instead", "Node.js v11.0.0")
  def resolve(from: String, to: String): String = js.native

  /** Returns the Punycode ASCII serialization of the domain. If domain is an invalid domain, the empty string is
    * returned.
    * @param domain
    *   the domain
    * @return
    *   the Punycode ASCII serialization of the domain
    */
  def domainToASCII(domain: String): String = js.native

  /** Returns the Unicode serialization of the domain. If domain is an invalid domain, the empty string is returned.
    * @param domain
    *   the domain
    * @return
    *   the Unicode serialization of the domain
    */
  def domainToUnicode(domain: String): String = js.native

  def fileURLToPath(url: URL): String    = js.native
  def fileURLToPath(url: String): String = js.native

  def pathToFileURL(url: String): URL = js.native

  def urlToHttpOptions(url: URL): URLOptionsObject = js.native
}

/** An ordinary options object as expected by the http.request() and https.request() APIs.
  */
@js.native
trait URLOptionsObject extends js.Object {
  var protocol: String         = js.native
  var hostname: String         = js.native
  var hash: String             = js.native
  var search: String           = js.native
  var pathname: String         = js.native
  var path: String             = js.native
  var href: String             = js.native
  var auth: js.UndefOr[String] = js.native
}
