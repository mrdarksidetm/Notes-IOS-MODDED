package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7238a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7239b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f7240d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7241e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7242f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f7243g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f7244h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f7245i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f7246c = new HashMap();

    public Object a(String str) {
        return this.f7246c.get(str);
    }

    public void a() {
        this.f7246c.clear();
    }

    public void a(Object obj) {
        if (!f7245i && obj == null) {
            throw new AssertionError();
        }
        this.f7246c.put(f7238a, obj);
    }

    public void a(String str, Object obj) {
        this.f7246c.put(str, obj);
    }

    public boolean a(Class cls) {
        return b(f7238a) && a(f7238a).getClass().equals(cls);
    }

    public Object b() {
        return this.f7246c.get(f7238a);
    }

    public boolean b(String str) {
        return this.f7246c.containsKey(str);
    }

    public Object c(String str) {
        return this.f7246c.remove(str);
    }

    public void c() {
        this.f7246c.remove(f7238a);
    }
}
