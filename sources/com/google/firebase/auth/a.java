package com.google.firebase.auth;

import android.app.Activity;
import ba.l0;
import ba.r0;
import com.google.firebase.auth.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f8911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f8912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.AbstractC0181b f8913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Executor f8914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Activity f8916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.a f8917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l0 f8918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r0 f8919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8922l;

    /* JADX INFO: renamed from: com.google.firebase.auth.a$a, reason: collision with other inner class name */
    public static final class C0180a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f8923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f8925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b.AbstractC0181b f8926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f8927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Activity f8928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b.a f8929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private l0 f8930h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private r0 f8931i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f8932j;

        public C0180a(FirebaseAuth firebaseAuth) {
            this.f8923a = (FirebaseAuth) w8.m.k(firebaseAuth);
        }

        public final a a() {
            boolean z10;
            String str;
            w8.m.l(this.f8923a, "FirebaseAuth instance cannot be null");
            w8.m.l(this.f8925c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            w8.m.l(this.f8926d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f8927e = this.f8923a.E0();
            if (this.f8925c.longValue() < 0 || this.f8925c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            l0 l0Var = this.f8930h;
            if (l0Var == null) {
                w8.m.f(this.f8924b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                w8.m.b(!this.f8932j, "You cannot require sms validation without setting a multi-factor session.");
                w8.m.b(this.f8931i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (l0Var != null && ((ca.r) l0Var).B()) {
                    w8.m.e(this.f8924b);
                    z10 = this.f8931i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    w8.m.b(this.f8931i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z10 = this.f8924b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                w8.m.b(z10, str);
            }
            return new a(this.f8923a, this.f8925c, this.f8926d, this.f8927e, this.f8924b, this.f8928f, this.f8929g, this.f8930h, this.f8931i, this.f8932j);
        }

        public final C0180a b(Activity activity) {
            this.f8928f = activity;
            return this;
        }

        public final C0180a c(b.AbstractC0181b abstractC0181b) {
            this.f8926d = abstractC0181b;
            return this;
        }

        public final C0180a d(b.a aVar) {
            this.f8929g = aVar;
            return this;
        }

        public final C0180a e(r0 r0Var) {
            this.f8931i = r0Var;
            return this;
        }

        public final C0180a f(l0 l0Var) {
            this.f8930h = l0Var;
            return this;
        }

        public final C0180a g(String str) {
            this.f8924b = str;
            return this;
        }

        public final C0180a h(Long l10, TimeUnit timeUnit) {
            this.f8925c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    private a(FirebaseAuth firebaseAuth, Long l10, b.AbstractC0181b abstractC0181b, Executor executor, String str, Activity activity, b.a aVar, l0 l0Var, r0 r0Var, boolean z10) {
        this.f8911a = firebaseAuth;
        this.f8915e = str;
        this.f8912b = l10;
        this.f8913c = abstractC0181b;
        this.f8916f = activity;
        this.f8914d = executor;
        this.f8917g = aVar;
        this.f8918h = l0Var;
        this.f8919i = r0Var;
        this.f8920j = z10;
    }

    public final Activity a() {
        return this.f8916f;
    }

    public final void b(boolean z10) {
        this.f8921k = true;
    }

    public final FirebaseAuth c() {
        return this.f8911a;
    }

    public final void d(boolean z10) {
        this.f8922l = true;
    }

    public final l0 e() {
        return this.f8918h;
    }

    public final b.a f() {
        return this.f8917g;
    }

    public final b.AbstractC0181b g() {
        return this.f8913c;
    }

    public final r0 h() {
        return this.f8919i;
    }

    public final Long i() {
        return this.f8912b;
    }

    public final String j() {
        return this.f8915e;
    }

    public final Executor k() {
        return this.f8914d;
    }

    public final boolean l() {
        return this.f8921k;
    }

    public final boolean m() {
        return this.f8920j;
    }

    public final boolean n() {
        return this.f8922l;
    }

    public final boolean o() {
        return this.f8918h != null;
    }
}
