package io.github.agentpolyblank.extendefab.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/**
 * Extended FAB.
 * @param isExpanded The state of the FAB.
 * @param shape The shape of the FAB.
 * @param icon The icon to display.
 * @param elements The elements to display when the FAB is expanded.
 */
@Composable
fun ExtendedFab(
    isExpanded: MutableState<Boolean>,
    shape: Shape = RoundedCornerShape(50),
    icon: @Composable () -> Unit,
    elements: @Composable () -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AnimatedVisibility(visible = isExpanded.value) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    elements()
                }
            }
            FloatingActionButton(
                onClick = { isExpanded.value = !isExpanded.value },
                shape = shape,
            ) {
                Box(modifier = Modifier.padding(10.dp)) {
                    icon()
                }
            }
        }
    }
}

