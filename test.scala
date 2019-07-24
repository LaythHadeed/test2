//import ap
//
object test extends App {
  val l= List(1,2,3,4,5)
  println(l.head)
  println(l.tail)
  val j = List(l.head) +:l
  println(j)
  def fg(ll:List[Int]):List[List[Int]] =
  {
    def fi(ll:List[Int],acc:List[List[Int]]) :List[List[Int]]=
    {
      if (ll.isEmpty) acc
      else fi(ll.tail,  if x>y-3 List(List(ll.head))++ acc.head else List(List(ll.head))++ acc  )
    }
    fi(ll,List())
  }
  //what is going on here .......
  println()
  println()

  println(fg(l))

}
