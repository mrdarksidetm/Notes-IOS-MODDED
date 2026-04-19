package bf;

import ae.i0;
import cf.e0;
import md.c0;
import ye.e;

/* JADX INFO: loaded from: classes2.dex */
final class p implements we.b<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f5842a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5843b = ye.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f23987a);

    private p() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        h hVarP = k.d(eVar).p();
        if (hVarP instanceof o) {
            return (o) hVarP;
        }
        throw e0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + i0.b(hVarP.getClass()), hVarP.toString());
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, o oVar) {
        ae.r.f(fVar, "encoder");
        ae.r.f(oVar, "value");
        k.h(fVar);
        if (oVar.d()) {
            fVar.F(oVar.a());
            return;
        }
        if (oVar.f() != null) {
            fVar.z(oVar.f()).F(oVar.a());
            return;
        }
        Long lR = i.r(oVar);
        if (lR != null) {
            fVar.C(lR.longValue());
            return;
        }
        c0 c0VarH = je.c0.h(oVar.a());
        if (c0VarH != null) {
            fVar.z(xe.a.C(c0.f15542b).getDescriptor()).C(c0VarH.m());
            return;
        }
        Double dH = i.h(oVar);
        if (dH != null) {
            fVar.h(dH.doubleValue());
            return;
        }
        Boolean boolE = i.e(oVar);
        if (boolE != null) {
            fVar.n(boolE.booleanValue());
        } else {
            fVar.F(oVar.a());
        }
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5843b;
    }
}
