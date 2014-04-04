package dojo;

object EulerProblem {

  def sumOfMultiplesBelow(limit: Int): Int = {
    (1 until limit).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }

  def sumOfEvenFibonacciBelow(limit: Int): Int = {
    var current = (1, 1)
    var sum = 0

    while (current._1 < limit) {
      if (current._1 % 2 == 0) sum += current._1

      current = (current._2, current._1 + current._2)
    }
    sum
  }

  def largestPrimeFactorOf(number: Int): Int = {
	val upper:Int = Math.sqrt(number).toInt
    var n = number
	(2 to upper).filter( p => {
	  
	  val isDivisor = n % p == 0
	  while (n % p == 0) {
	    n = n / p
	  }
	  
	  isDivisor
	} ).lastOption.getOrElse(number) 
  }
  
}
