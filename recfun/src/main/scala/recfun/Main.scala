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
   */
  def balance(chars: List[Char]): Boolean = {
    if(chars.isEmpty){
      return false
    }else{
      
      def balancerec(count:Int, char:Char, first:Int): Boolean = {
        if(char == '('){
          balancerec(count + 1, chars(count), 1)
        }
        
        if(char == ')'){
          return false
        }
      }
      return true
    }
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 3
}
