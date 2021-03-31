package com.greydawn.Single;

/**
 * @author zhongwr
 * @date 2021-03-30 18:54:14
 * @description 3、双检锁/双重校验锁 DCL
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键的场景。
 */
public final class SinglePattern_doubleChecked {

    private static SinglePattern_doubleChecked single = null;

    private SinglePattern_doubleChecked() {
    }

    public static SinglePattern_doubleChecked getInstance() {
        if (null == single) {
            synchronized (SinglePattern_doubleChecked.class) {
                if (null == single) {
                    single = new SinglePattern_doubleChecked();
                }
            }
        }
        return single;
    }

}