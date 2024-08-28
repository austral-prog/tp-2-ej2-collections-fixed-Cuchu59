package com.collections;

import java.util.List;

public class Lists {
    public int index_of(String word, List<String> lista) {
        int count = 0;
        for (String elem : lista) {
            if(elem.equals(word)) {
                return count;
            }
            ++count;
        }
        return -1;
    }

    public int index_of_by_index(String word, List<String> lista, int num) {
        int count = num;
        for (int i = num; i < lista.size(); i++) {
            if(lista.get(i).equals(word)) {
                return count;
            }
            ++count;
        }
        return -1;
    }
    
    public int index_of_empty(List<String> lista) {
        return index_of("", lista);
    }

    public int put(String word, List<String> lista) {
        int blank_i = index_of("", lista);
        if(blank_i != -1) {
            lista.set(blank_i, word);
        }
        
        return index_of(word, lista);
    }

    public int remove(String word, List<String> lista) {
        int blank_i = index_of(word, lista);
        if(blank_i != -1) {
            lista.remove(blank_i);
        }
        
        return index_of(word, lista);
    }


}
