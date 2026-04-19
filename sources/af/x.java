package af;

import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T extends Enum<T>> implements we.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ye.f f852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final md.l f853c;

    static final class a extends ae.s implements zd.a<ye.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x<T> f854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x<T> xVar, String str) {
            super(0);
            this.f854a = xVar;
            this.f855b = str;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ye.f invoke() {
            ye.f fVar = ((x) this.f854a).f852b;
            return fVar == null ? this.f854a.c(this.f855b) : fVar;
        }
    }

    public x(String str, T[] tArr) {
        ae.r.f(str, "serialName");
        ae.r.f(tArr, "values");
        this.f851a = tArr;
        this.f853c = md.n.b(new a(this, str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(String str, T[] tArr, ye.f fVar) {
        this(str, tArr);
        ae.r.f(str, "serialName");
        ae.r.f(tArr, "values");
        ae.r.f(fVar, "descriptor");
        this.f852b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ye.f c(String str) {
        w wVar = new w(str, this.f851a.length);
        for (T t10 : this.f851a) {
            a1.m(wVar, t10.name(), false, 2, null);
        }
        return wVar;
    }

    @Override // we.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        int iB = eVar.B(getDescriptor());
        boolean z10 = false;
        if (iB >= 0 && iB < this.f851a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f851a[iB];
        }
        throw new we.g(iB + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.f851a.length);
    }

    @Override // we.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, T t10) {
        ae.r.f(fVar, "encoder");
        ae.r.f(t10, "value");
        int iV = nd.p.V(this.f851a, t10);
        if (iV != -1) {
            fVar.f(getDescriptor(), iV);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t10);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().a());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f851a);
        ae.r.e(string, "toString(this)");
        sb2.append(string);
        throw new we.g(sb2.toString());
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return (ye.f) this.f853c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
