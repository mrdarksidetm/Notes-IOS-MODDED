package bf;

import ae.i0;
import cf.e0;
import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements we.b<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f5853a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5854b = ye.i.c("kotlinx.serialization.json.JsonPrimitive", e.i.f23987a, new ye.f[0], null, 8, null);

    private x() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        h hVarP = k.d(eVar).p();
        if (hVarP instanceof w) {
            return (w) hVarP;
        }
        throw e0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + i0.b(hVarP.getClass()), hVarP.toString());
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, w wVar) {
        ae.r.f(fVar, "encoder");
        ae.r.f(wVar, "value");
        k.h(fVar);
        if (wVar instanceof s) {
            fVar.D(t.f5845a, s.INSTANCE);
        } else {
            fVar.D(p.f5842a, (o) wVar);
        }
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5854b;
    }
}
