package com.example.seb.tp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //on a la vue qu'on associe



       //on crée les objets en les castant
        Button Start = (Button)findViewById(R.id.button);






        Start.setOnClickListener(new View.OnClickListener() { //ce qu'il se passe quand on clique sur le boutton en question

                                         @Override
                                         public void onClick(View view){




                                             goToNextActivity(); //on appelle la méthode qui opermet de se rendre à une autre activté

                                         }




                                     }











        );






    }


    private void goToNextActivity(){ //on définit la méthode qu'on utilise + haut

        Intent MonIntent = new Intent(MainActivity.this,SecondActivity.class); //on déclaire notre intent



        //ici on met les intent donnés par le edit text,pour récupérer les valeurs de la page et les stocker avant de passer à la suite.
        startActivity(MonIntent);  //on déclare le start activity


    }







    }

