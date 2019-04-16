package com.example.espressosample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import android.support.test.espresso.Espresso.onView
import android.provider.SyncStateContract.Helpers.update
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    //Put JvmField to add ActivityTestRule
    @Rule @JvmField
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    // Define test to check the text change works on click of button
    @Test
    fun checkChangeText() {
        // First put "Hi" in the editText
        onView(withId(R.id.editText)).perform(replaceText("Hi"), closeSoftKeyboard())
        // Now perform action click on the button
        onView(withId(R.id.button)).perform(click())
        // Cj=heck if the text has changed from "Hi" to "Hello" in the editText
        onView(withId(R.id.editText)).check(matches(withText("Hello")))
    }

}
