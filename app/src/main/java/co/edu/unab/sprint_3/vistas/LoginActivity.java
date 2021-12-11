package co.edu.unab.sprint_3.vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.edu.unab.sprint_3.MainActivity;
import co.edu.unab.sprint_3.R;

public class LoginActivity extends AppCompatActivity {

    TextView tv_lost_pass, tv_registro;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_lost_pass = findViewById(R.id.tv_lost_pass);
        tv_registro = findViewById(R.id.tv_registro);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        });

        tv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, RegistroActivity.class));
                finish();
            }
        });

        tv_lost_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, LostPassActivity.class));
            }
        });

    }
}