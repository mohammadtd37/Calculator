package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier ,
    onClick: () -> Unit
) {
    Box(
        modifier
            .clip(RectangleShape)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF41413E))

            .clickable { onClick() },
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White
        )
    }



}