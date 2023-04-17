package com.knoldus

object Driver extends App {
  val findFactorial = new FindFactorial

  private val result = findFactorial.findFactorial(10)
  println(result)

}
