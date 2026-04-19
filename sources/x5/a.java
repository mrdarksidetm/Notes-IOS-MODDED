package x5;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22976a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f22977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static f f22978c;

    private a() {
    }

    public static final e a(Context context) {
        e eVar = f22977b;
        return eVar == null ? f22976a.b(context) : eVar;
    }

    private final synchronized e b(Context context) {
        e eVarA;
        e eVar = f22977b;
        if (eVar != null) {
            return eVar;
        }
        f fVar = f22978c;
        if (fVar == null || (eVarA = fVar.a()) == null) {
            Object applicationContext = context.getApplicationContext();
            f fVar2 = applicationContext instanceof f ? (f) applicationContext : null;
            eVarA = fVar2 != null ? fVar2.a() : g.a(context);
        }
        f22978c = null;
        f22977b = eVarA;
        return eVarA;
    }
}
