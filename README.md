# Steppe
A simple Scala CSV reader.


### Usage
```scala
val csv = new File(getClass.getResource("/csv.csv").getPath)
val reader = new RichCsvReader[(String,Int,Int,Int,String)](csv)

val iterator = reader.iterator
while(iterator.hasNext){
  println(iterator.next())
}

//Using for comprehensions.
for(line <- reader){
  println(line._1) // gets column 1
  println(line._5) // gets column 5
}
```

## License
steppe is Open Source and available under the Apache 2 License.
