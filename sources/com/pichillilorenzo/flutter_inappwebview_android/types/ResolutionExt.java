package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ResolutionExt {
    private int horizontalDpi;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f9080id;
    private String label;
    private int verticalDpi;

    public ResolutionExt(String str, String str2, int i10, int i11) {
        this.f9080id = str;
        this.label = str2;
        this.verticalDpi = i10;
        this.horizontalDpi = i11;
    }

    public static ResolutionExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ResolutionExt((String) map.get("id"), (String) map.get("label"), ((Integer) map.get("verticalDpi")).intValue(), ((Integer) map.get("horizontalDpi")).intValue());
    }

    public static ResolutionExt fromResolution(PrintAttributes.Resolution resolution) {
        if (resolution == null) {
            return null;
        }
        return new ResolutionExt(resolution.getId(), resolution.getLabel(), resolution.getVerticalDpi(), resolution.getHorizontalDpi());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolutionExt resolutionExt = (ResolutionExt) obj;
        if (this.verticalDpi == resolutionExt.verticalDpi && this.horizontalDpi == resolutionExt.horizontalDpi && this.f9080id.equals(resolutionExt.f9080id)) {
            return this.label.equals(resolutionExt.label);
        }
        return false;
    }

    public int getHorizontalDpi() {
        return this.horizontalDpi;
    }

    public String getId() {
        return this.f9080id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getVerticalDpi() {
        return this.verticalDpi;
    }

    public int hashCode() {
        return (((((this.f9080id.hashCode() * 31) + this.label.hashCode()) * 31) + this.verticalDpi) * 31) + this.horizontalDpi;
    }

    public void setHorizontalDpi(int i10) {
        this.horizontalDpi = i10;
    }

    public void setId(String str) {
        this.f9080id = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setVerticalDpi(int i10) {
        this.verticalDpi = i10;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("id", this.f9080id);
        map.put("label", this.label);
        map.put("verticalDpi", Integer.valueOf(this.verticalDpi));
        map.put("horizontalDpi", Integer.valueOf(this.horizontalDpi));
        return map;
    }

    public PrintAttributes.Resolution toResolution() {
        return new PrintAttributes.Resolution(this.f9080id, this.label, this.horizontalDpi, this.verticalDpi);
    }

    public String toString() {
        return "ResolutionExt{id='" + this.f9080id + "', label='" + this.label + "', verticalDpi=" + this.verticalDpi + ", horizontalDpi=" + this.horizontalDpi + '}';
    }
}
