import androidx.compose.ui.window.ComposeUIViewController
import org.king.extendedfab.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
