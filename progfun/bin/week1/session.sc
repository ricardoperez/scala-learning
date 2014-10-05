package week1

object session {
  3 + 3                                           //> res0: Int(6) = 6
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  def sqrt(x: Double) = {
	  def sqrtIter(guess: Double): Double =
	   if(isGoodeEnough(guess)) guess
	   else sqrtIter(improve(guess))
	   
	   def isGoodeEnough(guess: Double): Boolean =
	   	abs( guess * guess - x ) / x < 0.0000001
	   	
	   def improve(guess: Double) =
	   	(guess + x / guess) / 2
	   	
	   sqrtIter(1.0)
   }                                              //> sqrt: (x: Double)Double
   sqrt(4)                                        //> res1: Double = 2.0000000929222947
	 sqrt(1e-6)                               //> res2: Double = 0.0010000000000000117
	 sqrt(1e60)                               //> res3: Double = 1.0000000031080746E30
	 
 def fac(n: Int): Int = {
   def loop(acc: Int, n: Int): Int = if (n == 0) acc else loop( acc * n,  n - 1)
   loop(1, n)
 }                                                //> fac: (n: Int)Int
 fac(4)                                           //> res4: Int = 24
	 
}
 