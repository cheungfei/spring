package com.spring.study.advanced.concurrent.lock;

/**
 * 导游线程，都到达目的地时，发放护照和签证
 */
public class TourGuideTask implements Runnable {

    @Override
    public void run() {
        System.out.println("****导游分发护照签证****");
        try {
            //模拟发护照签证需要2秒
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
