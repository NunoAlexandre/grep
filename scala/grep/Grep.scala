import scala.io.Source

object Grep {
   def main(args: Array[String]): Unit = {
      if (args.size < 2)
         println("usage: grep ")
      else
         grep(args(0), args(1))
   }

   def grep(term: String, filepath: String): Unit = {
      Source.fromFile(filepath).getLines().foreach { line =>
         if (line.contains(term))
            println(line)
      }
   }
}