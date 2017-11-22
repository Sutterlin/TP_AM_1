package com.example.seb.tp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        //rien de nouveau sur cette page

        Button F1 = (Button)findViewById(R.id.button5);



        F1.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View view){




                                         goToNextActivity();

                                     }




                                 }











        );






    }


    private void goToNextActivity(){

        Intent MonIntent = new Intent(FourthActivity.this,FifthActivity.class);



        //ici on met les intent donnés par le edit text,pour récupérer les valeurs de la page et les stocker avant de passer à la suite.
        startActivity(MonIntent);


    }







}

