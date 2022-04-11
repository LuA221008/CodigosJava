package Persona;

import java.util.Scanner;

public class Persona1 {
    public static void main(String[] args) {


        Scanner  Nombre1 =new Scanner(System.in);
        System.out.println("Digite el Nombre");
        String Nombre = Nombre1.next();
        Scanner Edad1   =new Scanner(System.in);
        System.out.println("Digite la Edad");
        int Edad = Edad1.nextInt();
        Scanner Sexo1   =new Scanner(System.in);
        System.out.println("Digite el Sexo");
        String Sexo = Sexo1.next();
        Scanner Peso1   =new Scanner(System.in);
        System.out.println("Digite el Peso");
        double Peso = Peso1.nextDouble();
        Scanner Altura1   =new Scanner(System.in);
        System.out.println("Digite la Altura");
        double Altura = Altura1.nextDouble();
        Scanner  Nombre2 =new Scanner(System.in);
        System.out.println("Digite el Nombre");
        String Nombre3 = Nombre2.next();
        Scanner Edad2   =new Scanner(System.in);
        System.out.println("Digite la Edad");
        int Edad3 = Edad2.nextInt();
        Scanner Sexo2   =new Scanner(System.in);
        System.out.println("Digite el Sexo");
        String Sexo3 = Sexo2.next();



        Persona Persona1 = new Persona();
        Persona Persona2 = new Persona( Nombre,Edad,Sexo);
        Persona Persona3 = new Persona(Nombre,Edad,Sexo,Peso,Altura);


        //metodo set

        Persona1.setNombre(Nombre);
        Persona1.setEdad(Edad);
        Persona1.setSexo(Sexo);
        Persona1.setPeso(Peso);
        Persona1.setAltura(Altura);

        Persona2.setNombre(Nombre);
        Persona2.setEdad(Edad);
        Persona2.setSexo(Sexo);
        Persona2.setPeso(60);
        Persona2.setAltura(1.75);

        Persona3.setNombre("Johan");
        Persona3.setEdad(15);
        Persona3.setSexo("F");
        Persona3.setPeso(60);
        Persona3.setAltura(1.70);



        System.out.println("Persona1");
        System.out.println(Persona1.MuestraMayorEdad());
        System.out.println(Persona1.CalcularIMC());
        System.out.println(Persona1.toString());


        System.out.println("Persona2");
        System.out.println(Persona2.MuestraMayorEdad());
        System.out.println(Persona2.CalcularIMC());
        System.out.println(Persona2.toString());

        System.out.println("Persona3");
        System.out.println(Persona3.MuestraMayorEdad());
        System.out.println(Persona3.CalcularIMC());
        System.out.println(Persona3.toString());






    }
}
