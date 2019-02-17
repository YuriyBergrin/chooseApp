package com.hfad.user.chose;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class ChoseActivity extends Activity implements View.OnClickListener {

    TextView textViewCenter;
    Button btnNext;
    String level;// game level
    int lvl;//индекс уровня
    ArrayList<String> questionList = new ArrayList<>();
    int count = 0;// счетчик нажатий на кнопку Далее

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);

        textViewCenter = (TextView)findViewById(R.id.textViewCenter);
        btnNext = (Button)findViewById(R.id.buttonNext);
        btnNext.setOnClickListener(this);

        Intent intent = getIntent();
        level = intent.getStringExtra("level");
        lvl = Integer.parseInt(level);

        QuestionsData questionsData = new QuestionsData();

//получаем инфу о том, какой уровень выбран и загружаем соответствующий список вопросов
        switch (lvl){

            case 1: questionList.addAll(questionsData.getEasyList()); //заполняем из EasyList
            break;

            case 2: questionList.addAll(questionsData.getNormalList()); //заполняем из NormaList
            break;

            case 3: questionList.addAll(questionsData.getHardList()); //заполняем из HardList
            break;

        }//switch

        Collections.shuffle(questionList);//перемешиваем вопросы
        textViewCenter.setText(questionList.get(0));//выаодим первый вопрос

    }//onCreate
//обработаем нажатие кнопки Далее
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonNext){
            count++;
            if (count<questionList.size()){textViewCenter.setText(questionList.get(count));}
            else {Collections.shuffle(questionList); count = 0; }



        }//if
    }//onClick


    // @Override
   // public void onBackPressed() {
  //      super.onBackPressed();
  //      questionList.clear();
  //  }
}
