package m5;

import ae.i0;
import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import o5.a;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15442a = a.f15443a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f15444b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15443a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f15445c = i0.b(f.class).b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final md.l<n5.a> f15446d = md.n.b(C0353a.f15448a);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static g f15447e = b.f15414a;

        /* JADX INFO: renamed from: m5.f$a$a, reason: collision with other inner class name */
        static final class C0353a extends s implements zd.a<n5.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0353a f15448a = new C0353a();

            C0353a() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n5.a invoke() {
                WindowLayoutComponent windowLayoutComponentG;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    e eVar = classLoader != null ? new e(classLoader, new i5.d(classLoader)) : null;
                    if (eVar == null || (windowLayoutComponentG = eVar.g()) == null) {
                        return null;
                    }
                    a.C0369a c0369a = o5.a.f16361a;
                    r.e(classLoader, "loader");
                    return c0369a.a(windowLayoutComponentG, new i5.d(classLoader));
                } catch (Throwable unused) {
                    if (!a.f15444b) {
                        return null;
                    }
                    Log.d(a.f15445c, "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        private a() {
        }

        public final n5.a c() {
            return f15446d.getValue();
        }

        public final f d(Context context) {
            r.f(context, "context");
            n5.a aVarC = c();
            if (aVarC == null) {
                aVarC = androidx.window.layout.adapter.sidecar.b.f5019c.a(context);
            }
            return f15447e.a(new i(n.f15472b, aVarC));
        }
    }

    oe.e<k> a(Activity activity);

    default oe.e<k> b(Context context) {
        r.f(context, "context");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        oe.e<k> eVarA = activity != null ? a(activity) : null;
        if (eVarA != null) {
            return eVarA;
        }
        throw new md.r("Must override windowLayoutInfo(context) and provide an implementation.");
    }
}
