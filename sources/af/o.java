package af;

import ye.e;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements we.b<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f792a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f793b = new g1("kotlin.Char", e.c.f23981a);

    private o() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return Character.valueOf(eVar.i());
    }

    public void b(ze.f fVar, char c10) {
        ae.r.f(fVar, "encoder");
        fVar.t(c10);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f793b;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
