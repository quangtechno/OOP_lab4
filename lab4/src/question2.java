/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question2 {
    public static void main(String[] args){
        Bank vietcom=new VietcomBank();
        Bank tpbank=new TPBank();
        getBank(tpbank);
        getBank(vietcom);
    }
    public static Bank getBank(Bank bank){
        System.out.println(bank.getBankName());
       return bank;
    }
}
