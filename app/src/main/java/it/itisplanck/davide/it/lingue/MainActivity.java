package it.itisplanck.davide.it.lingue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.editText2);
    }
    public void registrazione(View v){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle(getString(R.string.DialogTitle)+e.getText().toString()+"!");
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
