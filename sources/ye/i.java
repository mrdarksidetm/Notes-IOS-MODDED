package ye;

import ae.r;
import ae.s;
import af.h1;
import je.v;
import md.i0;
import nd.p;
import ye.k;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends s implements l<ye.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24008a = new a();

        a() {
            super(1);
        }

        public final void a(ye.a aVar) {
            r.f(aVar, "$this$null");
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(ye.a aVar) {
            a(aVar);
            return i0.f15558a;
        }
    }

    public static final f a(String str, e eVar) {
        r.f(str, "serialName");
        r.f(eVar, "kind");
        if (!v.v(str)) {
            return h1.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String str, j jVar, f[] fVarArr, l<? super ye.a, i0> lVar) {
        r.f(str, "serialName");
        r.f(jVar, "kind");
        r.f(fVarArr, "typeParameters");
        r.f(lVar, "builder");
        if (!(!v.v(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!r.b(jVar, k.a.f24011a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        ye.a aVar = new ye.a(str);
        lVar.invoke(aVar);
        return new g(str, jVar, aVar.f().size(), p.E0(fVarArr), aVar);
    }

    public static /* synthetic */ f c(String str, j jVar, f[] fVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = a.f24008a;
        }
        return b(str, jVar, fVarArr, lVar);
    }
}
