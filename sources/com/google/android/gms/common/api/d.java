package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import u8.h;
import v8.g0;
import v8.l;
import v8.r;
import w8.c;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<O extends a.d> {
    protected final com.google.android.gms.common.api.internal.c zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final v8.b zaf;
    private final Looper zag;
    private final int zah;
    private final e zai;
    private final l zaj;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f8400c = new C0176a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f8401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f8402b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.d$a$a, reason: collision with other inner class name */
        public static class C0176a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private l f8403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f8404b;

            public a a() {
                if (this.f8403a == null) {
                    this.f8403a = new v8.a();
                }
                if (this.f8404b == null) {
                    this.f8404b = Looper.getMainLooper();
                }
                return new a(this.f8403a, this.f8404b);
            }

            public C0176a b(Looper looper) {
                m.l(looper, "Looper must not be null.");
                this.f8404b = looper;
                return this;
            }

            public C0176a c(l lVar) {
                m.l(lVar, "StatusExceptionMapper must not be null.");
                this.f8403a = lVar;
                return this;
            }
        }

        private a(l lVar, Account account, Looper looper) {
            this.f8401a = lVar;
            this.f8402b = looper;
        }
    }

    public d(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    @Deprecated
    public d(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, l lVar) {
        a.C0176a c0176a = new a.C0176a();
        c0176a.c(lVar);
        c0176a.b(activity.getMainLooper());
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o10, c0176a.a());
    }

    private d(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        m.l(context, "Null context is not permitted.");
        m.l(aVar, "Api must not be null.");
        m.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) m.l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f8402b;
        v8.b bVarA = v8.b.a(aVar, dVar, attributionTag);
        this.zaf = bVarA;
        this.zai = new r(this);
        com.google.android.gms.common.api.internal.c cVarU = com.google.android.gms.common.api.internal.c.u(context2);
        this.zaa = cVarU;
        this.zah = cVarU.l();
        this.zaj = aVar2.f8401a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            o.j(activity, cVarU, bVarA);
        }
        cVarU.I(this);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, Looper looper, l lVar) {
        a.C0176a c0176a = new a.C0176a();
        c0176a.b(looper);
        c0176a.c(lVar);
        this(context, aVar, o10, c0176a.a());
    }

    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, l lVar) {
        a.C0176a c0176a = new a.C0176a();
        c0176a.c(lVar);
        this(context, aVar, o10, c0176a.a());
    }

    private final com.google.android.gms.common.api.internal.b zad(int i10, com.google.android.gms.common.api.internal.b bVar) {
        bVar.zak();
        this.zaa.D(this, i10, bVar);
        return bVar;
    }

    private final Task zae(int i10, j jVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.E(this, i10, jVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public e asGoogleApiClient() {
        return this.zai;
    }

    protected c.a createClientSettingsBuilder() {
        Account accountR;
        GoogleSignInAccount googleSignInAccountN;
        GoogleSignInAccount googleSignInAccountN2;
        c.a aVar = new c.a();
        a.d dVar = this.zae;
        if (!(dVar instanceof a.d.b) || (googleSignInAccountN2 = ((a.d.b) dVar).n()) == null) {
            a.d dVar2 = this.zae;
            accountR = dVar2 instanceof a.d.InterfaceC0175a ? ((a.d.InterfaceC0175a) dVar2).r() : null;
        } else {
            accountR = googleSignInAccountN2.r();
        }
        aVar.d(accountR);
        a.d dVar3 = this.zae;
        aVar.c((!(dVar3 instanceof a.d.b) || (googleSignInAccountN = ((a.d.b) dVar3).n()) == null) ? Collections.emptySet() : googleSignInAccountN.C());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.w(this);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends h, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(j<A, TResult> jVar) {
        return zae(2, jVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends h, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(j<A, TResult> jVar) {
        return zae(0, jVar);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.g<A, ?>, U extends k<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        m.k(t10);
        m.k(u10);
        m.l(t10.b(), "Listener has already been released.");
        m.l(u10.a(), "Listener has already been released.");
        m.b(w8.k.b(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.x(this, t10, u10, new Runnable() { // from class: u8.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.h<A, ?> hVar) {
        m.k(hVar);
        m.l(hVar.f8470a.b(), "Listener has already been released.");
        m.l(hVar.f8471b.a(), "Listener has already been released.");
        return this.zaa.x(this, hVar.f8470a, hVar.f8471b, hVar.f8472c);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(e.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(e.a<?> aVar, int i10) {
        m.l(aVar, "Listener key cannot be null.");
        return this.zaa.y(this, aVar, i10);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends h, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(j<A, TResult> jVar) {
        return zae(1, jVar);
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final v8.b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.e<L> registerListener(L l10, String str) {
        return com.google.android.gms.common.api.internal.f.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, v vVar) {
        w8.c cVarA = createClientSettingsBuilder().a();
        a.f fVarBuildClient = ((a.AbstractC0174a) m.k(this.zad.a())).buildClient(this.zab, looper, cVarA, this.zae, (e.b) vVar, (e.c) vVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (fVarBuildClient instanceof v8.g)) {
            ((v8.g) fVarBuildClient).d(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    public final g0 zac(Context context, Handler handler) {
        return new g0(context, handler, createClientSettingsBuilder().a());
    }
}
