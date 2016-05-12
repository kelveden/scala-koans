var incrementer = 3

val closure = (x:Int) => x + incrementer

closure(3)

incrementer = 2

closure(3)
