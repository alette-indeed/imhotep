package com.indeed.imhotep.metrics;

import com.indeed.flamdex.api.IntValueLookup;

/**
 * @author jsgroth
 */
public class Addition extends AbstractBinaryOperator {
    public Addition(IntValueLookup a, IntValueLookup b) {
        super(a, b);
    }

    @Override
    protected void combine(long[] values, long[] buffer, int n) {
        for (int i = 0; i < n; ++i) {
            values[i] += buffer[i];
        }
    }
}