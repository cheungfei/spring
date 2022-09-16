package com.spring.study.basic.stream;

public class ReduceOperation1Test {
//    @Data
//    static class ScoreBean {
//        private String name; //学生姓名
//        private int score;   //分数，需要汇总该字段
//        public ScoreBean(String name, int score) {
//            this.name = name;
//            this.score = score;
//        }
//        //get 和 set 方法省略
//    }
//
//
//
//    public static void main(String[] args) {
//        List<ScoreBean> list= Lists.newArrayList(
//                new ScoreBean("张三",1)
//                ,new ScoreBean("李四",2)
//                ,new ScoreBean("王五",3)
//                ,new ScoreBean("小明",4)
//                ,new ScoreBean("小红",5));
//        Integer total=list.stream().reduce(
//                        Integer.valueOf(0),  /*初始值 identity*/
//                        (integer, scoreBean) -> integer + scoreBean.getScore(), /*累加计算 accumulator*/
//                        (integer1, integer2) -> integer1 + integer2 /*第三个参数 combiner*/
//                );
//        System.out.println(total);//结果：15
//
//
//        Integer total1=list.stream().reduce(
//                        Integer.valueOf(0),
//                        (integer, scoreBean) -> integer + scoreBean.getScore(),
//                        (integer1, integer2) -> {
//                            //这个println居然没有执行！！！
//                            System.out.println("integer1="+integer1 + ", integer2=" + integer2);
//                            return integer1 + integer2;
//                        }
//                );
//        System.out.println(total1);//结果：15
//
//
//        //Integer total=list.stream()
//        Integer total2=list.parallelStream().reduce(
//                        Integer.valueOf(0),
//                        (integer, scoreBean) -> integer + scoreBean.getScore(),
//                        (integer1, integer2) -> {
//                            //由于用的 parallelStream ，可发生并行计算，所以我增加线程id的打印：
//                            System.out.println("threadId=" + Thread.currentThread().getId() + ", integer1=" + integer1 + ", integer2=" + integer2);
//                            return integer1 + integer2;
//                        }
//                );
//        System.out.println(total2);//结果：15
//
//
//        System.out.println("=================================================================================================");
//
//        //Integer total=list.stream()
//        Integer total3=list.parallelStream().reduce(
//                        Integer.valueOf(0),
//                        (integer, scoreBean) -> {
//                            System.out.println("$ threadId=" + Thread.currentThread().getId() + ", integer=" + integer + ", scoreBean.getScore()=" + scoreBean.getScore());
//                            return integer + scoreBean.getScore();
//                        },
//                        (integer1, integer2) -> {
//                            System.out.println("threadId=" + Thread.currentThread().getId() + ", integer1=" + integer1+", integer2=" + integer2);
//                            return integer1 + integer2;
//                        }
//                );
//        System.out.println("result=" + total3);
//
//
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//        //Integer total=list.stream()
//        Integer total4=list.parallelStream().reduce(
//                Integer.valueOf(1),
//                (integer, scoreBean) -> {
//                    System.out.println("$ threadId=" + Thread.currentThread().getId() + ", integer=" + integer + ", scoreBean.getScore()=" + scoreBean.getScore());
//                    return integer + scoreBean.getScore();
//                },
//                (integer1, integer2) -> {
//                    System.out.println("threadId=" + Thread.currentThread().getId() + ", integer1=" + integer1+", integer2=" + integer2);
//                    return integer1 + integer2;
//                }
//        );
//        System.out.println("result=" + total4);
//
//
//    }
}


