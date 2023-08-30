package com.proyectoulises1.prueba1

    import androidx.lifecycle.LiveData
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel

    class CompareViewModel : ViewModel() {
        private val _resultText = MutableLiveData<String>()
        val resultText: LiveData<String> = _resultText

        fun compareStrings(text1: String, text2: String) {
            _resultText.value = if (text1 == text2) "Las cadenas son iguales" else "Las cadenas son diferentes"
        }
    }

