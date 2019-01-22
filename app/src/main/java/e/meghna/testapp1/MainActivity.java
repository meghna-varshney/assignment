package e.meghna.testapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etText;
    Button  btnLogin;
    TextView  textread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText=findViewById(R.id.et_name);
        btnLogin=findViewById(R.id.btn_log_in);
        textread=findViewById(R.id.textView);
        textread.setVisibility(View.INVISIBLE);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = etText.getText().toString().trim();
                StringBuffer sb=new StringBuffer();
                for(int i=0;i< a.length();i++){
                    char c=a.charAt(i);
                    if(i%2==0){
                        if(c==122)
                            c=(char) (c-25);
                        else{
                            c=(char) (c+1);}
                        sb.append(c);}
                    else
                        sb.append(c);}
                textread.setVisibility(View.VISIBLE);
                textread.setText(sb.toString());


            }
        });
    }
}
