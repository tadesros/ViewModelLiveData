package com.cis2818.viewmodeldemo
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    private val rate = 0.74f
    //  private var dollarText = ""
    //private var result: Float = 0f
    //  private var result: MutableLiveData<Float> = MutableLiveData()

    var dollarValue: MutableLiveData<String> = MutableLiveData()
    var result : MutableLiveData<Float> = MutableLiveData()


    fun convertValue(){

        dollarValue.let{
            if(!it.value.equals("")){
                result.value = it.value?.toFloat()?.times(rate)
            }
            else{
                result.value = 0f
            }
        }//end fun convertValue

    }//end convertValue




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