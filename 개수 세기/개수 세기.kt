//  개수 세기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private class FastScanner {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st = StringTokenizer("")

    fun next(): String {
        while(!st.hasMoreTokens()) {
            st = StringTokenizer(br.readLine())
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
    for (x in arr) if (x == cnt) cnt++
    print(cnt)
}
