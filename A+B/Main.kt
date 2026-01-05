import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val st = StringTokenizer(br.readLine())

    val a =  st.nextToken().toInt()
    val b = st.nextToken().toInt()

    println(a + b)
}