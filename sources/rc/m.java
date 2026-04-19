package rc;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rc.m;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.j f19337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f19338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.c f19339c;

    class a implements j.c {
        a() {
        }

        private void b(sc.i iVar, j.d dVar) {
            try {
                m.this.f19338b.f(((Integer) iVar.b()).intValue());
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void c(sc.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            boolean z10 = true;
            boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z11) {
                    m.this.f19338b.g(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, byteBufferWrap));
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z10 = false;
                    }
                    long jD = m.this.f19338b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z10 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
                    if (jD != -2) {
                        dVar.success(Long.valueOf(jD));
                        return;
                    } else if (!z10) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void d(sc.i iVar, j.d dVar) {
            try {
                m.this.f19338b.i(((Integer) ((Map) iVar.b()).get("id")).intValue());
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(j.d dVar, c cVar) {
            if (cVar == null) {
                dVar.error("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(cVar.f19341a));
            map.put("height", Double.valueOf(cVar.f19342b));
            dVar.success(map);
        }

        private void f(sc.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                m.this.f19338b.c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void g(sc.i iVar, final j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                m.this.f19338b.e(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: rc.l
                    @Override // rc.m.b
                    public final void a(m.c cVar) {
                        m.a.e(dVar, cVar);
                    }
                });
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void h(sc.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                m.this.f19338b.b(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void i(sc.i iVar, j.d dVar) {
            try {
                m.this.f19338b.a(((Boolean) iVar.b()).booleanValue());
                dVar.success(null);
            } catch (IllegalStateException e10) {
                dVar.error("error", m.c(e10), null);
            }
        }

        private void j(sc.i iVar, j.d dVar) {
            j.d dVar2;
            List list = (List) iVar.b();
            try {
                m.this.f19338b.h(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
                try {
                    dVar2.success(null);
                } catch (IllegalStateException e10) {
                    e = e10;
                    dVar2.error("error", m.c(e), null);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                dVar2 = dVar;
            }
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (m.this.f19338b == null) {
            }
            cc.b.f("PlatformViewsChannel", "Received '" + iVar.f20503a + "' message.");
            String str = iVar.f20503a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(iVar, dVar);
                    break;
                case "offset":
                    f(iVar, dVar);
                    break;
                case "resize":
                    g(iVar, dVar);
                    break;
                case "clearFocus":
                    b(iVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(iVar, dVar);
                    break;
                case "touch":
                    j(iVar, dVar);
                    break;
                case "setDirection":
                    h(iVar, dVar);
                    break;
                case "dispose":
                    d(iVar, dVar);
                    break;
                default:
                    dVar.notImplemented();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19342b;

        public c(int i10, int i11) {
            this.f19341a = i10;
            this.f19342b = i11;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f19345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f19346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f19347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f19348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19349g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f19350h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f19351i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i10, String str, double d10, double d11, double d12, double d13, int i11, a aVar, ByteBuffer byteBuffer) {
            this.f19343a = i10;
            this.f19344b = str;
            this.f19347e = d10;
            this.f19348f = d11;
            this.f19345c = d12;
            this.f19346d = d13;
            this.f19349g = i11;
            this.f19350h = aVar;
            this.f19351i = byteBuffer;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f19357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f19358c;

        public e(int i10, double d10, double d11) {
            this.f19356a = i10;
            this.f19357b = d10;
            this.f19358c = d11;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Number f19360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Number f19361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f19364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f19365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19366h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f19367i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f19368j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f19369k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f19370l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f19371m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f19372n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f19373o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f19374p;

        public f(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f19359a = i10;
            this.f19360b = number;
            this.f19361c = number2;
            this.f19362d = i11;
            this.f19363e = i12;
            this.f19364f = obj;
            this.f19365g = obj2;
            this.f19366h = i13;
            this.f19367i = i14;
            this.f19368j = f10;
            this.f19369k = f11;
            this.f19370l = i15;
            this.f19371m = i16;
            this.f19372n = i17;
            this.f19373o = i18;
            this.f19374p = j10;
        }
    }

    public interface g {
        void a(boolean z10);

        void b(int i10, int i11);

        void c(int i10, double d10, double d11);

        long d(d dVar);

        void e(e eVar, b bVar);

        void f(int i10);

        void g(d dVar);

        void h(f fVar);

        void i(int i10);
    }

    public m(fc.a aVar) {
        a aVar2 = new a();
        this.f19339c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/platform_views", sc.q.f20518b);
        this.f19337a = jVar;
        jVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return cc.b.d(exc);
    }

    public void d(int i10) {
        sc.j jVar = this.f19337a;
        if (jVar == null) {
            return;
        }
        jVar.c("viewFocused", Integer.valueOf(i10));
    }

    public void e(g gVar) {
        this.f19338b = gVar;
    }
}
