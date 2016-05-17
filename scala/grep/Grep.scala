import scala.io.Source

object Grep {
   def main(args: Array[String]): Unit = {
      if (args.size < 2)
         println("usage: grep term file")
      else {
         val term = args(0)
         val file = args(1)
         grep(term,file) 
      }
   }
   
   def grep(term: String, filepath: String): Unit = {
      Source.fromFile(filepath).getLines().foreach { line =>
         if (line.contains(term))
            println(line)
      }
   }
}