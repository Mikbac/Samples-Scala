

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

