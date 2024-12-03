object day1:
  def task1Distance(lh: List[Int], rh: List[Int]): Int =
    lh.sorted.zip(rh.sorted).map:
      (l, r) => l - r
    .map: v =>
      if v < 0 then v * -1 else v
    .fold(0):
      _ + _

  def task2Similarity(lh: List[Int], rh: List[Int]): Int =
    lh.fold(0): (acc, v) =>
      (rh.filter(_ == v).length * v) + acc

  def loadDay1(fileName: String): (List[Int], List[Int]) =
    scala.io.Source.fromFile(fileName).getLines
      .map: l =>
        l.split("   ") match
          case Array(a, b) => (a.toInt, b.toInt)
      .toList.unzip
