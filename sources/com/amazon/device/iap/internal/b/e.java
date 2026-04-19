package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f7846b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f7847a = new ConcurrentSkipListSet();

    public static e a() {
        return f7846b;
    }

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f7847a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f7847a.add(str);
    }
}
