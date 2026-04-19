package fc;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import sc.b;
import sc.r;

/* JADX INFO: loaded from: classes2.dex */
public class a implements sc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f11169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f11170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fc.c f11171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sc.b f11172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f11175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b.a f11176h;

    /* JADX INFO: renamed from: fc.a$a, reason: collision with other inner class name */
    class C0268a implements b.a {
        C0268a() {
        }

        @Override // sc.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
            a.this.f11174f = r.f20521b.b(byteBuffer);
            if (a.this.f11175g != null) {
                a.this.f11175g.a(a.this.f11174f);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11180c;

        public b(String str, String str2) {
            this.f11178a = str;
            this.f11179b = null;
            this.f11180c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f11178a = str;
            this.f11179b = str2;
            this.f11180c = str3;
        }

        public static b a() {
            hc.d dVarC = cc.a.e().c();
            if (dVarC.k()) {
                return new b(dVarC.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f11178a.equals(bVar.f11178a)) {
                return this.f11180c.equals(bVar.f11180c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f11178a.hashCode() * 31) + this.f11180c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f11178a + ", function: " + this.f11180c + " )";
        }
    }

    private static class c implements sc.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fc.c f11181a;

        private c(fc.c cVar) {
            this.f11181a = cVar;
        }

        /* synthetic */ c(fc.c cVar, C0268a c0268a) {
            this(cVar);
        }

        @Override // sc.b
        public b.c a(b.d dVar) {
            return this.f11181a.a(dVar);
        }

        @Override // sc.b
        public void b(String str, ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
            this.f11181a.b(str, byteBuffer, interfaceC0419b);
        }

        @Override // sc.b
        public void d(String str, ByteBuffer byteBuffer) {
            this.f11181a.b(str, byteBuffer, null);
        }

        @Override // sc.b
        public void e(String str, b.a aVar, b.c cVar) {
            this.f11181a.e(str, aVar, cVar);
        }

        @Override // sc.b
        public void f(String str, b.a aVar) {
            this.f11181a.f(str, aVar);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f11173e = false;
        C0268a c0268a = new C0268a();
        this.f11176h = c0268a;
        this.f11169a = flutterJNI;
        this.f11170b = assetManager;
        fc.c cVar = new fc.c(flutterJNI);
        this.f11171c = cVar;
        cVar.f("flutter/isolate", c0268a);
        this.f11172d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f11173e = true;
        }
    }

    @Override // sc.b
    @Deprecated
    public b.c a(b.d dVar) {
        return this.f11172d.a(dVar);
    }

    @Override // sc.b
    @Deprecated
    public void b(String str, ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
        this.f11172d.b(str, byteBuffer, interfaceC0419b);
    }

    @Override // sc.b
    @Deprecated
    public void d(String str, ByteBuffer byteBuffer) {
        this.f11172d.d(str, byteBuffer);
    }

    @Override // sc.b
    @Deprecated
    public void e(String str, b.a aVar, b.c cVar) {
        this.f11172d.e(str, aVar, cVar);
    }

    @Override // sc.b
    @Deprecated
    public void f(String str, b.a aVar) {
        this.f11172d.f(str, aVar);
    }

    public void j(b bVar, List<String> list) {
        if (this.f11173e) {
            cc.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        gd.e eVarY = gd.e.y("DartExecutor#executeDartEntrypoint");
        try {
            cc.b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f11169a.runBundleAndSnapshotFromLibrary(bVar.f11178a, bVar.f11180c, bVar.f11179b, this.f11170b, list);
            this.f11173e = true;
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean k() {
        return this.f11173e;
    }

    public void l() {
        if (this.f11169a.isAttached()) {
            this.f11169a.notifyLowMemoryWarning();
        }
    }

    public void m() {
        cc.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f11169a.setPlatformMessageHandler(this.f11171c);
    }

    public void n() {
        cc.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f11169a.setPlatformMessageHandler(null);
    }
}
