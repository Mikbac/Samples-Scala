

#### Compiling 
```
scalac Main.scala
```
#### Running 
```
scala -classpath . Main
```

#### Basic
* Variables
```
val <- creates an immutable variable (like final in Java)
var <- creates a mutable variable
```

* Types
```
val b: Byte = 1
val x: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 2.0
val f: Float = 3.0

var bigInt = BigInt(1234567890)
var bigDecimal = BigDecimal(123456.789)

val a: Boolean = true

val c: Char = 'a'
val e: String = "Sample text"
```

* Multiline strings
```
        val speech =
            """Four score and
                    seven years ago
                    our fathers ..."""
```

* Evaluation Rules
```
def eVal = 1      <- evaluated when called
val eVal = 1      <- evaluated immediately
lazy val eVal = 1 <- evaluated once when needed

def myFun(x: Double)    <- call by value
def myFun(x: => Double) <- call by name
def myFun(bindings: Int*) = { ... } <- bindings is a sequence of int
```

* Higher order functions
max() returns a function that takes two integers and returns an integer  
```
def max(f: Int => Int): (Int, Int) => Int = {  
  def sum(a: Int, b: Int): Int = {...}  
  sumf  
} 
```

#### Classes
Like classes in Java.

Classes in Scala cannot have static members.

#### Traits
Like interfaces in Java.

(They can also contain method implementations or field definitions)

#### Objects
Every object definition there is only one single instance.

#### Collections
##### Base Classes
* Iterable
* Seq 
* Set
* Map 

##### Immutable Collections
* List 
* Stream 
* Vector 
* Range
* String
* Map
* Set

##### Mutable Collections
* Array
* Scala also has mutable maps and sets

