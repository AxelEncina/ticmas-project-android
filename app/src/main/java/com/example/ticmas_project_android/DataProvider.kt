package com.example.ticmas_project_android

class DataProvider {
    //clase estática
    companion object {
            fun random():ModelData{
                val position = (0..8).random()
                return respuestas[position]
            }
            private val respuestas = listOf<ModelData>(
                ModelData("Gracias!"),
                ModelData("Thank you!"),
                ModelData("Obrigado!"),
                ModelData("Merci!"),
                ModelData("Grazie!"),
                ModelData("谢谢 (Xièxiè)"),
                ModelData("ありがとう (Arigatou)"),
                ModelData("شكراً  (Shukran)" ),
                ModelData("Danke!"),
            )
    }


}