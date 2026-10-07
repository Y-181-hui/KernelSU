package me.weishv.kernelsv.ui.component.choosekmidialog

import androidx.compose.runtime.Composable
import me.weishv.kernelsv.ui.LocalUiMode
import me.weishv.kernelsv.ui.UiMode

@Composable
fun ChooseKmiDialog(
    show: Boolean,
    onDismissRequest: () -> Unit,
    onSelected: (String?) -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> ChooseKmiDialogMiuix(show, onDismissRequest, onSelected)
        UiMode.Material -> ChooseKmiDialogMaterial(show, onDismissRequest, onSelected)
    }
}
