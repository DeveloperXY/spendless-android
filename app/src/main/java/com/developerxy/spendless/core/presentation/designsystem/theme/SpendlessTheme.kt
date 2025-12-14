package com.developerxy.spendless.core.presentation.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun SpendlessTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalExtendedColors provides AppExtendedColors) {
        CompositionLocalProvider(LocalExtendedTypography provides AppExtendedTypography) {
            MaterialTheme(
                colorScheme = AppColorScheme,
                typography = AppTypography,
                content = content
            )
        }
    }
}