package com.responses.Quiz;

import com.google.gson.annotations.SerializedName;

public class CreateQuizRequest {

    @SerializedName("categoryId")
    private int categoryId;

    @SerializedName("name")
    private String name;


    public CreateQuizRequest(int categoryId, String name){
        this.categoryId = categoryId;
        this.name = name;
    }

    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }

    public void setName(String name){
        this.name = name;
    }
}
