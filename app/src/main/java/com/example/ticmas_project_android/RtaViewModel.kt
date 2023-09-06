package com.example.ticmas_project_android

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RtaViewModel : ViewModel() {

    val modelData = MutableLiveData<ModelData>()
    //LiveData le avisa al MainActivity que hubo un cambio
    fun randomGen() {
        val current = DataProvider.random()
        modelData.postValue(current)
    }
}