
package com.example.android.kerala;
public class word {
    /** Miwok translation for the word */
    private String mtourismPlacename;

    /** Image resource ID for the word */
    private int mImageResourceId;
    private int mtourismdiscription;

    /**
     * Create a new Word object.
     *

     * @param tourismPlacename is the word in the Miwok language
     * @param ImageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public word(String tourismPlacename, int ImageResourceId,int tourismdiscription) {
        mtourismPlacename = tourismPlacename;
        mImageResourceId = ImageResourceId;
        mtourismdiscription=tourismdiscription;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public String getMtourismPlacename() {
        return mtourismPlacename;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

public int getMtourismdiscription() {return mtourismdiscription;}
}