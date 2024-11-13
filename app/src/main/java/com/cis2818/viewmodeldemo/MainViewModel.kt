package com.cis2818.viewmodeldemo
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    private val rate = 0.74f
    //  private var dollarText = ""
    //private var result: Float = 0f
    //  private var result: MutableLiveData<Float> = MutableLiveData()

    var dollarValue: MutableLiveData<String> = MutableLiveData()

    /*
    fun setAmount(value: String){

        this.dollarText = value
        result.value = value.toFloat() * rate
    }
    fun getResult(): MutableLiveData<Float>{
        return result
    }
    */









}//end class MainViewModel