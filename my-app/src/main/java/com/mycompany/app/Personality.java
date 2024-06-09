package com.mycompany.app;

import java.util.Iterator;

public class Personality implements Iterable<String>{
   public String[] love = new String[3];
   public String[] hate = new String[3];


   // Additional Love traits
  static String[] defaultLove = {"Kindness", "Compassion", "Integrity", "Generosity", "Courage", "Wisdom"};

  // Additional Hate traits
  static String[] defaultHate = {"Greed", "Arrogance", "Cruelty", "Ignorance", "Injustice", "Deception"};

   
   public Personality(String[] love, String[] hate) {
    this.love = love;
    this.hate = hate;
   }

   public Iterator<String> loveIterator() {
    return new ArrayIterator(love);
    }

    public Iterator<String> hateIterator() {
        return new ArrayIterator(hate);
    }

    @Override
    public Iterator<String> iterator() {
        return loveIterator();
    }
    private class ArrayIterator implements Iterator<String> {
        private int index = 0;
        private String[] array;

        public ArrayIterator(String[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public String next() {
            return array[index++];
        }
    }
}