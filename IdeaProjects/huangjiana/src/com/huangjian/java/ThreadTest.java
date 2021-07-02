package com.huangjian.java;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author huangjian
 * @Date 2021/7/2 9:28
 */
class MyThread extends Thread{
    //2
    public void run(){
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
public class ThreadTest {
    public static void main(String[] args) {
        //3
        MyThread t1 = new MyThread();
        //4
        t1.start();
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                System.out.println(i+"xxxmain()xx");
            }
        }
        System.out.println("helloworld");

    }
}




