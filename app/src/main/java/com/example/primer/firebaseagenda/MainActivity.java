package com.example.primer.firebaseagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref_contacto = database.getReference("contactos").push();


        Button mButton = (Button) findViewById(R.id.btn_grabar);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText mEdit = (EditText) findViewById(R.id.txt_nombre);
                EditText mEdit2 = (EditText) findViewById(R.id.txt_mail);
                String nombre = mEdit.getText().toString();
                String mail = mEdit2.getText().toString();
                Contacto c = new Contacto(nombre,mail);
                ref_contacto.setValue(c);
            }
        });



    }

}