package com.uc.katalog.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class TV implements Parcelable {

    @SerializedName("id")
    private String id_show;

    @SerializedName("backdrop_path")
    private String cover;

    @SerializedName("name")
    private String name;

    @SerializedName("overview")
    private String description;

    @SerializedName("genres")
    private String genre;

    public TV(){

    }

    public TV(String cover, String name, String description, String genre) {
        this.cover = cover;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.id_show = id_show;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id_show);
        dest.writeString(this.cover);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.genre);
    }

    protected TV(Parcel in) {
        id_show = in.readString();
        this.cover = in.readString();
        this.name = in.readString();
        this.description = in.readString();
        this.genre = in.readString();
    }

    public static final Parcelable.Creator<TV> CREATOR = new Parcelable.Creator<TV>() {
        @Override
        public TV createFromParcel(Parcel source) {
            return new TV(source);
        }

        @Override
        public TV[] newArray(int size) {
            return new TV[size];
        }
    };

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId_show() {
        return id_show;
    }

    public void setId_show(String id_show) {
        this.id_show = id_show;
    }

}
