package com.example.seb.tp_1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button Sports = (Button)findViewById(R.id.button3);
        Button Accueil = (Button)findViewById(R.id.button4);





 //ici, on récupère les données de l'intent qui nous a envoyé ici (depuis la deuxième activité), et on met ces données dans deux variables: donnees, qui contient tout, et np, qui contient le nom et le prénom qui s'affiche en bas.
        TextView affichage = (TextView) findViewById(R.id.affichage);
        TextView NP = (TextView) findViewById(R.id.NP);
        Intent intent = getIntent();
        String donnees=intent.getStringExtra("EXTRA_NOM")+ "\n" +intent.getStringExtra("EXTRA_PRENOM")+"\n"+intent.getStringExtra("EXTRA_DATE")+"\n"+intent.getStringExtra("EXTRA_POSTAL")+"\n"+intent.getStringExtra("EXTRA_ADRESSE")+"\n"+"\n"+intent.getStringExtra("EXTRA_COMMENTAIRE");
        String np=intent.getStringExtra("EXTRA_NOM")+ intent.getStringExtra("EXTRA_PRENOM");
        affichage.setText(donnees);
        NP.setText(np);
        NP.setTextColor(Color.RED); //on change la couleur de l'écriture pour du rouge
        NP.setTypeface(null, Typeface.ITALIC); //on change le "type" d'écriture pour de l'italique.


//on a deux boutons différents, de fait, on a deux méthodes différents. Il serait surement plus approprié de réécrire ses fonctions en donnant les activités en argument.



        Sports.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View view){




                                         goToNextActivity1();

                                     }




                                 }











        );








        Accueil.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View view){




                                          goToNextActivity2();

                                      }




                                  }











        );





    }


    private void goToNextActivity1(){

        Intent MonIntent = new Intent(ThirdActivity.this,FourthActivity.class);



        //ici on met les intent donnés par le edit text,pour récupérer les valeurs de la page et les stocker avant de passer à la suite.
        startActivity(MonIntent);


    }



    private void goToNextActivity2(){

        Intent MonIntent = new Intent(ThirdActivity.this,MainActivity.class);



        //ici on met les intent donnés par le edit text,pour récupérer les valeurs de la page et les stocker avant de passer à la suite.
        startActivity(MonIntent);


    }








}
