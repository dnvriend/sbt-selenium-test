package com.github.dnvriend.selenium

import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.HtmlUnit
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}

trait TestSpec extends FlatSpec with Matchers with HtmlUnit with Eventually with BeforeAndAfterAll {
  override protected def afterAll(): Unit = {
    close()
    quit()
  }
}
