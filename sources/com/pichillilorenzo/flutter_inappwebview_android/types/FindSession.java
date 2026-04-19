package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FindSession {
    private int highlightedResultIndex;
    private int resultCount;
    private int searchResultDisplayStyle = 2;

    public FindSession(int i10, int i11) {
        this.resultCount = i10;
        this.highlightedResultIndex = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindSession findSession = (FindSession) obj;
        return this.resultCount == findSession.resultCount && this.highlightedResultIndex == findSession.highlightedResultIndex && this.searchResultDisplayStyle == findSession.searchResultDisplayStyle;
    }

    public int getHighlightedResultIndex() {
        return this.highlightedResultIndex;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public int getSearchResultDisplayStyle() {
        return this.searchResultDisplayStyle;
    }

    public int hashCode() {
        return (((this.resultCount * 31) + this.highlightedResultIndex) * 31) + this.searchResultDisplayStyle;
    }

    public void setHighlightedResultIndex(int i10) {
        this.highlightedResultIndex = i10;
    }

    public void setResultCount(int i10) {
        this.resultCount = i10;
    }

    public void setSearchResultDisplayStyle(int i10) {
        this.searchResultDisplayStyle = i10;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("resultCount", Integer.valueOf(this.resultCount));
        map.put("highlightedResultIndex", Integer.valueOf(this.highlightedResultIndex));
        map.put("searchResultDisplayStyle", Integer.valueOf(this.searchResultDisplayStyle));
        return map;
    }

    public String toString() {
        return "FindSession{resultCount=" + this.resultCount + ", highlightedResultIndex=" + this.highlightedResultIndex + ", searchResultDisplayStyle=" + this.searchResultDisplayStyle + '}';
    }
}
