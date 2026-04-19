package g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.a;
import androidx.core.content.res.b;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f11423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.a<String, Typeface> f11424b;

    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.e f11425a;

        public a(b.e eVar) {
            this.f11425a = eVar;
        }

        @Override // l3.g.c
        public void a(int i10) {
            b.e eVar = this.f11425a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // l3.g.c
        public void b(Typeface typeface) {
            b.e eVar = this.f11425a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f11423a = i10 >= 29 ? new g() : i10 >= 28 ? new f() : i10 >= 26 ? new e() : d.j() ? new d() : new c();
        f11424b = new androidx.collection.a<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f11423a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, a.b bVar, Resources resources, int i10, String str, int i11, int i12, b.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof a.e) {
            a.e eVar2 = (a.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            boolean z11 = !z10 ? eVar != null : eVar2.a() != 0;
            int iD = z10 ? eVar2.d() : -1;
            typefaceA = l3.g.c(context, eVar2.b(), i12, z11, iD, b.e.e(handler), new a(eVar));
        } else {
            typefaceA = f11423a.a(context, (a.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f11424b.put(e(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f11423a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f11424b.put(e(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f11424b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
