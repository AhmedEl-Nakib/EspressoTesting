package com.example.espressotesting

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ThirdActivityTest{
    @get:Rule
    val activityRule = ActivityScenarioRule(ThirdActivity::class.java)

    @Test
    fun test_isListFragmentVisible_onAppLaunch() {
        onView(withId(R.id.recyclerViewId)).check(matches(isDisplayed()))
    }

    @Test
    fun test_selectListItem_isDetailFragmentVisible() {

        // scroll to position and make click on it
        onView(withId(R.id.recyclerViewId))
            .perform(actionOnItemAtPosition<RecyclerViewAdapter.ViewHolder>(2, click()))

    }
}