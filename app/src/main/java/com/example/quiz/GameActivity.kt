package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.quiz.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityGameBinding

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mQuestionsList = Constants.getQuestions()

        binding.firstAnswerRadioButton.setOnClickListener(this)
        binding.secondAnswerRadioButton.setOnClickListener(this)
        binding.thirdAnswerRadioButton.setOnClickListener(this)
        binding.fourthAnswerRadioButton.setOnClickListener(this)

    }

    private fun setQuestion() {

        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition" + "/" + binding.progressBar.max

        binding.gameQuestion.text = question!!.question
        binding.firstAnswerRadioButton.text = question.optionOne
        binding.secondAnswerRadioButton.text = question.optionTwo
        binding.thirdAnswerRadioButton.text = question.optionThree
        binding.fourthAnswerRadioButton.text = question.optionFour

    }

    override fun onClick(v: View) {

    }


}