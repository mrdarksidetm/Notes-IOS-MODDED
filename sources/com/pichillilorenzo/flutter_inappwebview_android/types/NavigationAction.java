package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationAction {
    boolean hasGesture;
    boolean isForMainFrame;
    boolean isRedirect;
    URLRequest request;

    public NavigationAction(URLRequest uRLRequest, boolean z10, boolean z11, boolean z12) {
        this.request = uRLRequest;
        this.isForMainFrame = z10;
        this.hasGesture = z11;
        this.isRedirect = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationAction navigationAction = (NavigationAction) obj;
        if (this.isForMainFrame == navigationAction.isForMainFrame && this.hasGesture == navigationAction.hasGesture && this.isRedirect == navigationAction.isRedirect) {
            return this.request.equals(navigationAction.request);
        }
        return false;
    }

    public URLRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return (((((this.request.hashCode() * 31) + (this.isForMainFrame ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isRedirect ? 1 : 0);
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForMainFrame(boolean z10) {
        this.isForMainFrame = z10;
    }

    public void setHasGesture(boolean z10) {
        this.hasGesture = z10;
    }

    public void setRedirect(boolean z10) {
        this.isRedirect = z10;
    }

    public void setRequest(URLRequest uRLRequest) {
        this.request = uRLRequest;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("request", this.request.toMap());
        map.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        map.put("hasGesture", Boolean.valueOf(this.hasGesture));
        map.put("isRedirect", Boolean.valueOf(this.isRedirect));
        map.put("navigationType", null);
        map.put("sourceFrame", null);
        map.put("targetFrame", null);
        map.put("shouldPerformDownload", null);
        return map;
    }

    public String toString() {
        return "NavigationAction{request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
    }
}
