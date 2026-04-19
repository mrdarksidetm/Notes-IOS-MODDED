package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PullToRefreshSettings implements ISettings<PullToRefreshLayout> {
    public static final String LOG_TAG = "PullToRefreshSettings";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled = Boolean.TRUE;
    public Integer size;
    public Integer slingshotDistance;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(PullToRefreshLayout pullToRefreshLayout) {
        return toMap();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<PullToRefreshLayout> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<PullToRefreshLayout> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.hashCode();
                switch (key) {
                    case "distanceToTriggerSync":
                        this.distanceToTriggerSync = (Integer) value;
                        break;
                    case "enabled":
                        this.enabled = (Boolean) value;
                        break;
                    case "size":
                        this.size = (Integer) value;
                        break;
                    case "color":
                        this.color = (String) value;
                        break;
                    case "backgroundColor":
                        this.backgroundColor = (String) value;
                        break;
                    case "slingshotDistance":
                        this.slingshotDistance = (Integer) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("enabled", this.enabled);
        map.put("color", this.color);
        map.put("backgroundColor", this.backgroundColor);
        map.put("distanceToTriggerSync", this.distanceToTriggerSync);
        map.put("slingshotDistance", this.slingshotDistance);
        map.put("size", this.size);
        return map;
    }
}
