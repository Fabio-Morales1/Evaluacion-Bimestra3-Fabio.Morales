package examen4baco;

public class Alumno {
    String Nombre,Grado;
    int Edad, Promedio; 

    public Alumno(String Nombre, String Grado, int Edad, int Promedio) {
        this.Nombre = Nombre;
        this.Grado = Grado;
        this.Edad = Edad;
        this.Promedio = Promedio;
    }
    
    
    public String verNombre() {
        return this.Nombre;
        
    }
    public String verSaludar() {
        return "Hola Te saludo desde El salon de Computo";
    }
    

    

    

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getPromedio() {
        return Promedio;
    }

    public void setPromedio(int Promedio) {
        this.Promedio = Promedio;
    }

}
