package io.scalajs.nodejs

import io.scalajs.util.PromiseHelper._

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.|

/** dns package object
  */
package object dns {
  // ///////////////////////////////////////////////////////////////////////////////
  //      Type Definitions
  // ///////////////////////////////////////////////////////////////////////////////

  type DnsError = SystemError

  type DnsCallback1[A] = js.Function2[DnsError, A, Any]

  type DnsCallback2[A, B] = js.Function3[DnsError, A, B, Any]

  type RRType = String

  type ResolveResult = js.Array[String | ResolveObject] | SOA

  // ///////////////////////////////////////////////////////////////////////////////
  //      Constants
  // ///////////////////////////////////////////////////////////////////////////////

  // IPV4 addresses, default
  final val RRTYPE_A: RRType = "A"

  // IPV6 addresses
  final val RRTYPE_AAAA: RRType = "AAAA"

  // mail exchange records
  final val RRTYPE_MX: RRType = "MX"

  // text records
  final val RRTYPE_TXT: RRType = "TXT"

  // SRV records
  final val RRTYPE_SRV: RRType = "SRV"

  // PTR records
  final val RRTYPE_PTR: RRType = "PTR"

  // name server records
  final val RRTYPE_NS: RRType = "NS"

  // canonical name records
  final val RRTYPE_CNAME: RRType = "CNAME"

  // start of authority record
  final val RRTYPE_SOA: RRType = "SOA"

  // name authority pointer record
  final val RRTYPE_NAPTR: RRType = "NAPTR"

  /** DNS Extensions
    * @param dns
    *   the DNS instance
    */
  implicit final class DNSExtensions(private val dns: DNS) extends AnyVal {

    /** Resolves a hostname (e.g. 'nodejs.org') into the first found A (IPv4) or AAAA (IPv6) record. options can be an
      * object or integer. If options is not provided, then IPv4 and IPv6 addresses are both valid. If options is an
      * integer, then it must be 4 or 6.
      */
    @inline
    def lookupFuture(hostname: String, family: Int): Future[(String, Int)] = {
      promiseWithError2[DnsError, String, Int](dns.lookup(hostname, family, _))
    }
    @inline
    def lookupFuture(hostname: String, options: DnsOptions): Future[(String, Int)] = {
      promiseWithError2[DnsError, String, Int](dns.lookup(hostname, options, _))
    }
    @inline
    def lookupFuture(hostname: String): Future[(String, Int)] = {
      promiseWithError2[DnsError, String, Int](dns.lookup(hostname, _))
    }

    /** Resolves the given address and port into a hostname and service using the operating system's underlying
      * getnameinfo implementation.
      *
      * If address is not a valid IP address, a TypeError will be thrown. The port will be coerced to a number. If it is
      * not a legal port, a TypeError will be thrown.
      *
      * The callback has arguments (err, hostname, service). The hostname and service arguments are strings (e.g.
      * 'localhost' and 'http' respectively).
      *
      * On error, err is an Error object, where err.code is the error code.
      */
    @inline
    def lookupServiceFuture(address: String, port: Int): Future[(String, String)] = {
      promiseWithError2[DnsError, String, String](dns.lookupService(address, port, _))
    }

    /** Uses the DNS protocol to resolve a hostname (e.g. 'nodejs.org') into an array of the record types specified by
      * rrtype. On error, err is an Error object, where err.code is one of the error codes listed here.
      * @param hostname
      *   the hostname
      */
    @inline
    def resolveFuture(hostname: String, rrtype: RRType): Future[ResolveResult] = {
      promiseWithError1[DnsError, ResolveResult](dns.resolve(hostname, rrtype, _))
    }

    @inline
    def resolveFuture(hostname: String): Future[js.Array[String]] = {
      promiseWithError1[DnsError, js.Array[String]](dns.resolve(hostname, _))
    }

    /** Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an array of hostnames. The callback
      * function has arguments (err, hostnames), where hostnames is an array of resolved hostnames for the given ip. On
      * error, err is an Error object, where err.code is one of the DNS error codes.
      * @param ipAddress
      *   the IP Address
      */
    @inline
    def reverseFuture(ipAddress: String): Future[js.Array[String]] = {
      promiseWithError1[DnsError, js.Array[String]](dns.reverse(ipAddress, _))
    }
  }
}
