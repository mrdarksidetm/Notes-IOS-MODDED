package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l3.g;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final androidx.collection.a<String, Typeface> f14709a = new androidx.collection.a<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f14710b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f14711c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final c0<String, ArrayList<n3.a<e>>> f14712d = new c0<>();

    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f14714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l3.e f14715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14716d;

        a(String str, Context context, l3.e eVar, int i10) {
            this.f14713a = str;
            this.f14714b = context;
            this.f14715c = eVar;
            this.f14716d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f14713a, this.f14714b, this.f14715c, this.f14716d);
        }
    }

    class b implements n3.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3.a f14717a;

        b(l3.a aVar) {
            this.f14717a = aVar;
        }

        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f14717a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f14719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l3.e f14720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14721d;

        c(String str, Context context, l3.e eVar, int i10) {
            this.f14718a = str;
            this.f14719b = context;
            this.f14720c = eVar;
            this.f14721d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f14718a, this.f14719b, this.f14720c, this.f14721d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements n3.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14722a;

        d(String str) {
            this.f14722a = str;
        }

        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f14711c) {
                c0<String, ArrayList<n3.a<e>>> c0Var = f.f14712d;
                ArrayList<n3.a<e>> arrayList = c0Var.get(this.f14722a);
                if (arrayList == null) {
                    return;
                }
                c0Var.remove(this.f14722a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f14723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f14724b;

        e(int i10) {
            this.f14723a = null;
            this.f14724b = i10;
        }

        e(Typeface typeface) {
            this.f14723a = typeface;
            this.f14724b = 0;
        }

        boolean a() {
            return this.f14724b == 0;
        }
    }

    private static String a(l3.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, l3.e eVar, int i10) {
        androidx.collection.a<String, Typeface> aVar = f14709a;
        Typeface typeface = aVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = l3.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = g3.b.b(context, null, aVarE.b(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            aVar.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, l3.e eVar, int i10, Executor executor, l3.a aVar) {
        String strA = a(eVar, i10);
        Typeface typeface = f14709a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f14711c) {
            c0<String, ArrayList<n3.a<e>>> c0Var = f14712d;
            ArrayList<n3.a<e>> arrayList = c0Var.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<n3.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c0Var.put(strA, arrayList2);
            c cVar = new c(strA, context, eVar, i10);
            if (executor == null) {
                executor = f14710b;
            }
            h.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, l3.e eVar, l3.a aVar, int i10, int i11) {
        String strA = a(eVar, i10);
        Typeface typeface = f14709a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, eVar, i10);
            aVar.b(eVarC);
            return eVarC.f14723a;
        }
        try {
            e eVar2 = (e) h.c(f14710b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f14723a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
