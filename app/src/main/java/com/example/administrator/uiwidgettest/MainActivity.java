package com.example.administrator.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "This is test",Toast.LENGTH_SHORT).show();
//            }
//        });

        editText = (EditText) findViewById(R.id.edit_text);
//        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                /*Toast*/
//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText,
//                        Toast.LENGTH_SHORT).show();
/*ImageView*/
//                imageView.setImageResource(R.drawable.img_2);
/*ProgressBar*/
//                if(progressBar.getVisibility() == View.GONE){
//                    progressBar.setVisibility(View.VISIBLE);
//                }else{
//                    progressBar.setVisibility(View.GONE);
//                }
/*ProgressBar*/
//                int progress = progressBar.getProgress();
//                progress = progress + 10;
//                progressBar.setProgress(progress);
/*AlerDialog*/
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("This is Dialog");
//                builder.setMessage("Something important.");
//                builder.setCancelable(false);
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.show();
                /*ProgressDialog*/
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }

    }
}
