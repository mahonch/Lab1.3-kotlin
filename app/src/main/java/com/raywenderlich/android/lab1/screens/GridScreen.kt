package com.raywenderlich.android.lab1.screens

import android.content.Intent.ShortcutIconResource
import android.widget.GridView
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

private  val items= listOf(
    Icons.Filled.Check,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.Delete,
    Icons.Filled.Home,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.ThumbUp,
)


@Composable
fun GridScreen(){
    GridView(columnCount = 3)

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}
@Composable
fun GridView() {
    TODO("Not yet implemented")
}

@Composable
fun RowItem(rowItems: List<IconResource>){

}

@Composable
fun RowScope.GridIcon(iconResource: IconResource){

}
data class  IconResource(val imageVector: ImageVector, val isVisible: boolean)