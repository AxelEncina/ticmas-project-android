package com.example.ticmas_project_android

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.ticmas_project_android.MainActivity
import org.junit.Test

class MainActivityInstrumentedTest {

    @Test
    fun testCompareButtonClicked() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.textCard1)).perform(typeText("Texto1"))
        onView(withId(R.id.textCard2)).perform(typeText("Texto1"))

        onView(withId(R.id.botonComparar)).perform(click())

        onView(withId(R.id.textResult2)).check(matches(withText("Los Textos SON IGUALES")))

        scenario.close()
    }
}
