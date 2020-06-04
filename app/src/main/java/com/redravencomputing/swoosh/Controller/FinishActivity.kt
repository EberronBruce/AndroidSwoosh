package com.redravencomputing.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.redravencomputing.swoosh.R
import com.redravencomputing.swoosh.Utilities.EXTRA_LEAGUE
import com.redravencomputing.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        Log.d("Finish", "league $league")
        Log.d("Finish", "skill $league")

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
