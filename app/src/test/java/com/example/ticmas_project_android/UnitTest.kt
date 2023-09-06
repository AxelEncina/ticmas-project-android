package com.example.ticmas_project_android

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog
import org.junit.Assert.assertEquals
import org.junit.Rule
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)

class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        scenario = activityRule.scenario
    }

    //Comparadores de acierto y fallo
    @Test
    fun testComparison() {
        scenario.onActivity { activity ->
            val viewModel = activity.rtaViewModel

            val result = viewModel.areStringsEqual("hello", "hello")
            assertEquals(true, result)
        }
    }

    @Test
    fun testComparisonFailure() {
        scenario.onActivity { activity ->
            val viewModel = activity.rtaViewModel

            val result = viewModel.areStringsEqual("hello", "world")
            assertEquals(false, result)
        }
    }
}
@RunWith(RobolectricTestRunner::class)

@Config(manifest = Config.NONE)
class MainActivityTest2 {

    private lateinit var activity: MainActivity
    private lateinit var rtaViewModel: RtaViewModel

    @Before
    fun setup() {
        // Inicializa el sistema de registro
        ShadowLog.stream = System.out
        activity = Robolectric.buildActivity(MainActivity::class.java).create().start().get()
        rtaViewModel = activity.rtaViewModel
    }

    @Test
    fun testCompareButtonClicked() {
        // Configura los valores en los EditText
        val editText1 = activity.findViewById<EditText>(R.id.textCard1)
        val editText2 = activity.findViewById<EditText>(R.id.textCard2)
        editText1.setText("Texto1")
        editText2.setText("Texto1")

        // Llama al método onClick del botón "Comparar"
        val compareButton = activity.findViewById<Button>(R.id.botonComparar)
        compareButton.performClick()

        // Verifica el resultado en el TextView
        val resultTextView = activity.findViewById<TextView>(R.id.textResult2)
        assert(resultTextView.text.toString() == "Los Textos SON IGUALES")
    }
}



