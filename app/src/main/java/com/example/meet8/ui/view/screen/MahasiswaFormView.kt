package com.example.meet8.ui.view.screen

import androidx.compose.runtime.Composable

@Composable
fun MahasiswaFormView(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama,nim,email)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(
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
    }
}