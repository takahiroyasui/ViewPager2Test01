package uniba.jp.viewpager2test01

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import timber.log.Timber


class MainActivityViewModel : ViewModel(), LifecycleObserver {

    override fun onCleared() {
        super.onCleared()
        Timber.d("onCleared")
    }
}