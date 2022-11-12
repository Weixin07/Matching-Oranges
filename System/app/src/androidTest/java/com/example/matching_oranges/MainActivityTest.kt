package com.example.matching_oranges

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))

    }
}