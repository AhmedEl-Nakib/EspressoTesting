package com.example.espressotesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith



@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

//    @Test
//    fun testIsActivityIsRun() {
//        // to check if activity is open
//        ActivityScenario.launch(MainActivity::class.java)
//        // R.id.main is rootLayout of activity
//        onView(withId(R.id.main)).check(matches(isDisplayed()))
//    }
//
//    // Visibility
//    @Test
//    fun testVisibility_title_nextButton() {
//        ActivityScenario.launch(MainActivity::class.java)
//
//        onView(withId(R.id.activity_main_title))
//            .check(matches(isDisplayed())) // method 1
//
//        onView(withId(R.id.activity_main_title))
//            .check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method 2
//
//        onView(withId(R.id.button_next_activity))
//            .check(matches(isDisplayed()))
//    }
//
//    // Text
//    @Test
//    fun testTitleTextDisplayed() {
//        ActivityScenario.launch(MainActivity::class.java)
//
//        onView(withId(R.id.activity_main_title))
//            .check(matches(withText("MainActivity")))
//
//    }

    @Test
    fun test_backPress_toMainActivity() {

        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.name_edit_text_id)).perform(typeText("Ahmed.elnakib96@gmail.com"), closeSoftKeyboard())

        onView(withId(R.id.button_next_activity)).perform(click())

        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

        onView(withId(R.id.button_back)).perform(click()) // method 1

        onView(withId(R.id.main)).check(matches(isDisplayed()))

        onView(withId(R.id.button_next_activity)).perform(click())

        pressBack() // method 2

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }
}