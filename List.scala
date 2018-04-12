~$ dotr
Starting dotty REPL...

/* 列表 */
scala> import scala.collection.immutable.List

/* 列表初始化 方式1 */
scala> val array: List[Int] = List(1, 2, 3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表初始化 方式2 */
scala> val array: List[Int] = List.apply(1, 2, 3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 空列表开头添加 元素 */
scala> val array: List[Int] = 1 :: 2 :: 3 :: 4 :: 5 :: Nil 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 空列表开头添加 元素 */
scala> val array: List[Int] = 1 :: 2 :: 3 :: 4 :: 5 :: List() 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表开头添加 元素 */
scala> val array: List[Int] = 1 :: 2 :: List(3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表开头添加 列表 */
scala> val array: List[Int] = List(1, 2) ::: List(3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表 拼接 */
scala> val array: List[Int] = List(1, 2) ++ List(3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表开头添加 元素 */
scala> val array: List[Int] = 1 +: 2 +: List(3, 4, 5) 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表末尾添加 元素 */
scala> val array: List[Int] = List(1, 2, 3) :+ 4 :+ 5 
val array: List[Int] = List(1, 2, 3, 4, 5)

scala> val array: List[Int] = 1 +: 2 +: List(3) :+ 4 :+ 5 
val array: List[Int] = List(1, 2, 3, 4, 5)

/* 列表索引获取元素 */
scala> array(0) 
val res32: Int = 1

scala> array(1) 
val res33: Int = 2

scala> array(4) 
val res36: Int = 5

/* 元素求和 */
scala> array.sum 
val res16: Int = 15

/* 获取元素 最大值 */
scala> array.max 
val res0: Int = 5

/* 获取元素 最小值 */
scala> array.min 
val res1: Int = 1

/* 第一个元素 */
scala> array.head 
val res2: Int = 1

/* 最后一个元素 */
scala> array.last 
val res3: Int = 5

/* 判断空列表 */
scala> array.isEmpty 
val res4: Boolean = false

/* 列表长度 */
scala> array.length 
val res5: Int = 5

/* 使用分隔符将列表元素作为字符串显示 */
scala> array.mkString(",") 
val res6: String = "1,2,3,4,5"

/* 列表反转 */
scala> array.reverse.mkString(",") 
val res7: String = "5,4,3,2,1"

/* 获取除第一个之外所有元素 */
scala> array.tail 
val res8: List[Int] = List(2, 3, 4, 5)

/* 获取除最后一个之外所有元素 */
scala> array.init 
val res9: List[Int] = List(1, 2, 3, 4)

/*  */
scala> array.toString 
val res10: String = "List(1, 2, 3, 4, 5)"

/*  */
scala> array.equals(List(1, 2, 3, 4, 5)) 
val res11: Boolean = true

/*  */
scala> array == List(1, 2, 3, 4, 5) 
val res12: Boolean = true

/*  */
scala> array.eq(List(1, 2, 3, 4, 5)) 
val res13: Boolean = false

scala> array.exists(_ == 1) 
val res14: Boolean = true

scala> array.exists(_ == 6) 
val res15: Boolean = false

/* 提取列表的前n个元素 */
scala> array.take(1) 
val res17: List[Int] = List(1)

scala> array.take(2) 
val res18: List[Int] = List(1, 2)

scala> array.take(5) 
val res19: List[Int] = List(1, 2, 3, 4, 5)

/* 提取列表的后n个元素 */
scala> array.takeRight(1) 
val res20: List[Int] = List(5)

scala> array.takeRight(2) 
val res21: List[Int] = List(4, 5)

scala> array.takeRight(5) 
val res22: List[Int] = List(1, 2, 3, 4, 5)

scala> array.drop(1) 
val res23: List[Int] = List(2, 3, 4, 5)

scala> array.drop(2) 
val res24: List[Int] = List(3, 4, 5)

scala> array.drop(5) 
val res25: List[Int] = List()

scala> array.dropRight(1) 
val res26: List[Int] = List(1, 2, 3, 4)

scala> array.dropRight(2) 
val res27: List[Int] = List(1, 2, 3)

scala> array.dropRight(5) 
val res28: List[Int] = List()
