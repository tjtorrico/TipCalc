package net.tjtorrico.tipcalc.fragment;

import net.tjtorrico.tipcalc.model.TipRecord;

/**
 * Created by TJT on 08/06/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
