package com.suganthan.recruit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by msuganthan on 29/7/18.
 */
public class PhoneList {

    public static final String YES = "YES";
    public static final String NO = "NO";
    private static Tree tree = new Tree();
    private static boolean isConsistent = true;

    public static void main(String[] args) {
        PhoneList pl = new PhoneList();
        try {
            pl.checkConsistency();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void checkConsistency() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine());
            tree = new Tree();
            isConsistent = true;
            for (int j = 0; j < n; ++j) {
                String phone = br.readLine();
                if (isConsistent)
                    buildTree(phone);
            }
            if (isConsistent)
                System.out.println(YES);
            else
                System.out.println(NO);
        }
    }

    private void buildTree(String s) {
        int len = s.length();
        Tree auxTree = tree;
        for (int i = 0; i < len; ++i) {
            int ch = Integer.parseInt(s.substring(i, i + 1));
            Tree aux = auxTree.next[ch];
            if (aux == null) {
                aux = new Tree();
                aux.node = 1;
                if (i == len - 1)
                    aux.isCons = true;
                auxTree.next[ch] = aux;
                auxTree = aux;
            } else {
                if (aux.isCons) {
                    isConsistent = false;
                    break;
                }
                if (i == len - 1) {
                    isConsistent = false;
                    break;
                }
                auxTree = aux;
            }
        }
    }

    private static class Tree {
        int node = 0;
        boolean isCons = false;
        Tree[] next = new Tree[10];
    }
}
