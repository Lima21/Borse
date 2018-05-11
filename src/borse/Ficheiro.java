/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borse;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Ficheiro implements Serializable{
    private static Repo repo = null;

    private static MyDate data;

    


    public static MyDate getData() {
        return data;
    }

    public static void setData(MyDate data) {
        Ficheiro.data = data;
    }


    
    public static Repo getRepositorio(){
        if (repo == null)
            repo = new Repo();
        return repo;
    }

  
    
    
    
    public static void serializar(String filename) {
        // Serializar um objeto para ficheiro
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(repo);
            out.close();
            fileOut.close();
            System.out.printf(
                    "Serialized data is saved in " + filename);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    public static void desserializar(String filename) {
        //repo = new Repositorio();
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            repo = (Repo) in.readObject();
            in.close();
            fileIn.close();
            System.out.printf(
                    "File " + filename + " read!");
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Repositorio class not found. " + ex.getMessage());
        }
    }
}
