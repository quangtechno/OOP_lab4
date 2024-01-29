
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question1 {
    HashMap<String, String> dictionary=new HashMap<>();
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String word=reader.next();
       
       question1 q1= new question1();
       q1.dictionary.put("today", "hom nay");
       System.out.println("the meaning of "+word+" is :" +q1.findMeaning(word));
        
    }
    public boolean checkExist(String line){
        if(dictionary.containsKey(line)){
            return true;
        }
        return false;
    }
    public String findMeaning(String line){
        if(checkExist(line)){
            return dictionary.get(line);
        }else{
            return "the word is not contained";
        }
    }
}
