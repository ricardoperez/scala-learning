package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); val res$0 = 
  3 + 3;System.out.println("""res0: Int(6) = """ + $show(res$0));$skip(44); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(335); 
  
  def sqrt(x: Double) = {
	  def sqrtIter(guess: Double): Double =
	   if(isGoodeEnough(guess)) guess
	   else sqrtIter(improve(guess))
	   
	   def isGoodeEnough(guess: Double): Boolean =
	   	abs( guess * guess - x ) / x < 0.0000001
	   	
	   def improve(guess: Double) =
	   	(guess + x / guess) / 2
	   	
	   sqrtIter(1.0)
   };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$1 = 
   sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
	 sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
	 sqrt(1e60);System.out.println("""res3: Double = """ + $show(res$3));$skip(127); 
	 
 def fac(n: Int): Int = {
   def loop(acc: Int, n: Int): Int = if (n == 0) acc else loop( acc * n,  n - 1)
   loop(1, n)
 };System.out.println("""fac: (n: Int)Int""");$skip(8); val res$4 = 
 fac(4);System.out.println("""res4: Int = """ + $show(res$4))}
	 
}
 