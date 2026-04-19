package h6;

import ae.j;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.api.a;
import e6.a;
import e6.b;
import ge.o;
import h6.c;
import j6.m;
import j6.p;
import j6.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k6.c;
import nd.r0;
import o6.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11843d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.e f11844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f11845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f11846c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public d(x5.e eVar, p pVar, r rVar) {
        this.f11844a = eVar;
        this.f11845b = pVar;
        this.f11846c = rVar;
    }

    private final String b(c.C0289c c0289c) {
        Object obj = c0289c.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(c.C0289c c0289c) {
        Object obj = c0289c.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(j6.h hVar, c.b bVar, c.C0289c c0289c, k6.i iVar, k6.h hVar2) {
        boolean zD = d(c0289c);
        if (k6.b.a(iVar)) {
            if (!zD) {
                return true;
            }
            r rVar = this.f11846c;
            if (rVar != null && rVar.a() <= 3) {
                rVar.b("MemoryCacheService", 3, hVar.m() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str = bVar.d().get("coil#transformation_size");
        if (str != null) {
            return ae.r.b(str, iVar.toString());
        }
        int width = c0289c.a().getWidth();
        int height = c0289c.a().getHeight();
        k6.c cVarB = iVar.b();
        boolean z10 = cVarB instanceof c.a;
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = z10 ? ((c.a) cVarB).f14405a : Integer.MAX_VALUE;
        k6.c cVarA = iVar.a();
        if (cVarA instanceof c.a) {
            i10 = ((c.a) cVarA).f14405a;
        }
        double dC = a6.f.c(width, height, i11, i10, hVar2);
        boolean zA = o6.i.a(hVar);
        if (zA) {
            double dF = o.f(dC, 1.0d);
            if (Math.abs(((double) i11) - (((double) width) * dF)) <= 1.0d || Math.abs(((double) i10) - (dF * ((double) height))) <= 1.0d) {
                return true;
            }
        } else if ((o6.j.t(i11) || Math.abs(i11 - width) <= 1) && (o6.j.t(i10) || Math.abs(i10 - height) <= 1)) {
            return true;
        }
        if (!(dC == 1.0d) && !zA) {
            r rVar2 = this.f11846c;
            if (rVar2 == null || rVar2.a() > 3) {
                return false;
            }
            rVar2.b("MemoryCacheService", 3, hVar.m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + iVar.b() + ", " + iVar.a() + ", " + hVar2 + ").", null);
            return false;
        }
        if (dC <= 1.0d || !zD) {
            return true;
        }
        r rVar3 = this.f11846c;
        if (rVar3 == null || rVar3.a() > 3) {
            return false;
        }
        rVar3.b("MemoryCacheService", 3, hVar.m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + iVar.b() + ", " + iVar.a() + ", " + hVar2 + ").", null);
        return false;
    }

    public final c.C0289c a(j6.h hVar, c.b bVar, k6.i iVar, k6.h hVar2) {
        if (!hVar.C().b()) {
            return null;
        }
        c cVarD = this.f11844a.d();
        c.C0289c c0289cA = cVarD != null ? cVarD.a(bVar) : null;
        if (c0289cA == null || !c(hVar, bVar, c0289cA, iVar, hVar2)) {
            return null;
        }
        return c0289cA;
    }

    public final boolean c(j6.h hVar, c.b bVar, c.C0289c c0289c, k6.i iVar, k6.h hVar2) {
        if (this.f11845b.c(hVar, o6.a.c(c0289c.a()))) {
            return e(hVar, bVar, c0289c, iVar, hVar2);
        }
        r rVar = this.f11846c;
        if (rVar == null || rVar.a() > 3) {
            return false;
        }
        rVar.b("MemoryCacheService", 3, hVar.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final c.b f(j6.h hVar, Object obj, m mVar, x5.c cVar) {
        c.b bVarB = hVar.B();
        if (bVarB != null) {
            return bVarB;
        }
        cVar.g(hVar, obj);
        String strF = this.f11844a.getComponents().f(obj, mVar);
        cVar.n(hVar, strF);
        if (strF == null) {
            return null;
        }
        List<m6.a> listO = hVar.O();
        Map<String, String> mapD = hVar.E().d();
        if (listO.isEmpty() && mapD.isEmpty()) {
            return new c.b(strF, null, 2, null);
        }
        Map mapV = r0.v(mapD);
        if (!listO.isEmpty()) {
            List<m6.a> listO2 = hVar.O();
            int size = listO2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mapV.put("coil#transformation_" + i10, listO2.get(i10).a());
            }
            mapV.put("coil#transformation_size", mVar.n().toString());
        }
        return new c.b(strF, mapV);
    }

    public final q g(b.a aVar, j6.h hVar, c.b bVar, c.C0289c c0289c) {
        return new q(new BitmapDrawable(hVar.l().getResources(), c0289c.a()), hVar, a6.d.MEMORY_CACHE, bVar, b(c0289c), d(c0289c), o6.j.u(aVar));
    }

    public final boolean h(c.b bVar, j6.h hVar, a.b bVar2) {
        c cVarD;
        Bitmap bitmap;
        if (hVar.C().c() && (cVarD = this.f11844a.d()) != null && bVar != null) {
            Drawable drawableE = bVar2.e();
            BitmapDrawable bitmapDrawable = drawableE instanceof BitmapDrawable ? (BitmapDrawable) drawableE : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.f()));
                String strD = bVar2.d();
                if (strD != null) {
                    linkedHashMap.put("coil#disk_cache_key", strD);
                }
                cVarD.c(bVar, new c.C0289c(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
