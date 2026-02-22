//  개수 세기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private class FastScanner {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st = StringTokenizer("")

    fun next(): String {
        while(!st.hasMoreTokens()) {
            val line = br.readLine() ?: throw NoSuchElementException("No more input (EOF). Check your input reading logic.")
            if (line.isBlank()) continue
            st = StringTokenizer(line)
        }
        return st.nextToken()
    }

    fun nextInt(): Int = next().toInt()
}

fun main() {
    val fs = FastScanner()

    val n = fs.nextInt()
    val arr = IntArray(n){fs.nextInt()}
    val v = fs.nextInt()

    var cnt = 0
    for (x in arr) if (x == v) cnt++
    print(cnt)
}
