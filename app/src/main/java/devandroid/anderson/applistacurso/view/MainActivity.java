package devandroid.anderson.applistacurso.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import devandroid.anderson.applistacurso.R;
import devandroid.anderson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo, dados, valores para o Objeto
        //Conformnee o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Anderson");
        pessoa.setSobreNome("Nunes");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("(11) 99223-3554");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Renata");
        outraPessoa.setSobreNome("Candido");
        outraPessoa.setCursoDesejado("Psicologia");
        outraPessoa.setTelefoneContato("(11) 91234-5678");


        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int parada = 0;

    }
}