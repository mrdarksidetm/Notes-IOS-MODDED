package rc;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.a<Object> f19242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f19243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f19244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.d<Object> f19245d;

    /* JADX INFO: renamed from: rc.a$a, reason: collision with other inner class name */
    class C0405a implements a.d<Object> {
        C0405a() {
        }

        @Override // sc.a.d
        public void a(Object obj, a.e<Object> eVar) {
            HashMap map;
            HashMap map2;
            if (a.this.f19244c == null) {
                eVar.a(null);
                return;
            }
            map = (HashMap) obj;
            String str = (String) map.get("type");
            map2 = (HashMap) map.get("data");
            cc.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) map2.get("message");
                    if (str2 != null) {
                        a.this.f19244c.e(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) map2.get("message");
                    if (str3 != null) {
                        a.this.f19244c.d(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) map.get("nodeId");
                    if (num != null) {
                        a.this.f19244c.c(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) map.get("nodeId");
                    if (num2 != null) {
                        a.this.f19244c.f(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) map.get("nodeId");
                    if (num3 != null) {
                        a.this.f19244c.g(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void c(int i10);

        void d(String str);

        void e(String str);

        void f(int i10);

        void g(int i10);
    }

    public a(fc.a aVar, FlutterJNI flutterJNI) {
        C0405a c0405a = new C0405a();
        this.f19245d = c0405a;
        sc.a<Object> aVar2 = new sc.a<>(aVar, "flutter/accessibility", sc.p.f20515a);
        this.f19242a = aVar2;
        aVar2.e(c0405a);
        this.f19243b = flutterJNI;
    }

    public void b(int i10, c.g gVar) {
        this.f19243b.dispatchSemanticsAction(i10, gVar);
    }

    public void c(int i10, c.g gVar, Object obj) {
        this.f19243b.dispatchSemanticsAction(i10, gVar, obj);
    }

    public void d() {
        this.f19243b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f19243b.setSemanticsEnabled(true);
    }

    public void f(int i10) {
        this.f19243b.setAccessibilityFeatures(i10);
    }

    public void g(b bVar) {
        this.f19244c = bVar;
        this.f19243b.setAccessibilityDelegate(bVar);
    }
}
