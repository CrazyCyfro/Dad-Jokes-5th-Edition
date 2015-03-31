package com.doritos.mtndew.dadjokes5thedition;

/**
 * Created by Yan Wei on 3/3/2015.
 */
public class Joke {

    private String mTitle;
    private String mQuestion;
    private String mPunchline;
    protected Boolean mSeen;

    public Joke(String title, String question, String punchline, Boolean seen) {
        mTitle = title;
        mQuestion = question;
        mPunchline = punchline;
        mSeen = seen;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public String getPunchline() {
        return mPunchline;
    }

    public void setPunchline(String punchline) {
        mPunchline = punchline;
    }

    public Boolean getmSeen() {
        return mSeen;
    }

    public void setmSeen(Boolean mSeen) {
        this.mSeen = mSeen;
    }
}
