package com.example.pertemuan10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {

    private val mName = MutableLiveData<String>()
    private val mNPM = MutableLiveData<String>()

    val name: LiveData<String> get() = mName
    val npm: LiveData<String> get() = mNPM

    fun setName(name: String){
        mName.value = name
    }

    fun setNPM(npm: String){
        mNPM.value = npm
    }

}