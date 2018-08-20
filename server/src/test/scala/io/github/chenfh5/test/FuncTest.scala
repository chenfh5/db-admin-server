package io.github.chenfh5.test

import io.github.chenfh5.common.OwnUtils
import org.slf4j.LoggerFactory
import org.testng.annotations.{AfterClass, BeforeClass, Test}

class FuncTest {
  private val LOG = LoggerFactory.getLogger(getClass)

  @BeforeClass
  def setUp(): Unit = {
    val now = OwnUtils.getSdfHiveFull.format(System.currentTimeMillis())
    LOG.info("this is the test begin={}", now)
  }

  @AfterClass
  def shut(): Unit = {
    val now = OwnUtils.getSdfHiveFull.format(System.currentTimeMillis())
    LOG.info("this is the test   end={}", now)
  }

  @Test(enabled = true)
  def test(): Unit = {
    println("this is test running")
  }

}
