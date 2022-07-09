package com.humam.challengechapter3.`hopimpa-humam`

import com.humam.challengechapter3.`hopimpa-humam`.utils.playerPickHopimpa
import kotlin.system.exitProcess

class Hopimpa {

        fun GameHopimpa() {
            println("""
                |========================
                |Game Hopimpa Terminal
                |========================
                | Pilih antara Putih dan Hitam :  
                |""".trimMargin())
            playerPickHopimpa().player1Pick()
            playAgainHopimpa()
        }

        fun playAgainHopimpa() {
            println()
            println("Apakah kamu ingin bermain Hopimpa lagi? (y/n) :")
            if (readLine()?.lowercase() == "y") {
                GameHopimpa()
            }  else if (readLine()?.lowercase() == "n"){
                println("Terima kasih sudah bermain")
                println("=========================")
                exitProcess(0)
            } else {
                println("Pilihan tidak ada, silahkan ulangi")
                playAgainHopimpa()
            }
        }
    }