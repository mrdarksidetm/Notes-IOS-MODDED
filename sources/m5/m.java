package m5;

import ae.r;
import ae.s;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15468a = a.f15469a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15469a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static zd.l<? super m, ? extends m> f15470b = C0355a.f15471a;

        /* JADX INFO: renamed from: m5.m$a$a, reason: collision with other inner class name */
        static final class C0355a extends s implements zd.l<m, m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0355a f15471a = new C0355a();

            C0355a() {
                super(1);
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m invoke(m mVar) {
                r.f(mVar, "it");
                return mVar;
            }
        }

        private a() {
        }

        public final m a() {
            return f15470b.invoke(n.f15472b);
        }
    }

    static m b() {
        return f15468a.a();
    }

    l a(Activity activity);

    default l c(Context context) {
        r.f(context, "context");
        throw new md.r("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    l d(Activity activity);
}
