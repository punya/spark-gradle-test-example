package sparkexample

import org.apache.spark._
import org.apache.spark.rdd._
import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AllUsersSpec extends FlatSpec with Matchers {
  it should "succeed" in {
    val spark = new SparkContext("local[1]", "Test")
    val lines = spark.parallelize(List("# comment", "pb:x:y", "jc:z:w"))
    val users = AllUsers.getUsers(lines).collect
    users should equal (List("pb", "jc"))
  }
}


