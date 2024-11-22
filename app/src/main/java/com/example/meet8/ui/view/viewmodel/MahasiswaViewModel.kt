package com.example.meet8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.meet8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _mahasiswaUiState = MutableStateFlow(Mahasiswa())

    //response
    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswaUiState.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>) {
        _mahasiswaUiState.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                nim = ls[1],
                email = ls[2],
            )
        }
    }
}