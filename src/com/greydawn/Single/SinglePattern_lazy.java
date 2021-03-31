package com.greydawn.Single;

/**
 * @author zhongwr
 * @date 2021-03-30 18:54:14
 * @description 1、懒汉式
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public final class SinglePattern_lazy {

    private static SinglePattern_lazy single = null;

    private SinglePattern_lazy() {
    }

//    /**
//     * 线程不安全
//     * @return
//     */
//    public static SinglePattern_lazy getInstance() {
//        if (null == single) {
//            single = new SinglePattern_lazy();
//        }
//        return single;
//    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized SinglePattern_lazy getInstance() {
        if (null == single) {
            single = new SinglePattern_lazy();
        }
        return single;
    }

}