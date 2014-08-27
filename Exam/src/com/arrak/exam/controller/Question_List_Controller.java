package com.arrak.exam.controller;

import com.arrak.exam.R;
import com.arrak.exam.business_model.QuestionModel;
import com.arrak.exam.repository.QuestionAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Question_List_Controller extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_list_view);
        
        QuestionModel[] questions = new QuestionModel[] {
        	new QuestionModel("ไก่กับไข่อะไรเกิดก่อนกัน?")
        	, new QuestionModel("แมวกับหมาโกรธกันเรื่องอะไร?")
        };
               
        QuestionAdapter questionAdapter = new QuestionAdapter(this,questions);
        setListAdapter(questionAdapter);        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.question__list__controller, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.menu_question_add) {
        	openQuestionCreateView();
        	return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    private void openQuestionCreateView(){
    	Intent intent = new Intent();
    	intent.setAction("question.create");
    	
    	startActivity(intent);
    }
}
