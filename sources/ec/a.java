package ec;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f10798b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, io.flutter.embedding.engine.a> f10799a = new HashMap();

    a() {
    }

    public static a b() {
        if (f10798b == null) {
            f10798b = new a();
        }
        return f10798b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return this.f10799a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.f10799a.put(str, aVar);
        } else {
            this.f10799a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
