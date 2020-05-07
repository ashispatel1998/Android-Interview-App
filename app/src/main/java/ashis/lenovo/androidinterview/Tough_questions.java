package ashis.lenovo.androidinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tough_questions extends AppCompatActivity implements View.OnClickListener{
    TextView tvquestions,tvanswer,tvtotallength_yy,tvpresentindex_xx;

    Button bleft,bshow,bright;

    String[] tough_question,tough_answer;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        index=0;

        tvquestions=(TextView)findViewById(R.id.tvquestions);
        tvanswer=(TextView)findViewById(R.id.tvanswer);
        tvpresentindex_xx=(TextView)findViewById(R.id.tvxx);
        tvtotallength_yy=(TextView)findViewById(R.id.tvyy);


        tough_question=getResources().getStringArray(R.array.difficult_ques);
        tough_answer=getResources().getStringArray(R.array.diffcult_ans);

        bleft=(Button)findViewById(R.id.bleft);
        bshow=(Button)findViewById(R.id.bshowanswer);
        bright=(Button)findViewById(R.id.bright);

        bleft.setOnClickListener(this);
        bshow.setOnClickListener(this);
        bright.setOnClickListener(this);

        index=0;
        tvquestions.setText(tough_question[index]);
        tvanswer.setText("Press \"A\" Button for the Answer");
        tvpresentindex_xx.setText(String.valueOf(index+1));
        tvtotallength_yy.setText("/"+String.valueOf(tough_question.length));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bleft:
                tvanswer.setText("Press \"A\" Button for the Answer");
            index--;
            if(index==-1){
                index=tough_question.length-1;

                tvanswer.setText(tough_answer[index]);
                tvpresentindex_xx.setText(String.valueOf(index + 1));
            }
            else{
                tvanswer.setText(tough_answer[index]);

                tvpresentindex_xx.setText(String.valueOf(index + 1));
            }
                break;
            case R.id.bshowanswer:
                tvanswer.setText(tough_answer[index]);

                break;
            case R.id.bright:
                tvanswer.setText("Press \"A\" Button for the Answer");
                index++;
                if(index==tough_question.length){
                    index=0;
                    tvquestions.setText(tough_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index+1));
                }
                else {
                    tvquestions.setText(tough_question[index]);

                    tvpresentindex_xx.setText(String.valueOf(index + 1));

                    break;
                }
                break;
        }
    }
}
