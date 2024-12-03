@main def main(): Unit =
  solveDay1
  solveDay2


def solveDay1: Unit =
  val d1Input = day1.loadDay1("src/main/resources/day1.txt")
  // Day1, task1
  val t1 = day1.task1Distance.tupled(d1Input)
  println("Day1, task1")
  println(t1)
  //Day1, task2
  val t2 = day1.task2Similarity.tupled(d1Input)
  println("Day1, task2")
  println(t2)

def solveDay2: Unit =
  val d2Input = day2.loadDay2("src/main/resources/day2.txt")
  val t1 = day2.task1LevelReports(d2Input)
  println("Day2, task1")
  println(t1)
























