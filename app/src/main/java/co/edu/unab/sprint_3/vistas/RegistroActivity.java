package co.edu.unab.sprint_3.vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.edu.unab.sprint_3.MainActivity;
import co.edu.unab.sprint_3.R;

public class RegistroActivity extends AppCompatActivity {

    EditText et_nombre, et_correo;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

       btn_registrar = findViewById(R.id.btn_registrar);

       btn_registrar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               startActivity(new Intent(RegistroActivity.this, MainActivity.class));
               finish();
           }
       });



    }
}