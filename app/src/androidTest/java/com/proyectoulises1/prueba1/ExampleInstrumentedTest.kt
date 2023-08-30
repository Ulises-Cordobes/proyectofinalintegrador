package com.proyectoulises1.prueba1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.proyectoulises1.prueba1.R
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    fun testCompareButton() {
        onView(withId(R.id.editText1)).perform(typeText("hello"))
        onView(withId(R.id.editText2)).perform(typeText("world"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
