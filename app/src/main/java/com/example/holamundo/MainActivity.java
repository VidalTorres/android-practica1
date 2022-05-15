package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar, btnCerrar, btnLimpiar;
    private EditText txtNombre;
    private TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludo);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        txtNombre = (EditText) findViewById(R.id.txtSaludo2);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Favor de Ingresar un Nombre",Toast.LENGTH_SHORT).show();

                }else {
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola "+ txtSaludar +" Como estas? :D");
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblSaludo.setText("");
                txtNombre.setText("");
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}