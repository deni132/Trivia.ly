package com.responses.Quiz;

import com.google.gson.annotations.SerializedName;

public class GetUsersOnQuizRequest {

    @SerializedName("quizid")
    private int quizId;

    public GetUsersOnQuizRequest(int quizId){
        this.quizId = quizId;
    }

    public void setQuizId(int quizId){
        this.quizId = quizId;
    }
}
