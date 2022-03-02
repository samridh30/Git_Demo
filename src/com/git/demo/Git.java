package com.git.demo;

public class Git {
	 public static void main(String[] args) {

		    int num = 40, i = 2;
		    boolean flag = false;
		    while (i <= num / 2) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		    //the change has been done here.
		  }
		}



