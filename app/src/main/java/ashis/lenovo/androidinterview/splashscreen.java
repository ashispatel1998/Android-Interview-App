package ashis.lenovo.androidinterview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    private ImageView logo;
    private ProgressBar pbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        logo=(ImageView) findViewById(R.id.logo);
        pbar=(ProgressBar) findViewById(R.id.pbar);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.trans);

        logo.startAnimation(myanim);
        pbar.startAnimation(myanim);
        final Intent i=new Intent(splashscreen.this,FrontPage.class);
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        thread.start();
    }
}
