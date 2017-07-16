package com.example.pc.memory_test;

import android.view.View;
import android.widget.TextView;

/**
 * Created by PC on 7/2/2017.
 */

public class clsResultsHolder {

    View base;
    TextView tvUsername;
    TextView tvScore;

    public clsResultsHolder(View base) {

        this.base = base;
    }

    public TextView getTvUsername() {
        if (tvUsername==null)
        {
            tvUsername=(TextView)base.findViewById(R.id.tvUsernameRow);
        }
        return tvUsername;
    }

    public void setTvUsername(TextView tvUsername) {

        this.tvUsername = tvUsername;
    }

    public TextView getTvScore() {
        if (tvScore==null)
        {
            tvScore=(TextView)base.findViewById(R.id.tvScoreRow);
        }
        return tvScore;
    }

    public void setTvScore(TextView tvScore) {
        this.tvScore = tvScore;
    }
}
