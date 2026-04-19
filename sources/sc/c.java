package sc;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sc.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.b f20490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f20492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.c f20493d;

    public interface b {
        void success(Object obj);
    }

    /* JADX INFO: renamed from: sc.c$c, reason: collision with other inner class name */
    private final class C0420c implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f20494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<b> f20495b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: sc.c$c$a */
        private final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AtomicBoolean f20497a;

            private a() {
                this.f20497a = new AtomicBoolean(false);
            }

            @Override // sc.c.b
            public void success(Object obj) {
                if (this.f20497a.get() || C0420c.this.f20495b.get() != this) {
                    return;
                }
                c.this.f20490a.d(c.this.f20491b, c.this.f20492c.c(obj));
            }
        }

        C0420c(d dVar) {
            this.f20494a = dVar;
        }

        private void c(Object obj, b.InterfaceC0419b interfaceC0419b) {
            ByteBuffer byteBufferE;
            if (this.f20495b.getAndSet(null) != null) {
                try {
                    this.f20494a.b(obj);
                    interfaceC0419b.a(c.this.f20492c.c(null));
                    return;
                } catch (RuntimeException e10) {
                    cc.b.c("EventChannel#" + c.this.f20491b, "Failed to close event stream", e10);
                    byteBufferE = c.this.f20492c.e("error", e10.getMessage(), null);
                }
            } else {
                byteBufferE = c.this.f20492c.e("error", "No active stream to cancel", null);
            }
            interfaceC0419b.a(byteBufferE);
        }

        private void d(Object obj, b.InterfaceC0419b interfaceC0419b) {
            a aVar = new a();
            if (this.f20495b.getAndSet(aVar) != null) {
                try {
                    this.f20494a.b(null);
                } catch (RuntimeException e10) {
                    cc.b.c("EventChannel#" + c.this.f20491b, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.f20494a.a(obj, aVar);
                interfaceC0419b.a(c.this.f20492c.c(null));
            } catch (RuntimeException e11) {
                this.f20495b.set(null);
                cc.b.c("EventChannel#" + c.this.f20491b, "Failed to open event stream", e11);
                interfaceC0419b.a(c.this.f20492c.e("error", e11.getMessage(), null));
            }
        }

        @Override // sc.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
            i iVarB = c.this.f20492c.b(byteBuffer);
            if (iVarB.f20503a.equals("listen")) {
                d(iVarB.f20504b, interfaceC0419b);
            } else if (iVarB.f20503a.equals("cancel")) {
                c(iVarB.f20504b, interfaceC0419b);
            } else {
                interfaceC0419b.a(null);
            }
        }
    }

    public interface d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public c(sc.b bVar, String str) {
        this(bVar, str, q.f20518b);
    }

    public c(sc.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public c(sc.b bVar, String str, k kVar, b.c cVar) {
        this.f20490a = bVar;
        this.f20491b = str;
        this.f20492c = kVar;
        this.f20493d = cVar;
    }

    public void d(d dVar) {
        if (this.f20493d != null) {
            this.f20490a.e(this.f20491b, dVar != null ? new C0420c(dVar) : null, this.f20493d);
        } else {
            this.f20490a.f(this.f20491b, dVar != null ? new C0420c(dVar) : null);
        }
    }
}
