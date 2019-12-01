package com.wixpress.dst.greyhound.core.testkit

import com.wixpress.dst.greyhound.core.Record
import org.specs2.matcher.Matcher
import org.specs2.matcher.Matchers._

object RecordMatchers {
  def beRecordWithKey[K](key: K): Matcher[Record[K, _]] =
    beSome(key) ^^ ((_: Record[K, _]).key)

  def beRecordWithValue[V](value: V): Matcher[Record[_, V]] =
    equalTo(value) ^^ ((_: Record[_, V]).value)
}
