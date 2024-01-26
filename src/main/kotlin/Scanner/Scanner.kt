package pw.mlnkv.Scanner

import java.io.File

class Scanner {
    private val filesPath = Settings.FILES_PATH
    private val resultPath = Settings.RESULT_PATH

    init {
        println("Scanner initialized")

        if(!File(resultPath).exists()) {
            File(resultPath).mkdir()
        }
    }

    fun run() {
        println("Scanner started")
        File(filesPath).walk().forEach {
            println("File: $it")
        }
    }
}