package hackerrank

object PlusMinus {
  /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    def plusMinus(arr: Array[Int]): Unit = {
      val counters = List(arr.count(_ > 0), arr.count(_ < 0), arr.count(_ == 0))
      val ratios = counters.map(_ / arr.size.toDouble)
      ratios.foreach(r => println(f"$r%1.6f"))
    }
}
