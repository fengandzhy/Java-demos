package org.zhouhy.java8.collection;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BTest {

    @Benchmark
    public void test() {
        // todo
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BTest.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
