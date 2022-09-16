package com.spring.study.basic.stream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 15:35
 */
public class DefaultableTest {
    private static class DefaultableImpl implements Defaultable {
    }

    private static class OverridableImpl implements Defaultable {
        @Override
        public String notRequired() {
            return "Overridden implementation";
        }
    }

    public static void main(String[] args) {
        Defaultable defaulable = DefaultableFactory.create( DefaultableImpl::new );
        System.out.println( defaulable.notRequired() );

        defaulable = DefaultableFactory.create( OverridableImpl::new );
        System.out.println( defaulable.notRequired() );
    }
}


