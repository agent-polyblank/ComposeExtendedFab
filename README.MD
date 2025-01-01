# ComposeExtendedFab
A floating button which expands to support multiple operations in Jetpack Compose.

<image src="./image/demo.gif" height="400" />

## Installation

// TODO

## Usage

```kotlin
...
import org.king.extendedfab.ui.ExtendedFab
import org.king.extendedfab.ui.ExtendedFabItem
...

val isExpanded = remember { mutableStateOf(false) }

ExtendedFab(
    isExpanded = isExpanded,
    icon = {
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = null,
            modifier = Modifier.size(50.dp).rotate(rotation)
        )
    },

    ) {
    ExtendedFabItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        },
        onClick = {
            // Handle click
        }
    )
    ExtendedFabItem(
        icon = {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null
            )
        },
        onClick = {
            // Handle click
        }
    )
}
```

## Demo App

You can find the demo app in the `app` module.

### Before running!
- check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
- install JDK 17 or higher on your machine
- add `local.properties` file to the project root and set a path to Android SDK there

#### Android
To run the application on android device/emulator:
- open project in Android Studio and run imported android run configuration

To build the application bundle:
- run `./gradlew :composeApp:assembleDebug`
- find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`
  Run android UI tests on the connected device: `./gradlew :composeApp:connectedDebugAndroidTest`

#### Desktop
Run the desktop application: `./gradlew :composeApp:run`
Run desktop UI tests: `./gradlew :composeApp:jvmTest`

#### iOS
To run the application on iPhone device/simulator:
- Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
- Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio
  Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`

#### Wasm Browser (Alpha)
Run the browser application: `./gradlew :composeApp:wasmJsBrowserDevelopmentRun --continue`
Run browser UI tests: `./gradlew :composeApp:wasmJsBrowserTest`

