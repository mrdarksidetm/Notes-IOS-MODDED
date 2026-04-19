package yb;

import java.util.HashMap;
import java.util.Map;
import wb.c0;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static Map<String, Object> a(e eVar) {
        c0 c0VarB = eVar.b();
        if (c0VarB == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("sql", c0VarB.c());
        map.put("arguments", c0VarB.b());
        return map;
    }
}
