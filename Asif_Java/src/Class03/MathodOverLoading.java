/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class03;

/**
 *
 * @author USER-GT
 */
public class MathodOverLoading {
    public static void main(String[] args) {
       
		System.out.println(sum(5,5));
		System.out.println(sum(5.5,5.5));
		System.out.println(sum(5,5,6));
		System.out.println(sum(5.5,5.5,7.5));

	}
	
	//method overloading 
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static double sum(double a,double b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static double sum(double a,double b,double c) {
		return a+b+c;
	}
	
	public static int sub(int a,int b) {
		return a-b;
	}
	
	public static double sub(double a,double b) {
		return a-b;
	}
	
	public static int sub(int a,int b, int c) {
		return a-b-c;
	}
	
	public static double sub(double a,double b, double c) {
		return a-b-c;
	}
	
	
	
	
    }
