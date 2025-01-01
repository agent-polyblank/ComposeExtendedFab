package org.king.extendedfab.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/**
 * Extended FAB item.
 * @param icon The icon to display.
 * @param onClick The action to perform when the icon is clicked.
 */
@Composable
fun ExtendedFabItem(
    icon: @Composable () -> Unit, shape: Shape = RoundedCornerShape(50),onClick: () -> Unit){
    FloatingActionButton(
        shape = shape,
        onClick = {
            onClick()
        },
    ){
        Row(horizontalArrangement = Arrangement.Center) {
            Box(modifier = Modifier.padding(5.dp)){
                icon()
                Spacer(modifier = Modifier.size(5.dp))
            }
        }
    }
}