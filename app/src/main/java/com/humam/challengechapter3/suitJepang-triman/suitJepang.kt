package com.humam.challengechapter3.`hopimpa-humam`

import com.humam.challengechapter3.`suitJepang-triman`.utils.playerPickSuit
import kotlin.system.exitProcess

class suitJepang {

        fun GameJepang() {
            println("""
                |========================
                |Game Suit Jepang Terminal
                |========================
                | Pilih antara Batu, Gunting dan Kertas :  
                |""".trimMargin())
            playerPickSuit().player1Pick()
            playAgainJepang()
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