package co.edu.uniquindio.poo.hospital.Model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hospital Hospital = new Hospital("San Juan de Dios");

        HistorialMedico hm = new HistorialMedico("H1");


        Paciente paciente1 = new Paciente("santiago","gonzalez","1234132",25,"12352","la soledad",new HistorialMedico("12"));
        Paciente paciente2 = new Paciente("Sofia","Santa","1092",20,"2313","Armenia",new HistorialMedico("209"));
        Paciente paciente3 = new Paciente("felipe","andrey","3543",19,"44443","la julia",new HistorialMedico("2929"));

        Doctor doctor1 = new Doctor("hdhujsd", "lucas", "rios", 47,"300308889", Especialidad.NEUMOLOGIA);
        Doctor doctor2 = new Doctor("15997", "Fernando","Gomez",58,"3123112445",Especialidad.NEUMOLOGIA);
        Doctor doctor3 = new Doctor("4521","Alba","Gonzalez",35,"3217908980",Especialidad.PEDIATRIA);

        Medicamento medicamento3 = new Medicamento("M3","Ibuprofeno",4);
        Medicamento medicamento2 = new Medicamento("M2","Acetaminofen",10);
        Medicamento medicamento = new Medicamento("M1","metacarbamol",100);

        /**Consulta consulta1 = new Consulta("Con1", LocalDate.of(2014,4,8),"dhhsdhg", paciente1, doctor1, medicamento);
        Consulta consulta2 = new Consulta("Con2",LocalDate.now(),"Cancer",paciente2,doctor2,medicamento2);
        Consulta consulta3 = new Consulta("Con3",LocalDate.now(),"Cancer",paciente3,doctor3,medicamento3);*/

        CitaMedica cita1 = new CitaMedica("Ci1",LocalDate.now(),10,doctor1,paciente1);
        CitaMedica cita2 = new CitaMedica("CI2",LocalDate.now(),10,doctor2,paciente2 );
        CitaMedica cita3 = new CitaMedica("CI3",LocalDate.of(2025,4,4),14,doctor3,paciente3);





        /**hm.agregarConsulta(consulta1);
        hm2.agregarConsulta(consulta2);
        hm3.agregarConsulta(consulta3);*/

        Hospital.agregarPaciente(paciente1);
        Hospital.agregarPaciente(paciente2);
        Hospital.agregarPaciente(paciente3);

        Hospital.reservarCita(cita1);
        Hospital.reservarCita(cita2);
        Hospital.reservarCita(cita3);

        Hospital.agregarDoctor(doctor1);
        Hospital.agregarDoctor(doctor2);
        Hospital.agregarDoctor(doctor3);

        Hospital.pacienteTieneVocalDoble("5545");
        Hospital.pacienteTieneVocalDoble("1448");
        Hospital.listarPacientesPalindromos();
        Hospital.listarCitasPorFecha(LocalDate.now());

        //hola

        System.out.println("hola");
        System.out.println("hola2");


        System.out.println(hm);
        System.out.println(hm);
    }
}
