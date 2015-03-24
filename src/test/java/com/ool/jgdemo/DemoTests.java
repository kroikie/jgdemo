package com.ool.jgdemo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by arthurthompson on 3/23/15.
 */
public class DemoTests {

    @Test
    public void sumTest() {
        Demo demo = new Demo();
        int sum = demo.sum(1, 1);
        Assert.assertEquals("1 + 1 should be 2", 2, sum);
    }
}
