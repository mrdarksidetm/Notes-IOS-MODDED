package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class c implements wc.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, wc.h> f13050a = new HashMap();

    c() {
    }

    @Override // wc.i
    public boolean a(String str, wc.h hVar) {
        if (this.f13050a.containsKey(str)) {
            return false;
        }
        this.f13050a.put(str, hVar);
        return true;
    }

    wc.h b(String str) {
        return this.f13050a.get(str);
    }
}
