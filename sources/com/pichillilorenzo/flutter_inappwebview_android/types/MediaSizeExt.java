package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MediaSizeExt {
    private int heightMils;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f9079id;
    private String label;
    private int widthMils;

    public MediaSizeExt(String str, String str2, int i10, int i11) {
        this.f9079id = str;
        this.label = str2;
        this.widthMils = i10;
        this.heightMils = i11;
    }

    public static MediaSizeExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MediaSizeExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("widthMils")).intValue(), ((Integer) map.get("heightMils")).intValue());
    }

    public static MediaSizeExt fromMediaSize(PrintAttributes.MediaSize mediaSize) {
        if (mediaSize == null) {
            return null;
        }
        return new MediaSizeExt(mediaSize.getId(), null, mediaSize.getHeightMils(), mediaSize.getWidthMils());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaSizeExt mediaSizeExt = (MediaSizeExt) obj;
        if (this.widthMils != mediaSizeExt.widthMils || this.heightMils != mediaSizeExt.heightMils || !this.f9079id.equals(mediaSizeExt.f9079id)) {
            return false;
        }
        String str = this.label;
        String str2 = mediaSizeExt.label;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int getHeightMils() {
        return this.heightMils;
    }

    public String getId() {
        return this.f9079id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getWidthMils() {
        return this.widthMils;
    }

    public int hashCode() {
        int iHashCode = this.f9079id.hashCode() * 31;
        String str = this.label;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.widthMils) * 31) + this.heightMils;
    }

    public void setHeightMils(int i10) {
        this.heightMils = i10;
    }

    public void setId(String str) {
        this.f9079id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setWidthMils(int i10) {
        this.widthMils = i10;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("id", this.f9079id);
        map.put("label", this.label);
        map.put("heightMils", Integer.valueOf(this.heightMils));
        map.put("widthMils", Integer.valueOf(this.widthMils));
        return map;
    }

    public PrintAttributes.MediaSize toMediaSize() {
        return new PrintAttributes.MediaSize(this.f9079id, "Custom", this.widthMils, this.heightMils);
    }

    public String toString() {
        return "MediaSizeExt{id='" + this.f9079id + "', label='" + this.label + "', widthMils=" + this.widthMils + ", heightMils=" + this.heightMils + '}';
    }
}
