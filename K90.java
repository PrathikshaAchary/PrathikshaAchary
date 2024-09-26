/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k88;
class Bank2{
    int getInterestRate(){
    return 0;}}
class Canara extends Bank2{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank2{
    int getInterestRate(){
        return 6;}}
class SCDCC extends Bank2{
    int getInterestRate(){
        return 8;}}
    

/**
 *
 * @author smv
 */
public class K90 {
    public static void main(String[] args){
        Canara bank1= new Canara();
        SBI bank2=new SBI();
        SCDCC bank3= new SCDCC();
        System.out.println("Bank1: "+bank1.getInterestRate()+"%");
        System.out.println("Bank2: "+bank2.getInterestRate()+"%");
        System.out.println("Bank3: "+bank3.getInterestRate()+"%");
            }
    
}
