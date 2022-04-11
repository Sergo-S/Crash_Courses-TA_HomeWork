package task8;

import java.util.ArrayList;
import java.util.Comparator;


public class MainTask8 {
    public static void main(String[] args) {

        ArrayList<CalculatePay> employeeArray = new ArrayList<>();

        employeeArray.add(new ContractEmployee("001","Max",2000));
        employeeArray.add(new SalariedEmployee("102","Chloe",100,30));
        employeeArray.add(new SalariedEmployee("103","Den",50,25));
        employeeArray.add(new ContractEmployee("004","Joe",2000));
        employeeArray.add(new ContractEmployee("005","Ben",2000));
        employeeArray.add(new SalariedEmployee("106","Jordan",70,40));


        employeeArray.sort(Comparator.comparing(CalculatePay::calculatePay));

        for(Object iterator : employeeArray){
            System.out.println(iterator.toString());
        }
//
//        CalculatePay[] array = employeeArray.toArray(new CalculatePay[0]);
//        for(int i=0;i<array.length;i++){
//            if(array[i].calculatePay() < array[i+1].calculatePay()){
//
//            }
//        }










//        Employee[] employeeArray = new Employee[6];
//        employeeArray[0] = new ContractEmployee("001","Max",2000);
//        employeeArray[1] = new SalariedEmployee("102","Max",100,30);
//        employeeArray[2] = new SalariedEmployee("103","Max",50,25);
//        employeeArray[3] = new ContractEmployee("004","Max",2000);
//        employeeArray[4] = new ContractEmployee("005","Max",2000);
//        employeeArray[5] = new SalariedEmployee("106","Max",70,40);

        
    }
}
