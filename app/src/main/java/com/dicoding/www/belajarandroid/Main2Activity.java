package com.dicoding.www.belajarandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private final String TAG = Main2Activity.class.getSimpleName();
    private EditText ethandphone;
    private EditText etpassword;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ethandphone=findViewById(R.id.et_handphone);
        etpassword=findViewById(R.id.et_password);
        btnlogin=findViewById(R.id.btn_login);

        /*btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*String handphone = ethandphone.getText().toString();
                String password = etpassword.getText().toString();
                if(handphone.isEmpty()){
                    ethandphone.setError("nomor handphone tidak boleh kosong");
                    ethandphone.requestFocus();
                    return;
                }
                if(password.isEmpty()){
                    etpassword.setError("nomor handphone tidak boleh kosong");
                    etpassword.requestFocus();
                    return;
                }
                Log.d(TAG,"handphone: "+handphone);
                Log.d(TAG,"password: "+etpassword.getText().toString());
                Intent intent = new Intent(Main2Activity.this,LoginActivity.class);
                startActivity(intent);*//*

                Log.d(TAG, "onClick: dari setOnclickkistener ");
            }
        });*/
    }


    public void registerClick(View view) {
        Intent intent = new Intent(Main2Activity.this,HomeActivity.class);
        startActivity(intent);
    }

    public void log(View view) {
        Log.d(TAG, "log: dari fungsi log");
/*        Intent intent = new Intent(Main2Activity.this,LoginActivity.class);
        startActivity(intent);*/
    }
}
