object Main {
  def main(args: Array[String]): Unit = {
    val folder = os.temp.dir()
    val file = folder / "test"
    
    println(s"writing file $file")
    os.write(file, "hello")

    println(s"overwriting file $file")
    os.write.over(file, "howdy")

    println(s"removing file $file")
    os.remove.all(file)
  }
}
