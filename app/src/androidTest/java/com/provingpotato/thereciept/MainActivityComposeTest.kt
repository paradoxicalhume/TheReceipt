package com.provingpotato.thereciept

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test

class MainActivityComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun greeting_isDisplayed() {
        // Check if the text "Welcome to The Receipt!" is displayed
        composeTestRule.onNodeWithText("Welcome to The Receipt!").assertIsDisplayed()
    }
}
