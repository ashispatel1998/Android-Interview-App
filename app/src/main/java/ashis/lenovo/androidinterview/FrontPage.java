package ashis.lenovo.androidinterview;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity implements View.OnClickListener {
    Button bsimple,btough,bsee,brate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        bsimple=(Button)findViewById(R.id.bsq);
        btough=(Button)findViewById(R.id.btq);
        bsee=(Button)findViewById(R.id.bseeotherapps);
        brate=(Button)findViewById(R.id.brateapp);

        bsimple.setOnClickListener(this);
        btough.setOnClickListener(this);
        bsee.setOnClickListener(this);
        brate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bsq:
                Intent i=new Intent(FrontPage.this,Simple_questions.class);
                startActivity(i);
                break;
            case R.id.btq:
                Intent j=new Intent(FrontPage.this,Tough_questions.class);
                startActivity(j);
                break;
            case R.id.bseeotherapps:
                Intent k=new Intent(FrontPage.this,seeothersapp.class);
                startActivity(k);
                break;
            case R.id.brateapp:
                Intent l=new Intent(FrontPage.this,seeothersapp.class);
                startActivity(l);
                break;

        }
    }
}
