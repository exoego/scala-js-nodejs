package io.scalajs.nodejs.http2

import scala.scalajs.js

@js.native
trait Http2Constants extends js.Object {
  val DEFAULT_SETTINGS_ENABLE_PUSH: Int         = js.native
  val DEFAULT_SETTINGS_HEADER_TABLE_SIZE: Int   = js.native
  val DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE: Int = js.native
  val DEFAULT_SETTINGS_MAX_FRAME_SIZE: Int      = js.native

  val HTTP2_HEADER_ACCEPT: String                           = js.native
  val HTTP2_HEADER_ACCEPT_CHARSET: String                   = js.native
  val HTTP2_HEADER_ACCEPT_ENCODING: String                  = js.native
  val HTTP2_HEADER_ACCEPT_LANGUAGE: String                  = js.native
  val HTTP2_HEADER_ACCEPT_RANGES: String                    = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_CREDENTIALS: String = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_HEADERS: String     = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_METHODS: String     = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN: String      = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_EXPOSE_HEADERS: String    = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_MAX_AGE: String           = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_REQUEST_HEADERS: String   = js.native
  val HTTP2_HEADER_ACCESS_CONTROL_REQUEST_METHOD: String    = js.native
  val HTTP2_HEADER_AGE: String                              = js.native
  val HTTP2_HEADER_ALLOW: String                            = js.native
  val HTTP2_HEADER_AUTHORITY: String                        = js.native
  val HTTP2_HEADER_AUTHORIZATION: String                    = js.native
  val HTTP2_HEADER_CACHE_CONTROL: String                    = js.native
  val HTTP2_HEADER_CONNECTION: String                       = js.native
  val HTTP2_HEADER_CONTENT_DISPOSITION: String              = js.native
  val HTTP2_HEADER_CONTENT_ENCODING: String                 = js.native
  val HTTP2_HEADER_CONTENT_LANGUAGE: String                 = js.native
  val HTTP2_HEADER_CONTENT_LENGTH: String                   = js.native
  val HTTP2_HEADER_CONTENT_LOCATION: String                 = js.native
  val HTTP2_HEADER_CONTENT_MD5: String                      = js.native
  val HTTP2_HEADER_CONTENT_RANGE: String                    = js.native
  val HTTP2_HEADER_CONTENT_TYPE: String                     = js.native
  val HTTP2_HEADER_COOKIE: String                           = js.native
  val HTTP2_HEADER_DATE: String                             = js.native
  val HTTP2_HEADER_DNT: String                              = js.native
  val HTTP2_HEADER_ETAG: String                             = js.native
  val HTTP2_HEADER_EXPECT: String                           = js.native
  val HTTP2_HEADER_EXPIRES: String                          = js.native
  val HTTP2_HEADER_FORWARDED: String                        = js.native
  val HTTP2_HEADER_FROM: String                             = js.native
  val HTTP2_HEADER_HOST: String                             = js.native
  val HTTP2_HEADER_HTTP2_SETTINGS: String                   = js.native
  val HTTP2_HEADER_IF_MATCH: String                         = js.native
  val HTTP2_HEADER_IF_MODIFIED_SINCE: String                = js.native
  val HTTP2_HEADER_IF_NONE_MATCH: String                    = js.native
  val HTTP2_HEADER_IF_RANGE: String                         = js.native
  val HTTP2_HEADER_IF_UNMODIFIED_SINCE: String              = js.native
  val HTTP2_HEADER_KEEP_ALIVE: String                       = js.native
  val HTTP2_HEADER_LAST_MODIFIED: String                    = js.native
  val HTTP2_HEADER_LINK: String                             = js.native
  val HTTP2_HEADER_LOCATION: String                         = js.native
  val HTTP2_HEADER_MAX_FORWARDS: String                     = js.native
  val HTTP2_HEADER_METHOD: String                           = js.native
  val HTTP2_HEADER_PATH: String                             = js.native
  val HTTP2_HEADER_PREFER: String                           = js.native
  val HTTP2_HEADER_PROXY_AUTHENTICATE: String               = js.native
  val HTTP2_HEADER_PROXY_AUTHORIZATION: String              = js.native
  val HTTP2_HEADER_PROXY_CONNECTION: String                 = js.native
  val HTTP2_HEADER_RANGE: String                            = js.native
  val HTTP2_HEADER_REFERER: String                          = js.native
  val HTTP2_HEADER_REFRESH: String                          = js.native
  val HTTP2_HEADER_RETRY_AFTER: String                      = js.native
  val HTTP2_HEADER_SCHEME: String                           = js.native
  val HTTP2_HEADER_SERVER: String                           = js.native
  val HTTP2_HEADER_SET_COOKIE: String                       = js.native
  val HTTP2_HEADER_STATUS: String                           = js.native
  val HTTP2_HEADER_STRICT_TRANSPORT_SECURITY: String        = js.native
  val HTTP2_HEADER_TE: String                               = js.native
  val HTTP2_HEADER_TK: String                               = js.native
  val HTTP2_HEADER_TRAILER: String                          = js.native
  val HTTP2_HEADER_TRANSFER_ENCODING: String                = js.native
  val HTTP2_HEADER_UPGRADE: String                          = js.native
  val HTTP2_HEADER_UPGRADE_INSECURE_REQUESTS: String        = js.native
  val HTTP2_HEADER_USER_AGENT: String                       = js.native
  val HTTP2_HEADER_VARY: String                             = js.native
  val HTTP2_HEADER_VIA: String                              = js.native
  val HTTP2_HEADER_WARNING: String                          = js.native
  val HTTP2_HEADER_WWW_AUTHENTICATE: String                 = js.native
  val HTTP2_HEADER_X_CONTENT_TYPE_OPTIONS: String           = js.native
  val HTTP2_HEADER_X_FRAME_OPTIONS: String                  = js.native
  val HTTP2_HEADER_PROTOCOL: String                         = js.native

  val HTTP2_METHOD_ACL: String               = js.native
  val HTTP2_METHOD_BASELINE_CONTROL: String  = js.native
  val HTTP2_METHOD_BIND: String              = js.native
  val HTTP2_METHOD_CHECKIN: String           = js.native
  val HTTP2_METHOD_CHECKOUT: String          = js.native
  val HTTP2_METHOD_CONNECT: String           = js.native
  val HTTP2_METHOD_COPY: String              = js.native
  val HTTP2_METHOD_DELETE: String            = js.native
  val HTTP2_METHOD_GET: String               = js.native
  val HTTP2_METHOD_HEAD: String              = js.native
  val HTTP2_METHOD_LABEL: String             = js.native
  val HTTP2_METHOD_LINK: String              = js.native
  val HTTP2_METHOD_LOCK: String              = js.native
  val HTTP2_METHOD_MERGE: String             = js.native
  val HTTP2_METHOD_MKACTIVITY: String        = js.native
  val HTTP2_METHOD_MKCALENDAR: String        = js.native
  val HTTP2_METHOD_MKCOL: String             = js.native
  val HTTP2_METHOD_MKREDIRECTREF: String     = js.native
  val HTTP2_METHOD_MKWORKSPACE: String       = js.native
  val HTTP2_METHOD_MOVE: String              = js.native
  val HTTP2_METHOD_OPTIONS: String           = js.native
  val HTTP2_METHOD_ORDERPATCH: String        = js.native
  val HTTP2_METHOD_PATCH: String             = js.native
  val HTTP2_METHOD_POST: String              = js.native
  val HTTP2_METHOD_PRI: String               = js.native
  val HTTP2_METHOD_PROPFIND: String          = js.native
  val HTTP2_METHOD_PROPPATCH: String         = js.native
  val HTTP2_METHOD_PUT: String               = js.native
  val HTTP2_METHOD_REBIND: String            = js.native
  val HTTP2_METHOD_REPORT: String            = js.native
  val HTTP2_METHOD_SEARCH: String            = js.native
  val HTTP2_METHOD_TRACE: String             = js.native
  val HTTP2_METHOD_UNBIND: String            = js.native
  val HTTP2_METHOD_UNCHECKOUT: String        = js.native
  val HTTP2_METHOD_UNLINK: String            = js.native
  val HTTP2_METHOD_UNLOCK: String            = js.native
  val HTTP2_METHOD_UPDATE: String            = js.native
  val HTTP2_METHOD_UPDATEREDIRECTREF: String = js.native
  val HTTP2_METHOD_VERSION_CONTROL: String   = js.native

  val HTTP_STATUS_ACCEPTED: Int                        = js.native
  val HTTP_STATUS_ALREADY_REPORTED: Int                = js.native
  val HTTP_STATUS_BAD_GATEWAY: Int                     = js.native
  val HTTP_STATUS_BAD_REQUEST: Int                     = js.native
  val HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED: Int        = js.native
  val HTTP_STATUS_CONFLICT: Int                        = js.native
  val HTTP_STATUS_CONTINUE: Int                        = js.native
  val HTTP_STATUS_CREATED: Int                         = js.native
  val HTTP_STATUS_EARLY_HINTS: Int                     = js.native
  val HTTP_STATUS_EXPECTATION_FAILED: Int              = js.native
  val HTTP_STATUS_FAILED_DEPENDENCY: Int               = js.native
  val HTTP_STATUS_FORBIDDEN: Int                       = js.native
  val HTTP_STATUS_FOUND: Int                           = js.native
  val HTTP_STATUS_GATEWAY_TIMEOUT: Int                 = js.native
  val HTTP_STATUS_GONE: Int                            = js.native
  val HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED: Int      = js.native
  val HTTP_STATUS_IM_USED: Int                         = js.native
  val HTTP_STATUS_INSUFFICIENT_STORAGE: Int            = js.native
  val HTTP_STATUS_INTERNAL_SERVER_ERROR: Int           = js.native
  val HTTP_STATUS_LENGTH_REQUIRED: Int                 = js.native
  val HTTP_STATUS_LOCKED: Int                          = js.native
  val HTTP_STATUS_LOOP_DETECTED: Int                   = js.native
  val HTTP_STATUS_METHOD_NOT_ALLOWED: Int              = js.native
  val HTTP_STATUS_MISDIRECTED_REQUEST: Int             = js.native
  val HTTP_STATUS_MOVED_PERMANENTLY: Int               = js.native
  val HTTP_STATUS_MULTI_STATUS: Int                    = js.native
  val HTTP_STATUS_MULTIPLE_CHOICES: Int                = js.native
  val HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED: Int = js.native
  val HTTP_STATUS_NO_CONTENT: Int                      = js.native
  val HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION: Int   = js.native
  val HTTP_STATUS_NOT_ACCEPTABLE: Int                  = js.native
  val HTTP_STATUS_NOT_EXTENDED: Int                    = js.native
  val HTTP_STATUS_NOT_FOUND: Int                       = js.native
  val HTTP_STATUS_NOT_IMPLEMENTED: Int                 = js.native
  val HTTP_STATUS_NOT_MODIFIED: Int                    = js.native
  val HTTP_STATUS_OK: Int                              = js.native
  val HTTP_STATUS_PARTIAL_CONTENT: Int                 = js.native
  val HTTP_STATUS_PAYLOAD_TOO_LARGE: Int               = js.native
  val HTTP_STATUS_PAYMENT_REQUIRED: Int                = js.native
  val HTTP_STATUS_PERMANENT_REDIRECT: Int              = js.native
  val HTTP_STATUS_PRECONDITION_FAILED: Int             = js.native
  val HTTP_STATUS_PRECONDITION_REQUIRED: Int           = js.native
  val HTTP_STATUS_PROCESSING: Int                      = js.native
  val HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED: Int   = js.native
  val HTTP_STATUS_RANGE_NOT_SATISFIABLE: Int           = js.native
  val HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE: Int = js.native
  val HTTP_STATUS_REQUEST_TIMEOUT: Int                 = js.native
  val HTTP_STATUS_RESET_CONTENT: Int                   = js.native
  val HTTP_STATUS_SEE_OTHER: Int                       = js.native
  val HTTP_STATUS_SERVICE_UNAVAILABLE: Int             = js.native
  val HTTP_STATUS_SWITCHING_PROTOCOLS: Int             = js.native
  val HTTP_STATUS_TEAPOT: Int                          = js.native
  val HTTP_STATUS_TEMPORARY_REDIRECT: Int              = js.native
  val HTTP_STATUS_TOO_MANY_REQUESTS: Int               = js.native
  val HTTP_STATUS_UNAUTHORIZED: Int                    = js.native
  val HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS: Int   = js.native
  val HTTP_STATUS_UNORDERED_COLLECTION: Int            = js.native
  val HTTP_STATUS_UNPROCESSABLE_ENTITY: Int            = js.native
  val HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE: Int          = js.native
  val HTTP_STATUS_UPGRADE_REQUIRED: Int                = js.native
  val HTTP_STATUS_URI_TOO_LONG: Int                    = js.native
  val HTTP_STATUS_USE_PROXY: Int                       = js.native
  val HTTP_STATUS_VARIANT_ALSO_NEGOTIATES: Int         = js.native

  val MAX_INITIAL_WINDOW_SIZE: Int = js.native
  val MAX_MAX_FRAME_SIZE: Int      = js.native
  val MIN_MAX_FRAME_SIZE: Int      = js.native

  val NGHTTP2_CANCEL: Int                           = js.native
  val NGHTTP2_COMPRESSION_ERROR: Int                = js.native
  val NGHTTP2_CONNECT_ERROR: Int                    = js.native
  val NGHTTP2_DEFAULT_WEIGHT: Int                   = js.native
  val NGHTTP2_ENHANCE_YOUR_CALM: Int                = js.native
  val NGHTTP2_ERR_FRAME_SIZE_ERROR: Int             = js.native
  val NGHTTP2_FLAG_ACK: Int                         = js.native
  val NGHTTP2_FLAG_END_HEADERS: Int                 = js.native
  val NGHTTP2_FLAG_END_STREAM: Int                  = js.native
  val NGHTTP2_FLAG_NONE: Int                        = js.native
  val NGHTTP2_FLAG_PADDED: Int                      = js.native
  val NGHTTP2_FLAG_PRIORITY: Int                    = js.native
  val NGHTTP2_FLOW_CONTROL_ERROR: Int               = js.native
  val NGHTTP2_FRAME_SIZE_ERROR: Int                 = js.native
  val NGHTTP2_HTTP_1_1_REQUIRED: Int                = js.native
  val NGHTTP2_INADEQUATE_SECURITY: Int              = js.native
  val NGHTTP2_INTERNAL_ERROR: Int                   = js.native
  val NGHTTP2_NO_ERROR: Int                         = js.native
  val NGHTTP2_PROTOCOL_ERROR: Int                   = js.native
  val NGHTTP2_REFUSED_STREAM: Int                   = js.native
  val NGHTTP2_SESSION_CLIENT: Int                   = js.native
  val NGHTTP2_SESSION_SERVER: Int                   = js.native
  val NGHTTP2_SETTINGS_ENABLE_PUSH: Int             = js.native
  val NGHTTP2_SETTINGS_HEADER_TABLE_SIZE: Int       = js.native
  val NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE: Int     = js.native
  val NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS: Int  = js.native
  val NGHTTP2_SETTINGS_MAX_FRAME_SIZE: Int          = js.native
  val NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE: Int    = js.native
  val NGHTTP2_SETTINGS_TIMEOUT: Int                 = js.native
  val NGHTTP2_STREAM_CLOSED: Int                    = js.native
  val NGHTTP2_STREAM_STATE_CLOSED: Int              = js.native
  val NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL: Int   = js.native
  val NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE: Int  = js.native
  val NGHTTP2_STREAM_STATE_IDLE: Int                = js.native
  val NGHTTP2_STREAM_STATE_OPEN: Int                = js.native
  val NGHTTP2_STREAM_STATE_RESERVED_LOCAL: Int      = js.native
  val NGHTTP2_STREAM_STATE_RESERVED_REMOTE: Int     = js.native
  val NGHTTP2_SETTINGS_ENABLE_CONNECT_PROTOCOL: Int = js.native

  val PADDING_STRATEGY_ALIGNED: Int  = js.native
  val PADDING_STRATEGY_CALLBACK: Int = js.native
  val PADDING_STRATEGY_MAX: Int      = js.native
  val PADDING_STRATEGY_NONE: Int     = js.native
}
