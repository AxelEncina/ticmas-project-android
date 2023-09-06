package com.example.ticmas_project_android

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.example.ticmas_project_android.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testCompareButtonClicked() {
        // Enciende la actividad
        ActivityScenario.launch(MainActivity::class.java)

        // Encuentra y realiza una acción en los elementos de la interfaz de usuario
        Espresso.onView(ViewMatchers.withId(R.id.textCard1)).perform(ViewActions.typeText("Texto1"))
        Espresso.onView(ViewMatchers.withId(R.id.textCard2)).perform(ViewActions.typeText("Texto1"))
        Espresso.onView(ViewMatchers.withId(R.id.botonComparar)).perform(ViewActions.click())

        // Verifica el resultado esperado en el TextView
        Espresso.onView(ViewMatchers.withId(R.id.textResult2))
            .check(ViewAssertions.matches(ViewMatchers.withText("Los Textos SON IGUALES")))
    }
}
/*import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class InstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.ticmas_project_android", appContext.packageName)
    }
}*/