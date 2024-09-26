/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k88;
class Employee{
    private int id ;
    private String name ;
    private double salary ;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;}
    public void raiseSalary(double percent){
        if(percent>0){
            double increment=salary*percent/100;
            salary=salary+increment;
            System.out.println("New salary: "+salary);}
        else{
            System.out.println("New salary: "+salary);}}
    public void getEmpDetails(){
        System.out.println(name+" "+id+""+salary);}}
        
    


/**
 *
 * @author smv
 */
public class K88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1=new Employee(1,"kuthyar",5000);
        emp1.getEmpDetails();
        
        emp1.raiseSalary(10);
        emp1.getEmpDetails();
    }
    
}
