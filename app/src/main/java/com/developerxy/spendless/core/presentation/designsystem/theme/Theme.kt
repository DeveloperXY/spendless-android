package com.developerxy.spendless.core.presentation.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalExtendedColors = staticCompositionLocalOf<ExtendedColors> {
    error("LocalExtendedColors not provided")
}

val ColorScheme.extended: ExtendedColors
    @ReadOnlyComposable
    @Composable
    get() = LocalExtendedColors.current

@Immutable
data class ExtendedColors(
    val success: Color,
    val primaryFixed: Color,
    val onPrimaryFixed: Color,
    val onPrimaryFixedVariant: Color,
    val inversePrimary: Color,
    val secondaryFixed: Color,
    val secondaryFixedDim: Color,
)

val AppExtendedColors = ExtendedColors(
    success = Color(0xFF29AC08),
    primaryFixed = Color(0xFFEADDFF),
    onPrimaryFixed = Color(0xFF24005A),
    onPrimaryFixedVariant = Color(0xFF5900C7),
    inversePrimary = Color(0xFFD2BCFF),
    secondaryFixed = Color(0xFFE5EA58),
    secondaryFixedDim = Color(0xFFC9CE3E),
)

val AppColorScheme = lightColorScheme(
    primary = Color(0xFF5A00C8),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF8138FF),

    secondary = Color(0xFF5F6200),
    secondaryContainer = Color(0xFFD2E750),
    onSecondaryContainer = Color(0xFF414300),

    tertiaryContainer = Color(0xFFC4E0F9),

    error = Color(0xFFA40019),
    onError = Color.White,

    surface = Color(0xFFFCF9F9),
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Color(0xFFF6F3F3),
    surfaceContainer = Color(0xFFF0EDED),
    surfaceContainerHighest = Color(0xFFE4E2E2),
    onSurface = Color(0xFF1B1B1C),
    onSurfaceVariant = Color(0xFF44474B),
    outline = Color(0xFF75777B),

    inverseSurface = Color(0xFF303031),
    inverseOnSurface = Color(0xFFF3F0F0),
    background = Color(0xFFFEF7FF),
    onBackground = Color(0xFF1D1A25),
)