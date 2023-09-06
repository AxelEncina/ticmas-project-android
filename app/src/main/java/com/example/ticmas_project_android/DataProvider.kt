package com.example.ticmas_project_android

class DataProvider {
    //clase estática
    companion object {


            fun random():ModelData{
                val position = (0..9).random()
                return respuestas[position]
            }
            private val respuestas = listOf<ModelData>(
                ModelData("Estupendo"),
                ModelData("Grandioso"),
                ModelData("Fabuloso"),
                ModelData("Fantástico"),
                ModelData("Genial"),
                ModelData("Tremendo"),
                ModelData("Buenísimo"),
                ModelData("Muy Bien"),
                ModelData("Increible"),
                ModelData("Te luciste"),
            )
    }


}