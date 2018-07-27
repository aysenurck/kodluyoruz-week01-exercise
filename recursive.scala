object MinMax {
  def main(args: Array[String]) {
  val list = List(2,1,4,5,7,6)
  println(min(list))
  println(max(list))
  println(max(list)-min(list))


  def min(ints: List[Int]): Int = { 
    def minAccum(ints: List[Int], theMin: Int): Int = {
      if(ints.isEmpty)
      {
        return theMin
      }
      else 
      {
        val newMin = if(ints.head < theMin) ints.head else theMin
          minAccum(ints.tail, newMin)
      }
    }
    minAccum(ints, List(2,1,4,5,6).last)
    }

  def max(ints: List[Int]): Int = { 
    def maxAccum(ints: List[Int], theMax: Int): Int = {
      if(ints.isEmpty)
      {
        return theMax
      }
      else 
      {
        val newMax = if(ints.head > theMax) ints.head else theMax
          maxAccum(ints.tail, newMax)
      }
    }
    maxAccum(ints, List(2,1,4,5,6).last)
    }

  }
}

