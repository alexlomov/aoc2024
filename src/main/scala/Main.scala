@main def main(): Unit =
  val t1Input = day1.loadDay1("src/main/resources/d1t1.txt")
  val t1 = day1.task1.tupled(t1Input)
  println(t1)

object day1:
  def task1(lh: List[Int], rh: List[Int]): Int =
    lh.sorted.zip(rh.sorted).map:
      (l, r) => l - r
    .map:
      (v) => if v < 0 then v * -1 else v
    .fold(0):
      _ + _

  def loadDay1(fileName: String): (List[Int], List[Int]) =
    scala.io.Source.fromFile(fileName).getLines
      .map:
        (l) => l.split("   ") match
          case Array(a, b) => (a.toInt, b.toInt)
      .toList.unzip






