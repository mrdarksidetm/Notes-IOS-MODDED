package g2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ae.s implements zd.p<a<md.g<? extends Boolean>>, a<md.g<? extends Boolean>>, a<md.g<? extends Boolean>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f11416a = new u();

    public u() {
        super(2);
    }

    @Override // zd.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a<md.g<? extends Boolean>> invoke(a<md.g<? extends Boolean>> aVar, a<md.g<? extends Boolean>> aVar2) {
        String strB;
        md.g gVarA;
        if (aVar == null || (strB = aVar.b()) == null) {
            strB = aVar2.b();
        }
        if (aVar == null || (gVarA = aVar.a()) == null) {
            gVarA = aVar2.a();
        }
        return new a<>(strB, gVarA);
    }
}
