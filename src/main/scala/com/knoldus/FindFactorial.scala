package com.knoldus

import scala.annotation.tailrec

class FindFactorial {

  @tailrec
  final def findFactorial(number: BigInt, accumulator: BigInt = 1): BigInt = {
    require(number >= 0)
    if (number <= 1) accumulator else findFactorial(number - 1, number * accumulator)

  }
}

