package com.example.calculator.ComposeCalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.CalculatorActions
import com.example.calculator.CalculatorButton
import com.example.calculator.CalculatorOperation
import com.example.calculator.CalculatorState

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onActions: (CalculatorActions) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom

        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Normal,
                fontSize = 80.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Red,
                maxLines = 2,

            )
            Spacer(modifier = Modifier.size(10.dp))
            ///////////////////////////////////////////////////////////////////////
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onActions(CalculatorActions.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )

            }
            //////////////////////////////////////////////////////////////////////////////
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                        verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                )

            }
            /////////////////////////////////////////////////////////////////////////////
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )

            }
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )

            }
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onActions(CalculatorActions.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Calculator)
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                )

            }
        }
    }
}
