package lectures.week1basics

object StringOperations extends App {
val str = "Hello, Scala!"

  println(str.substring(1,3))
  println("Hello".toLowerCase.reverse)

//  val num = "42".toInt
  println("42".toInt)

  val link = "https://stepik.org"
  println(s"The link is ${link.toUpperCase}")
  println(s"The link is $link.toUpperCase")
  println(raw"The link is \t $link")
  println(s"The link is \t $link")
}
