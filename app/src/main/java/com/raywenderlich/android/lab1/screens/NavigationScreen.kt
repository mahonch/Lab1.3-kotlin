package com.raywenderlich.android.lab1.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
@Preview
fun NavigationScreen() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            NavigationButton(stringResource(id = R.string.button_view_text), Screen.Text)
            NavigationButton(stringResource(id = R.string.button_textField), Screen.TextField)
            NavigationButton(stringResource(id = R.string.button_buttons), Screen.Buttons)
            NavigationButton(stringResource(id = R.string.button_progress), Screen.ProgressIndicator)
            NavigationButton(stringResource(id = R.string.button_alertDialog), Screen.AlertDialog)
            NavigationButton(stringResource(id = R.string.button_row), Screen.Row)
            NavigationButton(stringResource(id = R.string.button_column), Screen.Column)
            NavigationButton(stringResource(id = R.string.button_box), Screen.Box)
            NavigationButton(stringResource(id = R.string.button_surface), Screen.Surface)
            NavigationButton(stringResource(id = R.string.button_scaffold), Screen.Scaffold)
        }
    }
}

@Composable
fun NavigationButton(text: String, screen: Screen) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 14.dp, end = 12.dp, top = 16.dp),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.black)),
        onClick = { FundamentalsRouter.navigateTo(screen) }
    ) {
        Text(

            text = text,
            color = Color.White
        )
    }
}