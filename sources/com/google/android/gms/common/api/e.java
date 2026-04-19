package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.k0;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import v8.h;
import v8.k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f8405a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f8406a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f8410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f8411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f8412g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Context f8414i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Looper f8417l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f8407b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f8408c = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f8413h = new z.a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Map f8415j = new z.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f8416k = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private t8.g f8418m = t8.g.m();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a.AbstractC0174a f8419n = o9.e.f16427c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final ArrayList f8420o = new ArrayList();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final ArrayList f8421p = new ArrayList();

        public a(Context context) {
            this.f8414i = context;
            this.f8417l = context.getMainLooper();
            this.f8411f = context.getPackageName();
            this.f8412g = context.getClass().getName();
        }

        public final w8.c a() {
            o9.a aVar = o9.a.f16415j;
            Map map = this.f8415j;
            com.google.android.gms.common.api.a aVar2 = o9.e.f16431g;
            if (map.containsKey(aVar2)) {
                aVar = (o9.a) this.f8415j.get(aVar2);
            }
            return new w8.c(this.f8406a, this.f8407b, this.f8413h, this.f8409d, this.f8410e, this.f8411f, this.f8412g, aVar, false);
        }
    }

    @Deprecated
    public interface b extends v8.d {
    }

    @Deprecated
    public interface c extends h {
    }

    public static Set<e> c() {
        Set<e> set = f8405a;
        synchronized (set) {
        }
        return set;
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, R extends u8.h, T extends com.google.android.gms.common.api.internal.b<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends u8.h, A>> T b(T t10) {
        throw new UnsupportedOperationException();
    }

    public <C extends a.f> C d(a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public Context e() {
        throw new UnsupportedOperationException();
    }

    public Looper f() {
        throw new UnsupportedOperationException();
    }

    public boolean g(k kVar) {
        throw new UnsupportedOperationException();
    }

    public void h() {
        throw new UnsupportedOperationException();
    }

    public void i(k0 k0Var) {
        throw new UnsupportedOperationException();
    }

    public void j(k0 k0Var) {
        throw new UnsupportedOperationException();
    }
}
