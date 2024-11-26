package test;

public class Grupo {
    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo;
    public String horario;
    
    
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes=estudiantes;
        this.profesor=profesor;
        this.asignatura=asignatura;
        this.codigo=codigo;
        this.horario=horario;
    }
    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
    }
    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes=estudiantes;
        this.profesor=profesor;
        this.asignatura=asignatura;
    }
    
    
    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int x=0; x<estudiantes.length; x++) {
            if (estudiantes[x].getCedula()==estudianteViejo.getCedula()) {
                estudiantes[x]=estudianteNuevo;
                break;
            }
        }
    }
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
    
    
}