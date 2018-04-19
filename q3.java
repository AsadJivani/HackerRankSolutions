/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class q3 {

//    static String arithmeticExpressions(int[] numbers) {
//
//        String ans = "";
//        long value = 0;
//
//        boolean plus=true;
//        boolean minus=false;
//        char operator;
//     while(ans.equals("")){   
//         
//        value = numbers[0];
//        ans = String.valueOf(numbers[0]);
//        for (int j = 0; j < numbers.length - 1; j++) {
//            
//            if (plus) {
//                value = (long) value + numbers[j + 1];
//                operator='+';
//                plus=false;
//                minus=true;
//            } else if (minus) {
//                value = (long) value - numbers[j + 1];
//                operator='-';
//                minus=false;
//            } else  {
//                value = (long) value * numbers[j + 1];
//                operator='*';
//                plus=true;
//            }
//
//            ans +=""+operator + numbers[j + 1];
//            
//            
//            
//
//            if(value%101==0){
//                for (int i = j+1; i < numbers.length - 1; i++) {
//                     ans += "" + '*' + numbers[i + 1];
//                }
//              return ans;
//            }
//            
//        }
//            ans="";
//            if(plus)
//                plus=false;
//           
//            
//
//        
//     }
//        return ans;
//    }
//
//    static boolean found = false;
//    static String ans = "";
//
//    static String printAll(char[] c, int[] n, String start) {
//
//        if (!ans.equals("")) {
//            found = true;
//
//        } else {if (start.length() == n.length - 1) {
//
////            ans = arithmeticExpressions(n, start.toCharArray());
//
//        } else {
//            for (int i = 0; i < c.length; i++) {
//                if (found) {
//                    break;
//                } else {
//                    printAll(c, n, start + c[i]);
//                }
//
//            }
//        }
//       }
//        return ans;
//    }

    public static void main(String[] args) {

        char[] operations = {'-', '+','*'};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        String result = solution(arr,arr.length,1,arr[0],String.valueOf(arr[0]));
        System.out.println(result);
        in.close();

    }
 static String trying;   
    static String solution(int[] numbers,int n,int index,long value,String answer){
    
       
        //System.out.println(answer);
           if(value%101==0)
              {
                for (int i = index; i < n; i++) {
                     answer += "" + '*' + numbers[i];
                }
              return answer;
    
              }
           if(index==n)
               return "";
           
          trying=solution(numbers,n ,index+1, value+numbers[index], answer+"+"+numbers[index]);
          if(!trying.equals(""))
              return trying;
          trying=solution(numbers,n ,index+1, value-numbers[index], answer+"-"+numbers[index]);
          if(!trying.equals(""))
              return trying;
               trying=solution(numbers, n,index+1, value*numbers[index], answer+"*"+numbers[index]);
          if(!trying.equals(""))
              return trying;
    
    
        
        
        return "";
        
        
    }
    
    
    
    }


