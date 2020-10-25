package com.uc.katalog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CasterResponse {

    @SerializedName("cast")
    private List<Caster> casts;

    public List<Caster> getCast(){
        return casts;
    }

    public void setCast(List<Caster>cast){
        this.casts = cast;
    }

}
