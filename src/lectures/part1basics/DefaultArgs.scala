package lectures.part1basics

object DefaultArgs extends App{

  def trFact(n: Int, acc: Int = 1): Int = {
    if(n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 600, height: Int = 800): Unit = println("Saving picture")

  savePicture()
  savePicture("bmp")
  savePicture(width = 640)
  savePicture(height = 480, width = 640, format = "png")

}
