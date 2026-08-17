package org.itsco.prueba.model;

public class Asignatura {
    private String nombre;
    private float nota1;
    private float nota2;
    private float nota3;
    private float suma;
    private String mensaje;

    public Asignatura() {
    }

    public Asignatura(String nombre, float nota1, float nota2, float nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.calcularSumaYMensaje();
    }

    public Asignatura(String nombre, float nota1, float nota2, float nota3, float suma, String mensaje) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.suma = suma;
        this.mensaje = mensaje;
    }

    public void calcularSumaYMensaje() {
        this.suma = this.nota1 + this.nota2 + this.nota3;

        if (this.suma >= 21) {
            this.mensaje = "El estudiante ha sido aprobado";
        } else if (this.suma >= 18) {
            this.mensaje = "Está suspenso, estudia un poquito más";
        } else {
            this.mensaje = "Reprobado, tranquilo hay otra matrícula";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
        calcularSumaYMensaje();
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
        calcularSumaYMensaje();
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
        calcularSumaYMensaje();
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
