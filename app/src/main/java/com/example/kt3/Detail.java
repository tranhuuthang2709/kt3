package com.example.kt3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {
    int thuchien;
    CardView btnLuu;
    EditText vidu,kqua;
    TextView txt_lichsu;
    String lichsu="";
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnLuu=(CardView)findViewById(R.id.btnluu);
        vidu=(EditText)findViewById(R.id.vidu);
        kqua=(EditText)findViewById(R.id.ketqua);
        txt_lichsu=(TextView)findViewById(R.id.txt_lichsu);
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Detail.this,MainActivity.class);
                startActivity(intent);
            }
        });
        SharedPreferences mypref = getSharedPreferences("mysave",MODE_PRIVATE);
        lichsu = mypref.getString("ls","");
        txt_lichsu.setText(lichsu);


        thuchien=getIntent().getCharExtra("thuchien", (char)10);
        if (thuchien!=5){
            btnLuu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (vidu.getText().toString().isEmpty() ){
                        Toast.makeText(Detail.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    }else{
                        String s1=vidu.getText().toString();
                        switch (thuchien){
                            case 0:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            case 1:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            case 2:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            case 3:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            case 4:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            case 5:
                                kqua.setText("Kết quả : "+s1);
                                lichsu +=(""+s1);
                                txt_lichsu.setText(lichsu);
                                lichsu+="\n";
                                break;
                            default: break;

                        }
                    }
                }
            });


        }


    }

    protected void onPause(){
        super.onPause();
        SharedPreferences mypref = getSharedPreferences("mysave",MODE_PRIVATE);
        SharedPreferences.Editor myedit =mypref.edit();
        myedit.putString("ls",lichsu);
        myedit.commit();
    }
}