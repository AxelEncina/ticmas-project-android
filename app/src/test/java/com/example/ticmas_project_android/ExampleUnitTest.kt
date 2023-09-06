package com.example.ticmas_project_android

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
/*
    @Test
    fun testAreStringsEqual() {
        val result = areStringsEqual("Prueba", "Prueba")
        assertEquals(true, result)
    }

    @Test
    fun testAreStringsNotEqual() {
        val result = areStringsEqual("Prueba", "Prueban't")
        assertEquals(false, result)
    }
}
/*
class MainUnitTest {
    private lateinit var viewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    fun mainViewModel_CheckInitialValue() = runTest {
        var value = viewModel.counter.value?.number
    }
}*/