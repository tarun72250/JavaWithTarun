package day_18_multithreadingAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_05_FileCopyThreadDemo {

    public static void main(String[] args) throws IOException 
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

<<<<<<< HEAD
        try  
        { 
=======
        try 
        {
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
//            System.out.print("D:\\Java IO DebugShala\\MultiThreading Demos\\a.txt");
//            String sourceFile = consoleReader.readLine();
//            System.out.print("D:\\\\Java IO DebugShala\\\\MultiThreading Demos\\\\b.txt");
//            String destinationFile = consoleReader.readLine();

        	String sourceFile ="D:\\Java IO DebugShala\\MultiThreading Demos\\a.txt";
        	String destinationFile ="D:\\\\Java IO DebugShala\\\\MultiThreading Demos\\\\b.txt";

            Thread fileCopyThread = new Thread(new B_05_FileCopyThread(sourceFile, destinationFile));
            
            fileCopyThread.start();
            fileCopyThread.join();
        } 
        catch (InterruptedException e) 
        {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
