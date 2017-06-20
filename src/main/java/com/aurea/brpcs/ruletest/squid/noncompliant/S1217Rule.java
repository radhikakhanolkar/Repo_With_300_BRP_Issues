package com.aurea.brpcs.ruletest.squid.noncompliant;

public class S1217Rule {

    public static class PoolThread extends Thread {

    }

    public static class WithMethodParameter {

        public void test(Thread thread) {
            thread.run();
        }

        public void test(PoolThread thread) {
            thread.run();
        }
    }

    public static class WithInMethod {

        public void testWithThread() {
            Thread thread = new Thread();
            thread.run();

            new Thread().run();
        }

        public void testWithExtending() {
            PoolThread thread = new PoolThread();
            thread.run();

            new PoolThread().run();
        }
    }
}
