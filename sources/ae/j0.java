package ae;

/* JADX INFO: loaded from: classes2.dex */
public class j0 {
    public he.f a(kotlin.jvm.internal.b bVar) {
        return bVar;
    }

    public he.c b(Class cls) {
        return new h(cls);
    }

    public he.e c(Class cls, String str) {
        return new x(cls, str);
    }

    public he.g d(u uVar) {
        return uVar;
    }

    public he.h e(y yVar) {
        return yVar;
    }

    public he.i f(a0 a0Var) {
        return a0Var;
    }

    public String g(n nVar) {
        String string = nVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(s sVar) {
        return g(sVar);
    }
}
