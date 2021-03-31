package com.greydawn;

import com.greydawn.Single.SinglePattern_doubleChecked;

/**
 * @author zhongwr
 * @date 2021-03-30 18:58:44
 * @description
 */
public class Main {

    static class TestThread extends Thread{
        @Override
        public void run() {
            //饿汉式
//            System.out.println(SinglePattern_hungry.getInstance());
            //懒汉式
//            System.out.println(SinglePattern_lazy.getInstance());
            //双检锁/双重校验锁 DCL
            System.out.println(SinglePattern_doubleChecked.getInstance());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new TestThread().start();
        }
    }

}

