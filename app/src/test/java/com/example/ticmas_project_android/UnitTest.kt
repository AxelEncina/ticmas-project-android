package com.example.ticmas_project_android

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RtaViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var viewModel: RtaViewModel
    private lateinit var observer: Observer<ModelData>

    @Before
    fun setup() {
        viewModel = spyk(RtaViewModel())
        observer = mockk(relaxed = true)
        viewModel.modelData.observeForever(observer)
    }

    @Test
    fun `test randomGen`() {
        val dataProvider = spyk(DataProvider)
        every { dataProvider.random() } returns ModelData("Probando Test")

        viewModel.randomGen()

        verify { observer.onChanged(ModelData("Probando Test")) }
    }

    @Test
    fun `test areStringsEqual`() {
        val result = viewModel.areStringsEqual("Hola Mundo!", "Hola Mundo!")
        assert(result) // Debe ser verdadero porque las cadenas son iguales
    }
}




