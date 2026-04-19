package yb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class c extends yb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Object> f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f23579b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f23580c;

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f23582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f23583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23584d;

        public a() {
        }

        @Override // yb.f
        public void error(String str, String str2, Object obj) {
            this.f23582b = str;
            this.f23583c = str2;
            this.f23584d = obj;
        }

        @Override // yb.f
        public void success(Object obj) {
            this.f23581a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z10) {
        this.f23578a = map;
        this.f23580c = z10;
    }

    @Override // yb.e
    public <T> T a(String str) {
        return (T) this.f23578a.get(str);
    }

    @Override // yb.b, yb.e
    public boolean c() {
        return this.f23580c;
    }

    @Override // yb.e
    public boolean f(String str) {
        return this.f23578a.containsKey(str);
    }

    @Override // yb.e
    public String getMethod() {
        return (String) this.f23578a.get("method");
    }

    @Override // yb.a
    public f l() {
        return this.f23579b;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f23579b.f23582b);
        map2.put("message", this.f23579b.f23583c);
        map2.put("data", this.f23579b.f23584d);
        map.put("error", map2);
        return map;
    }

    public Map<String, Object> n() {
        HashMap map = new HashMap();
        map.put("result", this.f23579b.f23581a);
        return map;
    }

    public void o(j.d dVar) {
        a aVar = this.f23579b;
        dVar.error(aVar.f23582b, aVar.f23583c, aVar.f23584d);
    }

    public void p(List<Map<String, Object>> list) {
        if (c()) {
            return;
        }
        list.add(m());
    }

    public void q(List<Map<String, Object>> list) {
        if (c()) {
            return;
        }
        list.add(n());
    }
}
