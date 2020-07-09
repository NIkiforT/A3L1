package nikifor.tatarkin.a3l1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import nikifor.tatarkin.a3l1.data.Repository

class MainViewModel : ViewModel() {

    private val viewStateLiveData = MutableLiveData<MainViewState>()

    init {
        viewStateLiveData.value = MainViewState(Repository.getNotes())
    }

    fun viewState(): LiveData<MainViewState> = viewStateLiveData
}