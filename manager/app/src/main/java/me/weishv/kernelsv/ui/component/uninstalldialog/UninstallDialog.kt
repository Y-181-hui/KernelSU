package me.weishv.kernelsv.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import me.weishv.kernelsv.ui.LocalUiMode
import me.weishv.kernelsv.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
