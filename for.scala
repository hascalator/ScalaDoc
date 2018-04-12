~$ dotr
Starting dotty REPL...

scala> for(i <- 0 to 10 by 2 if i % 2 == 0) yield i*2 
val res0: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 4, 8, 12, 16, 20)
