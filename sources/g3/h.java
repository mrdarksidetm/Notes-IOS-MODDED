package g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.a;
import com.google.android.gms.common.api.a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, a.c> f11442a = new ConcurrentHashMap<>();

    class a implements b<g.b> {
        a() {
        }

        @Override // g3.h.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // g3.h.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    h() {
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return (T) f(tArr, (i10 & 1) == 0 ? RCHTTPStatusCodes.BAD_REQUEST : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(bVar.a(t11) - i10) * 2) + (bVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, a.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        throw null;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = i.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (i.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = i.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (i.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i10) {
        return (g.b) e(bVarArr, i10, new a());
    }
}
