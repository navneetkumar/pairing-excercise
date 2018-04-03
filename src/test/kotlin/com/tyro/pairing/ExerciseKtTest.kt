package com.tyro.pairing

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`

class ExerciseKtTest {

    @Test
    fun shouldFail() {
        assertThat(true, equalTo(false))
    }

}
