package com.example.estudealemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void germany(View view) {
        String[] fAlemao = {"Wer hier kann nicht schwimmen?",
                "Wie funktioniert dieses Gerät?",
                "Wo kann ich hier ein Ticket kaufen?",
                "Was essen Sie gerne?",
                "Wann wirst Du uns besuchen?",
                "Warum bist du so spät gekommen?",
                "Woher kommt diese Firma?",
                "Wohin gehst du mit diesen Schuhen?",
                "Wie lange warst du im Ausland?",
                "Wie viel kostet ein Kilo Banane?",
                "Wie viele Kinder hast du?",
                "Wie oft rauchen Sie?",
                "Wessen Auto ist dieses hier?",
                "Ich habe den Computer formatiert",
                "Er hat die Wohnung am Sonntag geputzt.",
                "Habt ihr den Salat gegessen?",
                "Der Professor ist mit dem Fahrrad zur Uni gekommen.",
                "Der Sohn ist sehr spät nach Hause gegangen. ",
                "Ich bin am Wochenende zu einer kleinen Stadt gefahren.",
                "Das Flugzeug ist über den Alpen geflogen.",
        };

        String[] fPortugues = {
                "Quem aqui não sabe nadar?",
                "Como funciona esse aparelho?",
                "Onde eu posso comprar um ticket aqui?",
                "O que o senhor gosta de comer?",
                "Quando você vai nos visitar?",
                "Por que você chegou tão tarde?",
                "De onde vem essa firma?",
                "Para onde você vai com este calçado?",
                "Quanto tempo você estava no exterior?",
                "Quanto custa um quilo de banana?",
                "Quantos filhos você tem?",
                "Com que frequência você fuma?",
                "De quem é esse carro aqui?",
                "Eu formatei meu computador.",
                "Ele limpou o apartamento no domingo.",
                "Vocês comeram a salada?",
                "O professor veio de bicicleta para Universidade.",
                "O filho foi muito tarde para casa.",
                "Eu fui no fim de semana para uma cidade pequena.",
                "O avião voou por cima dos Alpes.",
        };

        int n = new Random().nextInt(fAlemao.length);

        TextView janela1;
        janela1 = findViewById(R.id.janela1);
        janela1.setText(fAlemao[n]);

        TextView janela3;
        janela3 = findViewById(R.id.janela3);
        janela3.setText(fPortugues[n]);

    }
}