package com.amazon.a.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7557a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7558b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7559c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7562f;

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f7560d = a(f7557a, map);
        this.f7561e = a(f7558b, map);
        this.f7562f = a(f7559c, map);
    }

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f7561e;
    }

    public String b() {
        return this.f7562f;
    }

    public String c() {
        return this.f7560d;
    }
}
