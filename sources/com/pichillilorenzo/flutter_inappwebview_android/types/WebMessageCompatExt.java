package com.pichillilorenzo.flutter_inappwebview_android.types;

import f5.l;
import f5.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageCompatExt {
    private Object data;
    private List<WebMessagePortCompatExt> ports;
    private int type;

    public WebMessageCompatExt(Object obj, int i10, List<WebMessagePortCompatExt> list) {
        this.data = obj;
        this.type = i10;
        this.ports = list;
    }

    public static WebMessageCompatExt fromMap(Map<String, Object> map) {
        ArrayList arrayList = null;
        if (map == null) {
            return null;
        }
        Object obj = map.get("data");
        Integer num = (Integer) map.get("type");
        List list = (List) map.get("ports");
        if (list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(WebMessagePortCompatExt.fromMap((Map) it.next()));
            }
        }
        return new WebMessageCompatExt(obj, num.intValue(), arrayList);
    }

    public static WebMessageCompatExt fromMapWebMessageCompat(l lVar) {
        return new WebMessageCompatExt((s.a("WEB_MESSAGE_ARRAY_BUFFER") && lVar.e() == 1) ? lVar.b() : lVar.c(), lVar.e(), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebMessageCompatExt webMessageCompatExt = (WebMessageCompatExt) obj;
        if (this.type == webMessageCompatExt.type && Objects.equals(this.data, webMessageCompatExt.data)) {
            return Objects.equals(this.ports, webMessageCompatExt.ports);
        }
        return false;
    }

    public Object getData() {
        return this.data;
    }

    public List<WebMessagePortCompatExt> getPorts() {
        return this.ports;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        Object obj = this.data;
        int iHashCode = (((obj != null ? obj.hashCode() : 0) * 31) + this.type) * 31;
        List<WebMessagePortCompatExt> list = this.ports;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setPorts(List<WebMessagePortCompatExt> list) {
        this.ports = list;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("data", this.data);
        map.put("type", Integer.valueOf(this.type));
        return map;
    }

    public String toString() {
        return "WebMessageCompatExt{data=" + this.data + ", type=" + this.type + ", ports=" + this.ports + '}';
    }
}
