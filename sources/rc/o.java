package rc;

import java.util.HashMap;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f19381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sc.j f19382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.d f19383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.c f19386g;

    class a implements j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f19387a;

        a(byte[] bArr) {
            this.f19387a = bArr;
        }

        @Override // sc.j.d
        public void error(String str, String str2, Object obj) {
            cc.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // sc.j.d
        public void notImplemented() {
        }

        @Override // sc.j.d
        public void success(Object obj) {
            o.this.f19381b = this.f19387a;
        }
    }

    class b implements j.c {
        b() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            Map mapI;
            String str = iVar.f20503a;
            Object obj = iVar.f20504b;
            str.hashCode();
            if (str.equals(com.amazon.a.a.o.b.au)) {
                o.this.f19385f = true;
                if (!o.this.f19384e) {
                    o oVar = o.this;
                    if (oVar.f19380a) {
                        oVar.f19383d = dVar;
                        return;
                    }
                }
                o oVar2 = o.this;
                mapI = oVar2.i(oVar2.f19381b);
            } else if (!str.equals("put")) {
                dVar.notImplemented();
                return;
            } else {
                o.this.f19381b = (byte[]) obj;
                mapI = null;
            }
            dVar.success(mapI);
        }
    }

    public o(fc.a aVar, boolean z10) {
        this(new sc.j(aVar, "flutter/restoration", sc.q.f20518b), z10);
    }

    o(sc.j jVar, boolean z10) {
        this.f19384e = false;
        this.f19385f = false;
        b bVar = new b();
        this.f19386g = bVar;
        this.f19382c = jVar;
        this.f19380a = z10;
        jVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void g() {
        this.f19381b = null;
    }

    public byte[] h() {
        return this.f19381b;
    }

    public void j(byte[] bArr) {
        this.f19384e = true;
        j.d dVar = this.f19383d;
        if (dVar != null) {
            dVar.success(i(bArr));
            this.f19383d = null;
        } else if (this.f19385f) {
            this.f19382c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f19381b = bArr;
    }
}
