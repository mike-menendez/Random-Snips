import java.util.*
import kotlin.collections.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val mappy = HashMap<Int, Int>()
    ar.forEach { x -> mappy[x] = if(mappy.contains(x)) mappy[x]!!.plus(1) else  1 }
    return mappy.filter { x -> x.value >= 2 }.map { x -> x.value/2 }.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
