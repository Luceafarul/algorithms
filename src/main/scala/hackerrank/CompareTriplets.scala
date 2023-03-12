package hackerrank

object CompareTriplets {

  /*
   * Complete the 'compareTriplets' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    var alice = 0
    var bob = 0

    for (i <- 0 until a.length) {
      if a(i) > b(i) then alice = alice + 1
      else if a(i) < b(i) then bob = bob + 1
      else ()
    }

    Array(alice, bob)
    // [1, 2, 3]
    // zip
    // [6, 5, 4]
    // [(1, 6), (2, 5), (3, 4)]
    // fold
    // (aliceScore, bobScore)

    val (aliceScore, bobScore) =
      a.zip(b).foldLeft((0, 0)) { case (acc, (e1, e2)) =>
        val (alice, bob) = acc
        if (e1 > e2) (alice + 1, bob)
        else if (e1 < e2) (alice, bob + 1)
        else (alice, bob)
      }
    Array(aliceScore, bobScore)
  }

}
