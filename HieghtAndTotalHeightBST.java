/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author asadj
 */
public class HieghtAndTotalHeightBST {
  public static class Node {
    
  
    public int data;
    public Node rchild;
    public Node lchild;
    
  
    
}
   public static class Tree{
    private Node root;
  
        public Node getRoot() {
        return root;
    }
       
       
       
       
       public void insert(int data){
    
        Node NewNode=new Node();
        NewNode.data=data;
        
        Node current=root;
        
        while(true){

            Node currentroot=current;
            
            if (root==null) {
                
                root=NewNode;
                break;
            }
            else{
            
                if (current.data>data) {
                    
                    current=current.lchild;
                     
                    if (current==null) {

                        currentroot.lchild=NewNode;
                        break;
                    }
                
                }
                else{
                
                    current=current.rchild;
                     
                    if (current==null) {

                        currentroot.rchild=NewNode;
                        break;
                    }
                             
                }           
            }
        }
        
    
    }
         public Node find(int data){
    
    Node current=root;
    
    while(current.data!=data){
        
        if (current.data>data) {
            
            current=current.lchild;
        }
        else if (current.data<data) {
            current=current.rchild;
        }
        
        if (current==null) {
            
            return null;
        }
    
    }
         return current;
        
        
        
    }
}
      static int maxDepth(Node node) 
    {
        if (node == null)
            return -1;
        else
        {
          
            int lDepth = maxDepth(node.lchild);
            int rDepth = maxDepth(node.rchild);
           
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
    
    
    static int[] heightAndTotalHeight(int[] arr) {
        
        Tree bst=new Tree();
        int sum=0;
        
        for(int i=0; i<arr.length; i++){
            
            bst.insert(arr[i]);
            
        }
        int depth=maxDepth(bst.getRoot());
        for (int i = 0; i < arr.length; i++) {
              sum+=maxDepth(bst.find(arr[i]));     
        }
       
        int[] answers={depth,sum};
        

return answers;
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int[] arr ={500,400,300,450,425,475,600,550};

        

        int[] result = heightAndTotalHeight(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
      
    }  
}
