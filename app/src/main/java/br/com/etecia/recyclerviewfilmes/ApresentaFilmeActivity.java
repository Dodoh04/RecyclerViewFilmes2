package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaFilmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        TextView mTitulo, mCategoria, mDescricao;

        ImageView mImagem;

        Button btnVoltar;

        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricao);
        mImagem = findViewById(R.id.mImagemFilme);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        Intent intent = getIntent();

        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");

        imagemFilme = intent.getExtras().getInt("imagemFime");

        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagem.setImageResource(imagemFilme);

    }
}