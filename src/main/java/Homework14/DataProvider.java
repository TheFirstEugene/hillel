package Homework14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DataProvider {
    DataMapper dataMapper;

    public ArrayList<Person>  provide(){
     ArrayList<Person>  person = new ArrayList<>();
     try(FileReader fileReader = new FileReader("D:/TestFilesForIdea/example_1.txt");
     BufferedReader reader = new BufferedReader(fileReader)){
         String string;

         while ((string = reader.readLine()) != null){
             person.add(dataMapper.map(string));
         }
     }catch (IOException e){
         e.printStackTrace();
     }
     return person;

    }
}