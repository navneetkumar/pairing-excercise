package com.tyro.pairing;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ExerciseTest {

    @Test
    public void shouldFail() throws Exception {
        assertThat(true, is(false));
    }

}
