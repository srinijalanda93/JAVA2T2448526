package Lab3;

class Employee{
    static String collegeName="Christ University";
    String Ename,Edesignation;
    int eid;
    public  Employee(int eid,String Ename,String Edesignation){
        this.eid=eid;
        this.Ename=Ename;
        this.Edesignation=Edesignation;
    }
    public void getdetails(){
        System.out.println("The employee ID is"+this.eid);
    }
}
class HourlyEmployee extends Employee{
    float HourlyRate,HourlyWorked;

    public HourlyEmployee( float HourlyRate,float HourlyWorked){
        
    }

}

class SalariedEmployee extends Employee{}
public class Lab3p1 {
    public static void main(String[] args){
        System.out.println("Lab-3 p1");

    }

}
