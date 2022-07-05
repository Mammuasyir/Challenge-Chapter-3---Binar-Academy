package com.humam.challengechapter3.hopimpa.utils

fun main() {
    println("===========================================================================")
    println("GAMETERMINAL VERSION")
    println("===========================================================================")
    println("Pilihan 2")
    println("Mulai Bermain:")
    println("Masukkan pemain 1:")
    var input1 = readLine().toString()
    println("Masukkan Pemain 2")
    var input2 = readLine().toString()
    val pemain1 = Player(input1)
    val pemain2 = Player(input2)
    val hasilGame = compare(pemain1, pemain2)
    println("Hasil: \n$hasilGame")
}

fun compare(player1: Player, player2: Player): String {
    var result = "unknown"
    val weapon1 = player1.playerWeapon
    val weapon2 = player2.playerWeapon

    when(weapon1) {
        "gunting" -> {
            when(weapon2) {
                "gunting" -> result = "Tidak ada yang tereliminasi"
                "batu" -> result = "Pemain 2 MENANG"
                "kertas" -> result = "Pemain 1 MENANG"
                else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
            }
        }
        "batu" -> {
            when(weapon2) {
                "gunting" -> result = "Pemain 1 MENANG"
                "batu" -> result = "Tidak ada yang tereliminasi"
                "kertas" -> result = "Pemain 2 MENANG"
                else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
            }
        }
        "kertas" -> {
            when(weapon2) {
                "gunting" -> result = "Pemain 2 MENANG"
                "batu" -> result = "Pemain 1 MENANG"
                "kertas" -> result = "Tidak ada yang tereliminasi"
                else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
            }
        }
        else -> result = "Invalid input. Ketik gunting, batu, atau kertas!"
    }
    return result
}

