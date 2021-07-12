package com.example.ejemploviewmodel.model

class FraseInit {


    companion object {

        fun randonCItazioni(): PojoFrase {

            val position = (0..5).random()
            return frasesList[position]
        }

        private val frasesList = listOf(
            PojoFrase("angelo", "l'ingliterra ha perso "),
            PojoFrase("angelo", "addio kane "),
            PojoFrase("angelo", "mi spaice per voi inglesi ma il cielo è azzurro "),
            PojoFrase("angelo", "non si possono cmprare le partite "),
            PojoFrase("angelo", "mamma guardami "),

            )
    }

}