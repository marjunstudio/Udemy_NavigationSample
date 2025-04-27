package to.msn.wings.navigationsample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ThirdScreen(navigationToFirstScreen: () -> Unit) {
    Button(onClick = {
        navigationToFirstScreen()
    }) {
        Text("3番目の画面")
    }
}

@Preview
@Composable
fun ThirdPreview() {
    ThirdScreen({})
}