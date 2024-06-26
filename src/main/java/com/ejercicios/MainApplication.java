package com.ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class MainApplication {

    public static void main( String[] args ){
	
    //PRIMERA PARTE DEL EJERCICIO
    //1. Para introducir los datos a la aplicación, primero creo tres maps con la información de los pacientes,  
    //las especialidades y los horarios, empleando como key el número de ID de cada paciente. 

    Map<Integer, String> pacientes = new HashMap<>();
    

    pacientes.put(12345, "Juan Perez");
    pacientes.put(23451, "Ana Lisa Sosa");
    pacientes.put(34512, "Debora Lopez");
    pacientes.put(45123, "Carlos Marquez");
    pacientes.put(54321, "Marcelo Diaz");
    pacientes.put(21345, "Carmen Salcedo");
    pacientes.put(32145, "Juan Carrillo");
    pacientes.put(43125, "Elvio Garcia");
    pacientes.put(31245, "Rocio Gomez");
    pacientes.put(52341, "Gonzalo Paez");


    Map<Integer, String> especialidad = new HashMap<>();

    especialidad.put(12345, "Oftalmologia");
    especialidad.put(23451, "Cardiologia");
    especialidad.put(34512, "Clinica medica");
    especialidad.put(45123, "Cardiologia");
    especialidad.put(54321, "Neurologia");
    especialidad.put(21345, "Oftalmologia");
    especialidad.put(32145, "Neurologia");
    especialidad.put(43125, "Cardiologia");
    especialidad.put(31245, "Clinica medica");
    especialidad.put(52341, "Neurologia");


    Map<Integer, Integer> horarios = new HashMap<>(); 

    horarios.put(12345, 1200);
    horarios.put(23451, 1200);
    horarios.put(34512, 1230);
    horarios.put(45123, 1130);
    horarios.put(54321, 1000);
    horarios.put(21345, 1100);
    horarios.put(32145, 1200);
    horarios.put(43125, 1300);
    horarios.put(31245, 1200);
    horarios.put(52341, 1100);

    //2. Seguidamente, creo un nuevo map, que agrupe a los pacientes por especialidad. Este nuevo map tendrá
    //como key el nombre de la especialidad (String) y como valeu un ArrayList, que agrupará la lista de pacientes
    //de una misma especialidad. 

    Map<String, ArrayList<Integer>> pacientes_especialidad = new HashMap<>();

    //Seguidamente, iteramos sobre cada entrada del mapa especialidad. Primero intento obtener la lista de 
    //pacientes asociada a determinada especialidad. Si no existe una lista para esa especialidad, 
    //se crea una nueva lista y se agrega el ID del paciente actual. Si ya existe una lista para esa 
    //especialidad, se agrega el ID del paciente actual a la lista existente. La lista actualizada de 
    //pacientes se vuelve a colocar en el mapa 'pacientes_especialidad', con la especialidad v como clave.


    especialidad.forEach((k, v) -> {
        if(pacientes_especialidad.get(v) == null){ 
            ArrayList<Integer> lista_pacientes = new ArrayList<Integer>(){{add(k);}};

            pacientes_especialidad.put(v, lista_pacientes);

         }else { 
            ArrayList<Integer> lista_pacientes = pacientes_especialidad.get(v);
            lista_pacientes.add(k);

            pacientes_especialidad.replace(v, lista_pacientes);


    } 

    System.out.println(pacientes_especialidad.toString());

    //SEGUNDA PARTE DEL EJERCICIO. Consultorios y especialistas 
    //1. Para la segunda parte del ejecicio, creo dos maps adicionales con la información nueva de los consultorios
    //y los especialistas. Para ambos maps se emplea como key el nombre de la especialidad (String). 

    Map<String, String> consultorios = new HashMap<>();

    consultorios.put("Neurologia", "Consultorio 5");
    consultorios.put("Cardiologia", "Consultorio 7");
    consultorios.put("Oftalmologia", "Consultorio 1");
    consultorios.put("Clinica medica", "Consultorio 4");

    Map<String, String> especialistas = new HashMap<>();

    especialistas.put("Neurologia", "Dra. Sabrina Lopez");
    especialistas.put("Cardiologia", "Dra. Juliana Garcia");
    especialistas.put("Oftalmologia", "Dr. Roberto Perez");
    especialistas.put("Clinica medica", "Dra. Monica Guzman");

    //Luego, iteramos sobre cada entrada del mapa pacientes_especialidad, tomando cada key y value, 
    //para imprimer el nombre de la especialidad (key), sumarlo al consultorio y al nombre del especialista.
    //Luego le pedimos que imprima todos los valores de la lista. 
    
    pacientes_especialidad.forEach((key, value) -> {
        System.out.println(key + " - " + consultorios.get(key) + " - " + especialistas.get(key) + ":");

        for(int i= 0; i<value.size(); i++){

            System.out.println(pacientes.get(value.get(i))) ;
        }

        //TERCERA PARTE DEL EJERCICIO 
        //Se itera en la lista pacientes_especialidad, para imprimir por todos los registros disponibles
        //para imprimir el tamaño de la lista de cada especialidad 
    
        pacientes_especialidad.forEach((clave, valor) -> {
            System.out.println(clave + ": " + valor.size() + " pacientes.");
        });

    
    

    });


    }
    
    );



    }

  
    }


    

   

