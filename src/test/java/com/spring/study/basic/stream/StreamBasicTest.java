package com.spring.study.basic.stream;

import java.util.Arrays;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 15:21
 */
public class StreamBasicTest {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        Arrays.asList( "a", "b", "d" ).forEach(System.out::println);
        Arrays.asList( "a", "b", "d" ).forEach((String e) -> System.out.println(e));
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );

        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );

        final String separatorFinal = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separatorFinal ) );


        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );


    }
}
