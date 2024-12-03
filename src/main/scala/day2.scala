object day2:

  enum Trend:
    case Asc, Desc, Flat, None

  object Trend:
    def trend(lh: Int, rh: Int): Trend = lh - rh match
      case x if x < 0 => Asc
      case x if x > 0 => Desc
      case _ => Flat


  def task1LevelReports(mx: List[List[Int]]): Int =
    def reduceLevel(trend: Trend, previous: Int, level: List[Int]): Boolean =
      level match
        case current :: tail =>
          val abs = scala.math.abs(previous - current)
          val newTrend = Trend.trend(previous, current)

          if (trend != newTrend && trend != Trend.None) || (abs > 3 || abs < 1) then false
          else reduceLevel(newTrend, current, tail)
        case Nil => trend != Trend.Flat
    mx.map:
      case Nil => false
      case h :: t => reduceLevel(Trend.None, h, t)
    .count(identity)





















  def loadDay2(filePath: String): List[List[Int]] =
    scala.io.Source.fromFile(filePath).getLines
    .map: l =>
      l.split(" ")
      .map(s => s.toInt)
      .toList
    .toList
