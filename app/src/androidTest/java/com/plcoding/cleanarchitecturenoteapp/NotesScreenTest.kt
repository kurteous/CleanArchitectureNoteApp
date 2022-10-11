package com.plcoding.cleanarchitecturenoteapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

// Note that as of 10/10/22, tests do NOT work on an emulator running SDK 33:
// https://issuetracker.google.com/issues/240993946
// So, use an emulator on SDK 32 or lower.
class NotesScreenTest {

    @get: Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun header_row_shows() {
        composeTestRule
            .onNodeWithTag(composeTestRule.getString(R.string.notes_screen_header_row))
            .assertIsDisplayed()
    }

    @Test
    fun header_row_shows_text() {
        composeTestRule
            .onNodeWithText(composeTestRule.getString(R.string.notes_screen_header_text))
            .assertIsDisplayed()
    }

    @Test
    fun header_row_shows_sort_button() {
        composeTestRule
            .onNodeWithContentDescription(composeTestRule.getString(R.string.notes_screen_sort_button_content_description))
            .assertIsDisplayed()
    }
}