package nikifor.tatarkin.a3l1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*
import kotlin.collections.RandomAccess

class Model {

    private val stringLiveData = MutableLiveData<String>()

    init {
        stringLiveData.value = "Hi"
    }

    fun getStringLiveData(): LiveData<String> = stringLiveData
}