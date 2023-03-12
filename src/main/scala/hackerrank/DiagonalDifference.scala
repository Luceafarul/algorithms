package hackerrank

object DiagonalDifference {
  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    val size = arr.size
    val leftToRightCoords = (0 until size).map(n => (n, n)).toList
    val rightToLeftCoords = (size - 1 to 0 by -1).zip((0 until size)).toList

    val leftToRightDiagonal =
      leftToRightCoords.foldLeft(0) { case (acc, (x, y)) =>
        acc + arr(x)(y)
      }

    val rightToLeftDiagonal =
      rightToLeftCoords.foldLeft(0) { case (acc, (x, y)) =>
        acc + arr(x)(y)
      }

    math.abs(leftToRightDiagonal - rightToLeftDiagonal)
  }
}
