package com.rays.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example3 implements Serializable {

	public void display() {

		System.out.println("Object using Deserlization");
	}

	public static void main(String [] args) {
		
		try {
			
			 // Serialize the object
            Example3 original = new Example3();
            FileOutputStream fos = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();
            
            FileInputStream fis = new FileInputStream("example.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Example3 deserialized = (Example3) ois.readObject();
            ois.close();

             deserialized.display();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
