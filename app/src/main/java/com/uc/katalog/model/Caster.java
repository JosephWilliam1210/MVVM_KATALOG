package com.uc.katalog.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Caster implements Parcelable {

    @SerializedName("name")
    private String name;
    @SerializedName("character")
    private String role;
    @SerializedName("profile_path")
    private String img_url;

    public Caster(){

    }

    public Caster(String name, String role, String img_url) {
        this.name = name;
        this.role = role;
        this.img_url = img_url;
    }

    protected Caster(Parcel in) {
        name = in.readString();
        role = in.readString();
        img_url = in.readString();
    }

    public static final Creator<Caster> CREATOR = new Creator<Caster>() {
        @Override
        public Caster createFromParcel(Parcel in) {
            return new Caster(in);
        }

        @Override
        public Caster[] newArray(int size) {
            return new Caster[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(role);
        parcel.writeString(img_url);
    }
}
