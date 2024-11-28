/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopjp;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        start();
        
    }
public void run(){
    for(int i=1;i<=5;i++){
        System.out.println("child Thread:"+i);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Child thread interrupted");
            
        }
    }
}
}
/**
 *
 * @author Shamili
 */
public class MainThread {
    public static void main(String[] args){
        MyThread myThread=new MyThread("child thread");
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread:"+i);
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Main thread interrupted");
                
        }
        }
    }
}
