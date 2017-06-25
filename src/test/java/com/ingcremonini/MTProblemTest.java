package com.ingcremonini;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.ingcremonini.MTProblem.MAX_NUMBER_OF_NAMES;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Daniele Cremonini on 05/03/17.
 */
@RunWith(ConcurrentTestRunner.class)
public class MTProblemTest {

    // This is the multi threaded problematic class
    private MTProblem mtProblem;

    private static final int TOTAL_LOOPS = MAX_NUMBER_OF_NAMES + 100;

    // Number of maximum concurrent threads that have to stress the MTProblem class
    private final static int THREAD_COUNT = 100;

    @Before
    public void before() {
        mtProblem = new MTProblem();
    }

    @Test
    @ThreadCount(THREAD_COUNT)
    public void addName_should_not_exceed_maxAllowedSize() throws Throwable {
        for (int i = 0; i < TOTAL_LOOPS; i++) {
            mtProblem.addName("" + i);
        }
    }

    @After
    public void finalCheck() {
        assertThat(String.format("Size must be exactly %d", MAX_NUMBER_OF_NAMES ),
                mtProblem.getNames().size(),
                equalTo(MAX_NUMBER_OF_NAMES) );
    }

}