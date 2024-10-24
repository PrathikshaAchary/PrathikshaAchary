/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingFour extends Thread{
      int threadNumber;
      MultiThreadingFour(int tNo){
          this.threadNumber=tNo;
      }
      public void run(){
          for(int i=1;i<6;i++){
              System.out.println("Task"+i+"by ThreadNumber"+threadNumber);
              try{
                  Thread.sleep(1000);
              }
          catch(InterruptedException e){
              
          }
          }
      }
}
public class ThreadClassAndConstructor {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultiThreadingFour mt1=new MultiThreadingFour(i);
            mt1.start();
        }
    }
}
