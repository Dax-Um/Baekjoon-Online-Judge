//  알파벳 찾기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private class FastScanner() {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st = StringTokenizer("")

    fun next() {
        while(!st.hasMoreTokens()) {
            val line = br.readLine() ?: throw NoSuchElementException("[EOF] Check your input reading logic")
            if (line.isBlank()) continue
            st = StringTokenizer(line)
        }
        return st.nextToken()
    }
}

fun main() {
    val fs = FastScanner()
    val word = fs.next()

    var pos = IntArray(26){-1}

    for (i in word.indices) {
        val idx = word[i].code - 'a'.code
        if(pos[idx] == -1) pos[idx] = i
    }

    var sb = StringBuilder()
    for (i in pos.indices) {
        sb.append(pos[i])
        if(i != 25) sb.append(' ')
    }

    print(sb.toString())
}