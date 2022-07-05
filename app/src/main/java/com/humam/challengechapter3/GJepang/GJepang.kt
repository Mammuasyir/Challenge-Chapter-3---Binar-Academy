package com.humam.challengechapter3.hopimpa

import com.humam.challengechapter3.hopimpa.utils.playerPick
import kotlin.system.exitProcess

class GJepang {

        fun GameJepang() {
            println("""
                |========================
                |Game Jepang Terminal
                |========================
                | Pilih antara Batu, Gunting dan Kertas :  
                |""".trimMargin())
            playerPick().player1Pick()
            playAgainjepang()
        }

        fun playAgainJepang() {
            println()
            println("Apakah kamu ingin bermain Suit Jepang lagi? (y/n) :")
            if (readLine()?.lowercase() == "y") {
                GameJepang()
            }  else {
                println("Terima kasih sudah bermain")
                println("=========================")
                exitProcess(0)
            }
        }
    }