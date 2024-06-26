package io.scalajs.nodejs.url

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** The URLSearchParams API provides read and write access to the query of a URL. The URLSearchParams class can also be
  * used standalone with one of the four following constructors.
  *
  * The WHATWG URLSearchParams interface and the querystring module have similar purpose, but the purpose of the
  * querystring module is more general, as it allows the customization of delimiter characters (& and =). On the other
  * hand, this API is designed purely for URL query strings.
  */
@js.native
@JSImport("url", "URLSearchParams")
class URLSearchParams() extends js.Object {

  /** Parse the string as a query string, and use it to instantiate a new URLSearchParams object. A leading '?', if
    * present, is ignored.
    * @param queryString
    *   A query string
    */
  def this(queryString: String) = this()

  /** Instantiate a new URLSearchParams object with a query hash map. The key and value of each property of obj are
    * always coerced to strings.
    * @param obj
    *   An object representing a collection of key-value pairs
    */
  def this(obj: js.Dictionary[_]) = this()

  /** Instantiate a new URLSearchParams object with a query hash map. The key and value of each property of obj are
    * always coerced to strings.
    * @param obj
    *   An object representing a collection of key-value pairs
    */
  def this(obj: js.Object) = this()

  /** Instantiate a new URLSearchParams object with an iterable map in a way that is similar to Map's constructor.
    * iterable can be an Array or any iterable object. That means iterable can be another URLSearchParams, in which case
    * the constructor will simply create a clone of the provided URLSearchParams. Elements of iterable are key-value
    * pairs, and can themselves be any iterable object.
    * @param it
    *   An iterable object whose elements are key-value pairs
    */
  def this(it: js.Iterable[js.Tuple2[String, String]]) = this()

  // ///////////////////////////////////////////////////////////////////////////////
  //      Methods
  // ///////////////////////////////////////////////////////////////////////////////

  /** Append a new name-value pair to the query string.
    * @param name
    *   the name of the property
    * @param value
    *   the value of the property
    */
  def append(name: String, value: String): Unit = js.native

  /** Remove all name-value pairs whose name is name.
    * @param name
    *   the name of the property
    */
  def delete(name: String): Unit = js.native

  /** Returns an ES6 Iterator over each of the name-value pairs in the query. Each item of the iterator is a JavaScript
    * Array. The first item of the Array is the name, the second item of the Array is the value.
    * @return
    *   an iterable of an array of results
    */
  def entries(): js.Iterator[js.Tuple2[String, String]] = js.native

  /** Iterates over each name-value pair in the query and invokes the given function.
    * @param fn
    *   the function invoked for each name-value pair in the query.
    */
  def forEach(fn: js.Function3[String, String, URLSearchParams, Any]): Unit = js.native

  /** Returns the value of the first name-value pair whose name is name. If there are no such pairs, null is returned.
    * @param name
    *   the name of the property
    * @return
    *   the value or null if there is no name-value pair with the given name.
    */
  def get(name: String): String = js.native

  /** Returns the values of all name-value pairs whose name is name. If there are no such pairs, an empty array is
    * returned.
    * @param name
    *   the name of the property
    * @return
    *   the array of values or null if there is no name-value pair with the given name.
    */
  def getAll(name: String): js.Array[String] = js.native

  /** Returns true if there is at least one name-value pair whose name is name.
    * @param name
    *   the name of the property
    * @return
    *   true if there is at least one name-value pair whose name is name.
    */
  def has(name: String): Boolean = js.native

  def keys(): js.Iterator[String] = js.native

  /** Sets the value in the URLSearchParams object associated with name to value. If there are any pre-existing
    * name-value pairs whose names are name, set the first such pair's value to value and remove all others. If not,
    * append the name-value pair to the query string.
    * @param name
    *   the name of the property
    * @param value
    *   the value of the property
    */
  def set(name: String, value: String): Unit = js.native

  /** Sort all existing name-value pairs in-place by their names. Sorting is done with a stable sorting algorithm, so
    * relative order between name-value pairs with the same name is preserved.
    */
  def sort(): Unit = js.native

  /** Returns an ES6 Iterator over the values of each name-value pair.
    */
  def values(): js.Iterator[String] = js.native
}
