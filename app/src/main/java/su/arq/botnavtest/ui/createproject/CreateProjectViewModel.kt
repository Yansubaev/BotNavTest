package su.arq.botnavtest.ui.createproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreateProjectViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Create project Fragment"
    }
    val text: LiveData<String> = _text
}