import androidx.compose.ui.window.ComposeUIViewController
import cocoapods.AFNetworking.*
import cocoapods.RevenueCat.*

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { App() }