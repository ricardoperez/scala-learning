package recfun
import common._

object Main {
  def main() {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int ={
    def pascaltailrec(acc:Int, c: Int, r: Int): Int = {
      if (c == 0 || c == r) acc + 1 
      else pascaltailrec(pascaltailrec(acc , c - 1, r - 1), c, r - 1)
    }  
    pascaltailrec(0, c, r)
  }

  /**
   * Exercise 2
      For example, the function should return true for the following strings:

      (if (zero? x) max (/ 1 x))
      I told him (that it’s not (yet) done). (But he wasn’t listening)

    The function should return false for the following strings:

      :-)
      ())(
   */
  def balance(chars: List[Char]):Boolean = {
    def balancetailrec(chs: List[Char], acc: Int, eq: Boolean): Boolean = {
      if (chs.isEmpty){ 
        if(acc == 0) eq else false
      }else{
        val ch = chs.head
        if (ch == '(') balancetailrec(chs.tail, acc + 1, false) 
        else{ 
          if (ch == ')') balancetailrec(chs.tail, acc - 1,  true) else balancetailrec(chs.tail, acc, eq)
        }
      }
    }
    balancetailrec(chars, 0, true)
  }
}
