package com.humam.challengechapter3.hopimpa

import com.humam.challengechapter3.hopimpa.utils.playerPick
import kotlin.system.exitProcess

class Hopimpa {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            headerGame()
            playerPick().player1Pick()
            playAgain()
        }

        private fun headerGame() {
            println("=========================")
            println("Game Hopimpa Terminal")
            println("=========================")
            println("Pilih antara Putih dan Hitam")
            println("Mulai Bermain : ")
        }

        private fun playAgain() {
            println()
            println("Apakah kamu ingin bermain lagi? (y/n) :")
            if (readLine()?.lowercase() == "y") {
                main(arrayOf())
            } else {
                println("Terima kasih sudah bermain")
                println("=========================")
                exitProcess(0)
            }
        }
    }
}