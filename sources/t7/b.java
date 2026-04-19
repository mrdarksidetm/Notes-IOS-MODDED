package t7;

import ae.s;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import k1.m;
import md.l;
import md.n;
import md.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f21301a = n.a(p.f15571c, a.f21302a);

    static final class a extends s implements zd.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21302a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? k1.l.f14359b.a() : m.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f21301a.getValue();
    }
}
