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
        // Inicia la actividad utilizando ActivityScenario
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // Simula la entrada de texto en los EditText
        onView(withId(R.id.textCard1)).perform(typeText("Texto1"))
        onView(withId(R.id.textCard2)).perform(typeText("Texto1"))

        // Haz clic en el botón "Comparar"
        onView(withId(R.id.botonComparar)).perform(click())

        // Verifica el resultado en el TextView
        onView(withId(R.id.textResult2)).check(matches(withText("Los Textos SON IGUALES")))

        // Cierra la actividad al finalizar
        scenario.close()
    }
}
