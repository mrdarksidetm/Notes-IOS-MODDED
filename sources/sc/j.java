package sc;

import java.nio.ByteBuffer;
import sc.b;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.b f20505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f20507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.c f20508d;

    private final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f20509a;

        /* JADX INFO: renamed from: sc.j$a$a, reason: collision with other inner class name */
        class C0421a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0419b f20511a;

            C0421a(b.InterfaceC0419b interfaceC0419b) {
                this.f20511a = interfaceC0419b;
            }

            @Override // sc.j.d
            public void error(String str, String str2, Object obj) {
                this.f20511a.a(j.this.f20507c.e(str, str2, obj));
            }

            @Override // sc.j.d
            public void notImplemented() {
                this.f20511a.a(null);
            }

            @Override // sc.j.d
            public void success(Object obj) {
                this.f20511a.a(j.this.f20507c.c(obj));
            }
        }

        a(c cVar) {
            this.f20509a = cVar;
        }

        @Override // sc.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
            try {
                this.f20509a.onMethodCall(j.this.f20507c.b(byteBuffer), new C0421a(interfaceC0419b));
            } catch (RuntimeException e10) {
                cc.b.c("MethodChannel#" + j.this.f20506b, "Failed to handle method call", e10);
                interfaceC0419b.a(j.this.f20507c.d("error", e10.getMessage(), null, cc.b.d(e10)));
            }
        }
    }

    private final class b implements b.InterfaceC0419b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f20513a;

        b(d dVar) {
            this.f20513a = dVar;
        }

        @Override // sc.b.InterfaceC0419b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f20513a.notImplemented();
                } else {
                    try {
                        this.f20513a.success(j.this.f20507c.f(byteBuffer));
                    } catch (sc.d e10) {
                        this.f20513a.error(e10.f20499a, e10.getMessage(), e10.f20500b);
                    }
                }
            } catch (RuntimeException e11) {
                cc.b.c("MethodChannel#" + j.this.f20506b, "Failed to handle method call result", e11);
            }
        }
    }

    public interface c {
        void onMethodCall(i iVar, d dVar);
    }

    public interface d {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public j(sc.b bVar, String str) {
        this(bVar, str, q.f20518b);
    }

    public j(sc.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public j(sc.b bVar, String str, k kVar, b.c cVar) {
        this.f20505a = bVar;
        this.f20506b = str;
        this.f20507c = kVar;
        this.f20508d = cVar;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f20505a.b(this.f20506b, this.f20507c.a(new i(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f20508d != null) {
            this.f20505a.e(this.f20506b, cVar != null ? new a(cVar) : null, this.f20508d);
        } else {
            this.f20505a.f(this.f20506b, cVar != null ? new a(cVar) : null);
        }
    }
}
