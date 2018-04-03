package com.tyro.pairing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class ExerciseKtTest {

    @Test
    fun shouldFail() {
        assertThat(true, equalTo(false))
    }

}
