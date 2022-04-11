package Persona;

public class Persona {
    private String Nombre;
    private int Edad;
    private long ID;
    private String Sexo ;
    private double Peso;
    private double Altura;
    private String DNI;


    public Persona ( String Nombre, int Edad, long ID, String Sexo, double Peso, double Altura){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.ID=ID;
        this.Sexo=Sexo;
        this.Peso=Peso;
        this.Altura=Altura;

    }

      public Persona() {

    }

    public Persona(String nombre, int edad, String sexo) {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
    }

    public String CalcularIMC(){
        double b=(getPeso() / Math.pow(getAltura(),2));
        if (b < 20){
            return "-1 Tiene bajo peso";
        }
        else if (b >= 20 && (getPeso() / b <= 25)){
            return " 0 Esta en su peso ideal";
        }
        {
            return "1 Tiene sobrepeso";
        }
    }
    public boolean MayorDeEdad(){
        if (getEdad()>=18)  {
            return true;
        }
        {
            return false;
        }
    }

    public String MuestraMayorEdad(){
        if (MayorDeEdad()==true){
            return "La personas es mayor de edad";
        }
         return "La Persona es menor de edad";
    }

    private char ComprobarSexo(){
        char H=0;
        if (getSexo()!="H" &&  getSexo() != "M"){
        }
        return H;
    }

    private void generarDNI(){
        final int div=23;
        int numeroID= ((int)Math.floor(Math.random()*(100000000-10000000)+10000000));
        double result= (numeroID -(numeroID/Math.pow(div,2)));
        char letra= generarLetra((int) result);
        DNI= Integer.toString((int) result) + letra;

    }
    private char generarLetra(int result){
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'

        };
        return letras[result];
    }



    //setter
    public void setNombre(String Nombre){        this.Nombre=Nombre;    }
    public void setEdad( int Edad){ this.Edad=Edad;   }
    public  void setSexo(String Sexo){this.Sexo=Sexo;}
    public void setPeso(double Peso){this.Peso=Peso;}
    public void setAltura(double Altura){this.Altura=Altura;}

    //Getter
    public String getNombre1(){return Nombre;}
    public int getEdad(){return Edad;}
    public String getSexo(){return Sexo;}
    public double getPeso(){return Peso;}
    public double getAltura(){return Altura;}

    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", ID='" + ID + '\'' +
                ", Edad=" + Edad +
                ", Sexo=" + Sexo +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                '}';
    }



    }

