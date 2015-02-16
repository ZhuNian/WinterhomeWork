package org.nightschool.demo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testName() throws Exception {
        //准备数据
        Calculator calculator = new Calculator();

        //执行方法
        int result = calculator.plus(1, 2);

        //验证结果
        assertThat(result, is(3));

    }
}