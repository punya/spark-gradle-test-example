package sparkexample

import org.apache.spark._
import org.apache.spark.rdd._

object AllUsers extends App {
  val conf = new SparkConf().setAppName("All Users")
  val spark = new SparkContext(conf)
  getUsers(spark.textFile("/etc/passwd"))
    .foreach(Console.println)

  def getUsers(lines: RDD[String]): RDD[String] =
    lines.filter(!_.startsWith("#")).map(_.split(":")(0))
}
