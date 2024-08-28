package com.collections;

import java.util.List;

public class Lists {
    public int indexOf(String word, List<String> lista) {
        int count = 0;
        for (String elem : lista) {
            if(elem.equals(word)) {
                return count;
            }
            ++count;
        }
        return -1;
    }

    public int indexOfByIndex(String word, List<String> lista, int num) {
        int count = num;
        for (int i = num; i < lista.size(); i++) {
            if(lista.get(i).equals(word)) {
                return count;
            }
            ++count;
        }
        return -1;
    }
    
    public int indexOfEmpty(List<String> lista) {
        return indexOf("", lista);
    }

    public int put(String word, List<String> lista) {
        int blank_i = indexOf("", lista);
        if(blank_i != -1) {
            lista.set(blank_i, word);
        }
        
        return indexOf(word, lista);
    }

    public int remove(String word, List<String> lista) {
        int blank_i = indexOf(word, lista);
        if(blank_i != -1) {
            lista.remove(blank_i);
        }
        
        return indexOf(word, lista);
    }

}
