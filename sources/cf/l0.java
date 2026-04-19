package cf;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ye.j;

/* JADX INFO: loaded from: classes2.dex */
class l0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bf.u f6961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ye.f f6963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6965j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bf.a aVar, bf.u uVar, String str, ye.f fVar) {
        super(aVar, uVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(uVar, "value");
        this.f6961f = uVar;
        this.f6962g = str;
        this.f6963h = fVar;
    }

    public /* synthetic */ l0(bf.a aVar, bf.u uVar, String str, ye.f fVar, int i10, ae.j jVar) {
        this(aVar, uVar, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(ye.f fVar, int i10) {
        boolean z10 = (b().f().f() || fVar.j(i10) || !fVar.i(i10).c()) ? false : true;
        this.f6965j = z10;
        return z10;
    }

    private final boolean v0(ye.f fVar, int i10, String str) {
        bf.a aVarB = b();
        ye.f fVarI = fVar.i(i10);
        if (!fVarI.c() && (e0(str) instanceof bf.s)) {
            return true;
        }
        if (ae.r.b(fVarI.e(), j.b.f24010a) && (!fVarI.c() || !(e0(str) instanceof bf.s))) {
            bf.h hVarE0 = e0(str);
            bf.w wVar = hVarE0 instanceof bf.w ? (bf.w) hVarE0 : null;
            String strF = wVar != null ? bf.i.f(wVar) : null;
            if (strF != null && f0.g(fVarI, aVarB, strF) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // af.r0
    protected String a0(ye.f fVar, int i10) {
        Object next;
        ae.r.f(fVar, "descriptor");
        bf.r rVarK = f0.k(fVar, b());
        String strG = fVar.g(i10);
        if (rVarK == null && (!this.f6921e.k() || s0().keySet().contains(strG))) {
            return strG;
        }
        Map<String, Integer> mapD = f0.d(b(), fVar);
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapD.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strA = rVarK != null ? rVarK.a(fVar, i10, strG) : null;
        return strA == null ? strG : strA;
    }

    @Override // cf.c, ze.e
    public ze.c c(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return fVar == this.f6963h ? this : super.c(fVar);
    }

    @Override // cf.c, ze.c
    public void d(ye.f fVar) {
        Set<String> setF;
        ae.r.f(fVar, "descriptor");
        if (this.f6921e.g() || (fVar.e() instanceof ye.d)) {
            return;
        }
        bf.r rVarK = f0.k(fVar, b());
        if (rVarK == null && !this.f6921e.k()) {
            setF = af.i0.a(fVar);
        } else if (rVarK != null) {
            setF = f0.d(b(), fVar).keySet();
        } else {
            Set<String> setA = af.i0.a(fVar);
            Map map = (Map) bf.y.a(b()).a(fVar, f0.e());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = nd.y0.b();
            }
            setF = nd.z0.f(setA, setKeySet);
        }
        for (String str : s0().keySet()) {
            if (!setF.contains(str) && !ae.r.b(str, this.f6962g)) {
                throw e0.g(str, s0().toString());
            }
        }
    }

    @Override // cf.c
    protected bf.h e0(String str) {
        ae.r.f(str, "tag");
        return (bf.h) nd.r0.f(s0(), str);
    }

    @Override // cf.c, af.o1, ze.e
    public boolean w() {
        return !this.f6965j && super.w();
    }

    @Override // cf.c
    /* JADX INFO: renamed from: w0 */
    public bf.u s0() {
        return this.f6961f;
    }

    @Override // ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        while (this.f6964i < fVar.f()) {
            int i10 = this.f6964i;
            this.f6964i = i10 + 1;
            String strV = V(fVar, i10);
            int i11 = this.f6964i - 1;
            this.f6965j = false;
            if (s0().containsKey(strV) || u0(fVar, i11)) {
                if (!this.f6921e.d() || !v0(fVar, i11, strV)) {
                    return i11;
                }
            }
        }
        return -1;
    }
}
