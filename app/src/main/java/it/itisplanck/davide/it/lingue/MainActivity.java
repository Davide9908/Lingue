package it.itisplanck.davide.it.lingue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username,password,nome,cognome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.usernameEdit);
        nome=findViewById(R.id.nomeEdit);
        cognome=findViewById(R.id.cognomeEdit);
        password=findViewById(R.id.passwordEdit);

    }
    public void registrazione(View v){
        if(username.getText().toString().equals("") || nome.getText().toString().equals("")
                || cognome.getText().toString().equals("") || password.getText().toString().equals("")){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setTitle(getString(R.string.errorDialog));
            builder1.setIcon(R.drawable.ic_warning_yellow_24dp);
            builder1.setMessage(R.string.errorMessage);
            builder1.setCancelable(true);
            builder1.setNeutralButton(android.R.string.ok,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
        else{
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setTitle(getString(R.string.DialogTitle)+username.getText().toString()+"");
            builder1.setMessage(R.string.DialogMessage);
            builder1.setCancelable(true);
            builder1.setNeutralButton(android.R.string.ok,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
    }
}
