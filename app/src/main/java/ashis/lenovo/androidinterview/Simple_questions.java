package ashis.lenovo.androidinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Simple_questions extends AppCompatActivity implements View.OnClickListener{
    TextView tvquestion,tvanswer,tvtotallength_yy,tvpresentindex_xx;

    Button bleft,bshow,bright;

    String[] simple_question,simple_answer;

    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        index=0;
        //initialization of textview
        tvquestion=(TextView)findViewById(R.id.tvquestions);
        tvanswer=(TextView)findViewById(R.id.tvanswer);
        tvpresentindex_xx=(TextView)findViewById(R.id.tvxx);
        tvtotallength_yy=(TextView)findViewById(R.id.tvyy);

        //importing the string array from values folder
        simple_question=getResources().getStringArray(R.array.simple_ques);
        simple_answer=getResources().getStringArray(R.array.simple_ans);

        //initialization of button
        bleft=(Button)findViewById(R.id.bleft);
        bshow=(Button)findViewById(R.id.bshowanswer);
        bright=(Button)findViewById(R.id.bright);

        //on click listener
        bleft.setOnClickListener(this);
        bshow.setOnClickListener(this);
        bright.setOnClickListener(this);

        //setting values to variable and a textview
        index=0;
        tvquestion.setText(simple_question[index]);
        tvanswer.setText("Press \"A\" Button for the Answer");
        tvpresentindex_xx.setText(String.valueOf(index+1));//number of questions
        tvtotallength_yy.setText(String.valueOf("/"+simple_question.length));//length of simple question array
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bleft:
                tvanswer.setText("Press \"A\" Button for the Answer");
                index--;
                if(index==-1) {
                    index = simple_question.length - 1;
                    tvquestion.setText(simple_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index + 1));
                }
                else{
                    tvquestion.setText(simple_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index + 1));
                }

                break;
            case R.id.bshowanswer:
                tvanswer.setText(simple_answer[index]);

                break;
            case R.id.bright:
                tvanswer.setText("Press \"A\" Button for the Answer");
                index++;
                if(index==simple_question.length){
                    index=0;
                    tvquestion.setText(simple_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index+1));
                }
                else {
                    tvquestion.setText(simple_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index + 1));

                    break;
                }
        }

    }
}
