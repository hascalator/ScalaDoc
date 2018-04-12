scala> val array: List[Int] = List.apply(1, 2, 3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)
scala> array.max 
val res0: Int = 5
scala> array.min 
val res1: Int = 1
scala> array.head 
val res2: Int = 1
scala> array.last 
val res3: Int = 5
scala> array.isEmpty 
val res4: Boolean = false
scala> array.length 
val res5: Int = 5
scala> array.mkString(",") 
val res6: String = "1,2,3,4,5"
scala> array.reverse.mkString(",") 
val res7: String = "5,4,3,2,1"
scala> array.tail 
val res8: List[Int] = List(2, 3, 4, 5)
scala> array.init 
val res9: List[Int] = List(1, 2, 3, 4)
scala> array.toString 
val res10: String = "List(1, 2, 3, 4, 5)"
scala> array.equals(List(1, 2, 3, 4, 5)) 
val res11: Boolean = true
scala> array == List(1, 2, 3, 4, 5) 
val res12: Boolean = true
scala> array.eq(List(1, 2, 3, 4, 5)) 
val res13: Boolean = false
scala> array.exists(_ == 1) 
val res14: Boolean = true
scala> array.exists(_ == 6) 
val res15: Boolean = false
