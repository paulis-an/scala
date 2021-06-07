package lectures.week1basics

object Expressions extends App {
  val aCondition = true

  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue)

  val aNumber = if(('1' +: "23").toInt == 24) 24 else 123
  println(aNumber)
}
