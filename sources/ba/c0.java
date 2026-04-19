package ba;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f5555b;

    public c0(String str, Map<String, Object> map) {
        this.f5554a = str;
        this.f5555b = map;
    }

    private final long h(String str) {
        Integer num = (Integer) this.f5555b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return h("auth_time");
    }

    public Map<String, Object> b() {
        return this.f5555b;
    }

    public long c() {
        return h("exp");
    }

    public long d() {
        return h("iat");
    }

    public String e() {
        Map map = (Map) this.f5555b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        Map map = (Map) this.f5555b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String g() {
        return this.f5554a;
    }
}
