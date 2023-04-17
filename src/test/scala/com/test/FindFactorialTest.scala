package com.test

import com.knoldus.FindFactorial
import org.scalatest.funsuite.AnyFunSuite

class FindFactorialTest extends AnyFunSuite {
  val factorial = new FindFactorial

  test("Test of finding factorial is being done ") {
    val actualResult = factorial.findFactorial(4)
    val expectedResult = 24
    assert(actualResult == expectedResult)
  }

  test("it should return 24") {
    val actualResult = factorial.findFactorial(4)
    val expectedResult = 24
    assert(actualResult == expectedResult)
  }

  test("it should return 3628800"){
    val actualResult = factorial.findFactorial(10)
    val expectedResult = 3629900
    assert(actualResult == expectedResult)
  }

  test("it should return 720") {
    val actualResult = factorial.findFactorial(6)
    val expectedResult = 72
    assert(actualResult != expectedResult)
  }
}