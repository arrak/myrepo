package com.arrak.exam.repository;

import java.util.ArrayList;

import com.arrak.exam.R;
import com.arrak.exam.business_model.QuestionModel;
import com.arrak.exam.viewmodel.QuestionListItemViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class QuestionAdapter extends ArrayAdapter<QuestionModel> {

	Context _context;
	ArrayList<QuestionModel> _questionList;
	
	public QuestionAdapter(Context context, QuestionModel[] objects) {
		super(context, R.layout.question_list_item_view, objects);
		
		_context = context;
		_questionList = new ArrayList<QuestionModel>();
		
		for(int i = 0; i < objects.length; i++){
			_questionList.add(objects[i]);
		}
	}
	@Override
	public View getView (int position, View convertView, ViewGroup parent){
		
		LayoutInflater layoutInflater = (LayoutInflater)_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if(convertView == null)
			convertView = layoutInflater.inflate(R.layout.question_list_item_view, null);
		
		
		QuestionListItemViewHolder questionListItemViewHolder = new QuestionListItemViewHolder(); 
		questionListItemViewHolder.tvQuestion = (TextView)convertView.findViewById(R.id.tvQuestion);
		
		questionListItemViewHolder.tvQuestion.setText(_questionList.get(position).getQuestion());
		
		convertView.setTag(questionListItemViewHolder);
		
		return convertView;
	}
}
