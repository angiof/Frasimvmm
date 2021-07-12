package com.example.ejemploviewmodel.model.viemodels

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.ejemploviewmodel.model.FraseInit
import com.example.ejemploviewmodel.model.PojoFrase

class ViewModelFreasi() :ViewModel(){



    val frasiCitazioni= MutableLiveData<PojoFrase> ()


    fun iniziaCitazioni(){
        val initCitazioni=FraseInit.randonCItazioni()
        frasiCitazioni.postValue(initCitazioni)
    }

}