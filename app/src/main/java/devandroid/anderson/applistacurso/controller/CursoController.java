package devandroid.anderson.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.anderson.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));// Java
        listCursos.add(new Curso("HTML"));// HTML
        listCursos.add(new Curso("C#"));// C#
        listCursos.add(new Curso("Python"));// Python
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("React Native"));

        return listCursos;
    }

    //Criar Spinner rápidamente
    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaCursos().size(); i++) {

            Curso objeto = (Curso) getListaCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());

        }

        return dados;
    }

}
