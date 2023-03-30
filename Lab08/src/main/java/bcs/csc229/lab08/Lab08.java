/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bcs.csc229.lab08;

/**
 *
 * @author harve
 * 
 * Write a program that uses a SinglyLinkedList that gets populated by prime numbers from 0 to n. 
 * Then move the prime numbers that has the digit '3' into another linked list. 
 * After that find the sum of numbers in the second list. (n should be less than 1,000,000). 
 * For example, the sum of the prime numbers (with 3 digit) between 0 and n=100 is (3+ 13+ 23+ 31+ 37+ 43+ 53+73+83 )= 359.

 */
public class Lab08 {

    public static void main(String[] args) {
        LinkedList list01 = new LinkedList();
        LinkedList list02 = new LinkedList();
        
        primesToList(100, list01);  //appends prime numbers from 0 to n to list1
        System.out.println(list01);
        
        primeswithThreeToList(100, list02); //appends prime numbers from 0 to n with '3' to list2
        System.out.println(list02);
        System.out.println(list02.getSum());
        
    }
    
    public static boolean isPrime(int num){
        //checks if prime
        if(num <= 1){
            return false;
        }
        else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){               //n has another factor if remainder is 0
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void primesToList(int n, LinkedList list){
        //add all primes from 0 to n to the linkedlist
        for(int i = 0; i < n; i++){
            if(isPrime(i)){                     //checks if prime
                Node newNode = new Node(i);     //if Prime, creates newNode with i and append
                list.append(newNode);           
            }
        }
    }
    
    public static boolean containsThree(int n){ 
        //checks if the number contains a three
       while(n > 0){
           if(n % 10 == 3){
               return true;
           }
           n  /= 10;
       }
       return false;
    }
    
    public static void primeswithThreeToList(int n, LinkedList list){
        //add all primes that contain '3' to the linkedlist
        for(int i = 0; i < n; i++){
            if(isPrime(i) && containsThree(i)){
                Node newNode = new Node(i);
                list.append(newNode);
            }
        }
    }
    
    public static int getSum(LinkedList list){
        //find the sum of all nodes in linkedlist
        return -1;
    }
}
