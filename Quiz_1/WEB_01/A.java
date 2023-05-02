import java.util.*;
import java.io.*;

class A {
	private void main (String[] str){
	System.println("Hello java");
	}
}
//E	rror # 1
//the main function should be declared public so that the program can access it as when a java program runs
//the compiler starts its execution from the main function so the main function + the class containing the main function should be declared public

//Error#2
//System.println is not a defined symbol in java
//Instead write System.out.println("Desired Message")