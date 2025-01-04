import androidx.compose.ui.window.ComposeUIViewController
import io.github.agentpolyblank.extendefab.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
