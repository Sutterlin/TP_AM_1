package com.example.seb.tp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //on crée les objets
        Button Valider = (Button)findViewById(R.id.button2);






        Valider.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View view){




                                         goToNextActivity();

                                     }




                                 }











        );






    }


    private void goToNextActivity(){


        EditText Nom = (EditText) findViewById(R.id.Nom); //on déclare des instances de tous les text edits utilisés.
        EditText Prenom = (EditText) findViewById(R.id.Prenom);
        EditText Date = (EditText) findViewById(R.id.date);
        EditText Postal = (EditText) findViewById(R.id.postal);
        EditText Adresse = (EditText) findViewById(R.id.email);
        EditText Commentaire = (EditText) findViewById(R.id.commentaires);



        Intent MonIntent = new Intent(SecondActivity.this,ThirdActivity.class); //on crée notre intent et on récupère les données de chaque champ dans des clefs
        MonIntent.putExtra("EXTRA_NOM", Nom.getText().toString());
        MonIntent.putExtra("EXTRA_PRENOM", Prenom.getText().toString());
        MonIntent.putExtra("EXTRA_DATE", Date.getText().toString());
        MonIntent.putExtra("EXTRA_POSTAL", Postal.getText().toString());
        MonIntent.putExtra("EXTRA_ADRESSE", Adresse.getText().toString());
        MonIntent.putExtra("EXTRA_COMMENTAIRE", Commentaire.getText().toString());



        //ici on met les intent donnés par le edit text,pour récupérer les valeurs de la page et les stocker avant de passer à la suite.
        startActivity(MonIntent);


    }







}

