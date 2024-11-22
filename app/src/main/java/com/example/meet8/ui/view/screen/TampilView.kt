package com.example.meet8.ui.view.screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meet8.R
import com.example.meet8.ui.model.Mahasiswa
import com.example.meet8.ui.model.RencanaStudy

@Composable
fun TampilView(
    uiStateMhs: Mahasiswa,
    uiStateMK: RencanaStudy,

    onBackButtonClicked: () -> Unit = {},
    onResetButtonClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary
                )
            ), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(16.dp))
        Row {
            Image(
                painter = painterResource(
                    id = R.drawable.umy
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(75.dp)
                    .padding(bottom = 15.dp)
            )
            Column {
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Red, fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Unggul dan Islami",
                    color = Color.Red,
                    fontWeight = FontWeight.Light
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxSize()
                .background(Color.LightGray)
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier
                .background(color = Color.Yellow, shape = RoundedCornerShape(15.dp))
                .padding(15.dp)) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                    ) {
                        Text("Nim:")
                        Text(uiStateMhs.nim)
                        Text("Nama:")
                        Text(uiStateMhs.nama)
                    }
                    Column(
                    ) {
                        Text(uiStateMhs.email)
                    }
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Matakuliah yang diambil:")
                    Text(uiStateMK.namaMK)
                    Row() {
                        Text(text = "Kelas:")
                        Text(uiStateMK.kelas)
                    }
                }
                Spacer(modifier = Modifier.padding(32.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(onClick = { onBackButtonClicked() }) {
                        Text(text = "Kembali")
                    }
                    Button(onClick = { onResetButtonClicked() }) {
                        Text(text = "Reset")
                    }
                }
            }
        }
    }
}
