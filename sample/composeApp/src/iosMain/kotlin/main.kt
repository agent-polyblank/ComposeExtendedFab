import androidx.compose.ui.window.ComposeUIViewController
import io.github.agentpolyblank.extendedfab.sample.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
