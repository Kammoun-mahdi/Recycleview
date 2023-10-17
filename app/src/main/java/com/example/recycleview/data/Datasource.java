package com.example.recycleview.data;

import com.example.recycleview.model.Word;
import com.example.recycleview.model.Word;

import java.util.LinkedList;

public class Datasource {
    public LinkedList<Word> loadWords(){
        LinkedList<Word> wordList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            wordList.addLast(new Word("Word " + i));
        }
        return wordList;
    }
    public Datasource(){}

}
