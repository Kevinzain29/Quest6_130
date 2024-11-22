package com.example.meet8.ui.view.screen

import androidx.compose.runtime.Composable

@Composable
fun SplashView(
    onMulaiButton: ()->Unit,
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(
                id = R.drawable.umy
            ),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )
    }
}