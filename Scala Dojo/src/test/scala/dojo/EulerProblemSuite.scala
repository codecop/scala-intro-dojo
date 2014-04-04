package dojo

import org.scalatest.FunSuite

class EulerProblemSuite extends FunSuite{

  test("1) The sum of all the multiples of 3 or 5 below 10 should be 23") {
    assert(EulerProblem.sumOfMultiplesBelow(10) === 3 + 5 + 6 + 9)
  }

  test("2) The sum of all the even Fibonacci below 10 should be 23") {
	  assert(EulerProblem.sumOfEvenFibonacciBelow(35) === 2 + 8 + 34)
  }

  test("3) The largest prime factor of 13195 should be 29") {
	  assert(EulerProblem.largestPrimeFactorOf(13195) === 29)
  }

  test("3) The largest prime factor of MaxInt should be MaxInt") {
	  assert(EulerProblem.largestPrimeFactorOf(Int.MaxValue) === Int.MaxValue)
  }
  
}