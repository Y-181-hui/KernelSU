package me.weishv.kernelsv.ui.component

import androidx.compose.runtime.Composable
import me.weishv.kernelsv.Natives

@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.isManager
    val ksuVersion = if (isManager) Natives.version else null

    if (ksuVersion != null) {
        content()
    }
}
