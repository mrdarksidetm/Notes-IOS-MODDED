package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import ba.a0;
import ba.c0;
import ba.i0;
import ba.j0;
import ba.n1;
import ba.o0;
import ba.r0;
import ba.u0;
import ba.v0;
import ba.y0;
import ca.a1;
import ca.c1;
import ca.c2;
import ca.g1;
import ca.h1;
import ca.k0;
import ca.m1;
import ca.o1;
import ca.p0;
import ca.w0;
import ca.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzadn;
import com.google.android.gms.internal.p002firebaseauthapi.zzadx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.b;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseAuth implements ca.b {
    private final Executor A;
    private String B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x9.f f8883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f8884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ca.a> f8885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<a> f8886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzabj f8887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a0 f8888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ca.h f8889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f8890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f8892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w0 f8894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RecaptchaAction f8895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RecaptchaAction f8896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RecaptchaAction f8897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RecaptchaAction f8898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final RecaptchaAction f8899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RecaptchaAction f8900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c1 f8901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h1 f8902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ca.c f8903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ma.b<aa.a> f8904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ma.b<la.i> f8905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a1 f8906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Executor f8907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Executor f8908z;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    class c implements o1 {
        c() {
        }

        @Override // ca.o1
        public final void a(zzagl zzaglVar, a0 a0Var) {
            w8.m.k(zzaglVar);
            w8.m.k(a0Var);
            a0Var.U(zzaglVar);
            FirebaseAuth.this.d0(a0Var, zzaglVar, true);
        }
    }

    class d implements z, o1 {
        d() {
        }

        @Override // ca.o1
        public final void a(zzagl zzaglVar, a0 a0Var) {
            w8.m.k(zzaglVar);
            w8.m.k(a0Var);
            a0Var.U(zzaglVar);
            FirebaseAuth.this.e0(a0Var, zzaglVar, true, true);
        }

        @Override // ca.z
        public final void zza(Status status) {
            if (status.x() == 17011 || status.x() == 17021 || status.x() == 17005 || status.x() == 17091) {
                FirebaseAuth.this.D();
            }
        }
    }

    private FirebaseAuth(x9.f fVar, zzabj zzabjVar, c1 c1Var, h1 h1Var, ca.c cVar, ma.b<aa.a> bVar, ma.b<la.i> bVar2, @y9.a Executor executor, @y9.b Executor executor2, @y9.c Executor executor3, @y9.d Executor executor4) {
        zzagl zzaglVarC;
        this.f8884b = new CopyOnWriteArrayList();
        this.f8885c = new CopyOnWriteArrayList();
        this.f8886d = new CopyOnWriteArrayList();
        this.f8890h = new Object();
        this.f8892j = new Object();
        this.f8895m = RecaptchaAction.custom("getOobCode");
        this.f8896n = RecaptchaAction.custom("signInWithPassword");
        this.f8897o = RecaptchaAction.custom("signUpPassword");
        this.f8898p = RecaptchaAction.custom("sendVerificationCode");
        this.f8899q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f8900r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f8883a = (x9.f) w8.m.k(fVar);
        this.f8887e = (zzabj) w8.m.k(zzabjVar);
        c1 c1Var2 = (c1) w8.m.k(c1Var);
        this.f8901s = c1Var2;
        this.f8889g = new ca.h();
        h1 h1Var2 = (h1) w8.m.k(h1Var);
        this.f8902t = h1Var2;
        this.f8903u = (ca.c) w8.m.k(cVar);
        this.f8904v = bVar;
        this.f8905w = bVar2;
        this.f8907y = executor2;
        this.f8908z = executor3;
        this.A = executor4;
        a0 a0VarA = c1Var2.a();
        this.f8888f = a0VarA;
        if (a0VarA != null && (zzaglVarC = c1Var2.c(a0VarA)) != null) {
            h0(this, this.f8888f, zzaglVarC, false, false);
        }
        h1Var2.b(this);
    }

    public FirebaseAuth(x9.f fVar, ma.b<aa.a> bVar, ma.b<la.i> bVar2, @y9.a Executor executor, @y9.b Executor executor2, @y9.c Executor executor3, @y9.c ScheduledExecutorService scheduledExecutorService, @y9.d Executor executor4) {
        this(fVar, new zzabj(fVar, executor2, scheduledExecutorService), new c1(fVar.l(), fVar.r()), h1.f(), ca.c.a(), bVar, bVar2, executor, executor2, executor3, executor4);
    }

    private static a1 J0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f8906x == null) {
            firebaseAuth.f8906x = new a1((x9.f) w8.m.k(firebaseAuth.f8883a));
        }
        return firebaseAuth.f8906x;
    }

    private final Task<ba.i> L(ba.j jVar, a0 a0Var, boolean z10) {
        return new com.google.firebase.auth.d(this, z10, a0Var, jVar).c(this, this.f8893k, this.f8895m, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<Void> R(a0 a0Var, g1 g1Var) {
        w8.m.k(a0Var);
        return this.f8887e.zza(this.f8883a, a0Var, g1Var);
    }

    private final Task<ba.i> Y(String str, String str2, String str3, a0 a0Var, boolean z10) {
        return new w(this, str, z10, a0Var, str2, str3).c(this, str3, this.f8896n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.AbstractC0181b b0(String str, b.AbstractC0181b abstractC0181b) {
        return (this.f8889g.g() && str != null && str.equals(this.f8889g.d())) ? new k(this, abstractC0181b) : abstractC0181b;
    }

    private static void g0(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying auth state listeners about user ( " + a0Var.d() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.A.execute(new v(firebaseAuth));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) x9.f.n().j(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(x9.f fVar) {
        return (FirebaseAuth) fVar.j(FirebaseAuth.class);
    }

    private static void h0(FirebaseAuth firebaseAuth, a0 a0Var, zzagl zzaglVar, boolean z10, boolean z11) {
        boolean z12;
        w8.m.k(a0Var);
        w8.m.k(zzaglVar);
        boolean z13 = true;
        boolean z14 = firebaseAuth.f8888f != null && a0Var.d().equals(firebaseAuth.f8888f.d());
        if (z14 || !z11) {
            a0 a0Var2 = firebaseAuth.f8888f;
            if (a0Var2 == null) {
                z12 = true;
            } else {
                boolean z15 = !z14 || (a0Var2.X().zzc().equals(zzaglVar.zzc()) ^ true);
                z12 = z14 ? false : true;
                z13 = z15;
            }
            w8.m.k(a0Var);
            if (firebaseAuth.f8888f == null || !a0Var.d().equals(firebaseAuth.o())) {
                firebaseAuth.f8888f = a0Var;
            } else {
                firebaseAuth.f8888f.S(a0Var.B());
                if (!a0Var.D()) {
                    firebaseAuth.f8888f.V();
                }
                List<j0> listB = a0Var.A().b();
                List<n1> listZ = a0Var.Z();
                firebaseAuth.f8888f.Y(listB);
                firebaseAuth.f8888f.W(listZ);
            }
            if (z10) {
                firebaseAuth.f8901s.f(firebaseAuth.f8888f);
            }
            if (z13) {
                a0 a0Var3 = firebaseAuth.f8888f;
                if (a0Var3 != null) {
                    a0Var3.U(zzaglVar);
                }
                q0(firebaseAuth, firebaseAuth.f8888f);
            }
            if (z12) {
                g0(firebaseAuth, firebaseAuth.f8888f);
            }
            if (z10) {
                firebaseAuth.f8901s.d(a0Var, zzaglVar);
            }
            a0 a0Var4 = firebaseAuth.f8888f;
            if (a0Var4 != null) {
                J0(firebaseAuth).d(a0Var4.X());
            }
        }
    }

    public static void i0(com.google.firebase.auth.a aVar) {
        String strE;
        String strG;
        if (!aVar.o()) {
            FirebaseAuth firebaseAuthC = aVar.c();
            String strE2 = w8.m.e(aVar.j());
            if ((aVar.f() != null) || !zzaer.zza(strE2, aVar.g(), aVar.a(), aVar.k())) {
                firebaseAuthC.f8903u.b(firebaseAuthC, strE2, aVar.a(), firebaseAuthC.I0(), aVar.l(), aVar.n(), firebaseAuthC.f8898p).addOnCompleteListener(new i(firebaseAuthC, aVar, strE2));
                return;
            }
            return;
        }
        FirebaseAuth firebaseAuthC2 = aVar.c();
        ca.r rVar = (ca.r) w8.m.k(aVar.e());
        if (rVar.B()) {
            strG = w8.m.e(aVar.j());
            strE = strG;
        } else {
            r0 r0Var = (r0) w8.m.k(aVar.h());
            strE = w8.m.e(r0Var.d());
            strG = r0Var.g();
        }
        if (aVar.f() == null || !zzaer.zza(strE, aVar.g(), aVar.a(), aVar.k())) {
            firebaseAuthC2.f8903u.b(firebaseAuthC2, strG, aVar.a(), firebaseAuthC2.I0(), aVar.l(), aVar.n(), rVar.B() ? firebaseAuthC2.f8899q : firebaseAuthC2.f8900r).addOnCompleteListener(new h(firebaseAuthC2, aVar, strE));
        }
    }

    public static void k0(final x9.l lVar, com.google.firebase.auth.a aVar, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final b.AbstractC0181b abstractC0181bZza = zzaer.zza(str, aVar.g(), null);
        aVar.k().execute(new Runnable() { // from class: ba.a2
            @Override // java.lang.Runnable
            public final void run() {
                abstractC0181bZza.onVerificationFailed(lVar);
            }
        });
    }

    private static void q0(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying id token listeners about user ( " + a0Var.d() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.A.execute(new t(firebaseAuth, new na.b(a0Var != null ? a0Var.zzd() : null)));
    }

    private final boolean r0(String str) {
        ba.f fVarC = ba.f.c(str);
        return (fVarC == null || TextUtils.equals(this.f8893k, fVarC.d())) ? false : true;
    }

    public Task<ba.i> A(String str) {
        w8.m.e(str);
        return this.f8887e.zza(this.f8883a, str, this.f8893k, new c());
    }

    public final Executor A0() {
        return this.f8907y;
    }

    public Task<ba.i> B(String str, String str2) {
        w8.m.e(str);
        w8.m.e(str2);
        return Y(str, str2, this.f8893k, null, false);
    }

    public Task<ba.i> C(String str, String str2) {
        return z(ba.k.b(str, str2));
    }

    public final Executor C0() {
        return this.f8908z;
    }

    public void D() {
        G0();
        a1 a1Var = this.f8906x;
        if (a1Var != null) {
            a1Var.b();
        }
    }

    public Task<ba.i> E(Activity activity, ba.n nVar) {
        w8.m.k(nVar);
        w8.m.k(activity);
        TaskCompletionSource<ba.i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f8902t.c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        p0.d(activity.getApplicationContext(), this);
        nVar.c(activity);
        return taskCompletionSource.getTask();
    }

    public final Executor E0() {
        return this.A;
    }

    public void F() {
        synchronized (this.f8890h) {
            this.f8891i = zzadx.zza();
        }
    }

    public void G(String str, int i10) {
        w8.m.e(str);
        w8.m.b(i10 >= 0 && i10 <= 65535, "Port number must be in the range 0-65535");
        zzafb.zza(this.f8883a, str, i10);
    }

    public final void G0() {
        w8.m.k(this.f8901s);
        a0 a0Var = this.f8888f;
        if (a0Var != null) {
            c1 c1Var = this.f8901s;
            w8.m.k(a0Var);
            c1Var.e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.d()));
            this.f8888f = null;
        }
        this.f8901s.e("com.google.firebase.auth.FIREBASE_USER");
        q0(this, null);
        g0(this, null);
    }

    public Task<String> H(String str) {
        w8.m.e(str);
        return this.f8887e.zzd(this.f8883a, str, this.f8893k);
    }

    public final Task<zzagh> I() {
        return this.f8887e.zza();
    }

    final boolean I0() {
        return zzadn.zza(i().l());
    }

    public final Task<ba.i> J(Activity activity, ba.n nVar, a0 a0Var) {
        w8.m.k(activity);
        w8.m.k(nVar);
        w8.m.k(a0Var);
        TaskCompletionSource<ba.i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f8902t.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        p0.e(activity.getApplicationContext(), this, a0Var);
        nVar.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<Void> K(ba.e eVar, String str) {
        w8.m.e(str);
        if (this.f8891i != null) {
            if (eVar == null) {
                eVar = ba.e.H();
            }
            eVar.G(this.f8891i);
        }
        return this.f8887e.zza(this.f8883a, eVar, str);
    }

    public final Task<Void> M(a0 a0Var) {
        w8.m.k(a0Var);
        return this.f8887e.zza(a0Var, new p(this, a0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<ba.i> N(a0 a0Var, ba.h hVar) {
        w8.m.k(hVar);
        w8.m.k(a0Var);
        return hVar instanceof ba.j ? new m(this, a0Var, (ba.j) hVar.z()).c(this, a0Var.C(), this.f8897o, "EMAIL_PASSWORD_PROVIDER") : this.f8887e.zza(this.f8883a, a0Var, hVar.z(), (String) null, (g1) new d());
    }

    public final Task<Void> O(a0 a0Var, i0 i0Var, String str) {
        w8.m.k(a0Var);
        w8.m.k(i0Var);
        return i0Var instanceof ba.p0 ? this.f8887e.zza(this.f8883a, (ba.p0) i0Var, a0Var, str, new c()) : i0Var instanceof v0 ? this.f8887e.zza(this.f8883a, (v0) i0Var, a0Var, str, this.f8893k, new c()) : Tasks.forException(zzadg.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> P(a0 a0Var, o0 o0Var) {
        w8.m.k(a0Var);
        w8.m.k(o0Var);
        return this.f8887e.zza(this.f8883a, a0Var, (o0) o0Var.z(), (g1) new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> Q(a0 a0Var, ba.c1 c1Var) {
        w8.m.k(a0Var);
        w8.m.k(c1Var);
        return this.f8887e.zza(this.f8883a, a0Var, c1Var, (g1) new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> S(a0 a0Var, String str) {
        w8.m.k(a0Var);
        w8.m.e(str);
        return this.f8887e.zza(this.f8883a, a0Var, str, this.f8893k, (g1) new d()).continueWithTask(new q(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.u] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<c0> T(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            return Tasks.forException(zzadg.zza(new Status(17495)));
        }
        zzagl zzaglVarX = a0Var.X();
        return (!zzaglVarX.zzg() || z10) ? this.f8887e.zza(this.f8883a, a0Var, zzaglVarX.zzd(), (g1) new u(this)) : Tasks.forResult(k0.a(zzaglVarX.zzc()));
    }

    public final Task<ba.i> U(i0 i0Var, ca.r rVar, a0 a0Var) {
        w8.m.k(i0Var);
        w8.m.k(rVar);
        if (i0Var instanceof ba.p0) {
            return this.f8887e.zza(this.f8883a, a0Var, (ba.p0) i0Var, w8.m.e(rVar.zzc()), new c());
        }
        if (i0Var instanceof v0) {
            return this.f8887e.zza(this.f8883a, a0Var, (v0) i0Var, w8.m.e(rVar.zzc()), this.f8893k, new c());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task<y0> V(ca.r rVar) {
        w8.m.k(rVar);
        return this.f8887e.zza(rVar, this.f8893k).continueWithTask(new r(this));
    }

    public final Task<zzagm> W(String str) {
        return this.f8887e.zza(this.f8893k, str);
    }

    public final Task<Void> X(String str, String str2, ba.e eVar) {
        w8.m.e(str);
        w8.m.e(str2);
        if (eVar == null) {
            eVar = ba.e.H();
        }
        String str3 = this.f8891i;
        if (str3 != null) {
            eVar.G(str3);
        }
        return this.f8887e.zza(str, str2, eVar);
    }

    public void a(a aVar) {
        this.f8886d.add(aVar);
        this.A.execute(new s(this, aVar));
    }

    final b.AbstractC0181b a0(com.google.firebase.auth.a aVar, b.AbstractC0181b abstractC0181b, m1 m1Var) {
        return aVar.l() ? abstractC0181b : new j(this, aVar, m1Var, abstractC0181b);
    }

    public void b(b bVar) {
        this.f8884b.add(bVar);
        this.A.execute(new g(this, bVar));
    }

    public Task<Void> c(String str) {
        w8.m.e(str);
        return this.f8887e.zza(this.f8883a, str, this.f8893k);
    }

    public Task<ba.d> d(String str) {
        w8.m.e(str);
        return this.f8887e.zzb(this.f8883a, str, this.f8893k);
    }

    public final void d0(a0 a0Var, zzagl zzaglVar, boolean z10) {
        e0(a0Var, zzaglVar, true, false);
    }

    public Task<Void> e(String str, String str2) {
        w8.m.e(str);
        w8.m.e(str2);
        return this.f8887e.zza(this.f8883a, str, str2, this.f8893k);
    }

    final void e0(a0 a0Var, zzagl zzaglVar, boolean z10, boolean z11) {
        h0(this, a0Var, zzaglVar, true, z11);
    }

    public Task<ba.i> f(String str, String str2) {
        w8.m.e(str);
        w8.m.e(str2);
        return new l(this, str, str2).c(this, this.f8893k, this.f8897o, "EMAIL_PASSWORD_PROVIDER");
    }

    public final synchronized void f0(w0 w0Var) {
        this.f8894l = w0Var;
    }

    @Deprecated
    public Task<u0> g(String str) {
        w8.m.e(str);
        return this.f8887e.zzc(this.f8883a, str, this.f8893k);
    }

    public Task<c0> h(boolean z10) {
        return T(this.f8888f, z10);
    }

    public x9.f i() {
        return this.f8883a;
    }

    public a0 j() {
        return this.f8888f;
    }

    public final void j0(com.google.firebase.auth.a aVar, m1 m1Var) {
        long jLongValue = aVar.i().longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String strE = w8.m.e(aVar.j());
        String strC = m1Var.c();
        String strB = m1Var.b();
        String strD = m1Var.d();
        if (zzag.zzc(strC) && m0() != null && m0().d("PHONE_PROVIDER")) {
            strC = "NO_RECAPTCHA";
        }
        String str = strC;
        zzagz zzagzVar = new zzagz(strE, jLongValue, aVar.f() != null, this.f8891i, this.f8893k, strD, strB, str, I0());
        b.AbstractC0181b abstractC0181bB0 = b0(strE, aVar.g());
        if (TextUtils.isEmpty(m1Var.d())) {
            abstractC0181bB0 = a0(aVar, abstractC0181bB0, m1.a().d(strD).c(str).b(strB).a());
        }
        this.f8887e.zza(this.f8883a, zzagzVar, abstractC0181bB0, aVar.a(), aVar.k());
    }

    public String k() {
        return this.B;
    }

    public ba.w l() {
        return this.f8889g;
    }

    public String m() {
        String str;
        synchronized (this.f8890h) {
            str = this.f8891i;
        }
        return str;
    }

    public final synchronized w0 m0() {
        return this.f8894l;
    }

    public String n() {
        String str;
        synchronized (this.f8892j) {
            str = this.f8893k;
        }
        return str;
    }

    public final Task<ba.i> n0(Activity activity, ba.n nVar, a0 a0Var) {
        w8.m.k(activity);
        w8.m.k(nVar);
        w8.m.k(a0Var);
        TaskCompletionSource<ba.i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f8902t.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        p0.e(activity.getApplicationContext(), this, a0Var);
        nVar.b(activity);
        return taskCompletionSource.getTask();
    }

    public String o() {
        a0 a0Var = this.f8888f;
        if (a0Var == null) {
            return null;
        }
        return a0Var.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> o0(a0 a0Var) {
        return R(a0Var, new d());
    }

    public Task<Void> p() {
        if (this.f8894l == null) {
            this.f8894l = new w0(this.f8883a, this);
        }
        return this.f8894l.a(this.f8893k, Boolean.FALSE).continueWithTask(new com.google.firebase.auth.c(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<ba.i> p0(a0 a0Var, String str) {
        w8.m.e(str);
        w8.m.k(a0Var);
        return this.f8887e.zzb(this.f8883a, a0Var, str, new d());
    }

    public void q(a aVar) {
        this.f8886d.remove(aVar);
    }

    public void r(b bVar) {
        this.f8884b.remove(bVar);
    }

    public Task<Void> s(String str) {
        w8.m.e(str);
        return t(str, null);
    }

    public Task<Void> t(String str, ba.e eVar) {
        w8.m.e(str);
        if (eVar == null) {
            eVar = ba.e.H();
        }
        String str2 = this.f8891i;
        if (str2 != null) {
            eVar.G(str2);
        }
        eVar.F(1);
        return new o(this, str, eVar).c(this, this.f8893k, this.f8895m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<ba.i> t0(a0 a0Var, ba.h hVar) {
        w8.m.k(a0Var);
        w8.m.k(hVar);
        ba.h hVarZ = hVar.z();
        if (!(hVarZ instanceof ba.j)) {
            return hVarZ instanceof o0 ? this.f8887e.zzb(this.f8883a, a0Var, (o0) hVarZ, this.f8893k, (g1) new d()) : this.f8887e.zzc(this.f8883a, a0Var, hVarZ, a0Var.C(), new d());
        }
        ba.j jVar = (ba.j) hVarZ;
        return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD.equals(jVar.x()) ? Y(jVar.zzc(), w8.m.e(jVar.zzd()), a0Var.C(), a0Var, true) : r0(w8.m.e(jVar.zze())) ? Tasks.forException(zzadg.zza(new Status(17072))) : L(jVar, a0Var, true);
    }

    public Task<Void> u(String str, ba.e eVar) {
        w8.m.e(str);
        w8.m.k(eVar);
        if (!eVar.u()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f8891i;
        if (str2 != null) {
            eVar.G(str2);
        }
        return new n(this, str, eVar).c(this, this.f8893k, this.f8895m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> u0(a0 a0Var, String str) {
        w8.m.k(a0Var);
        w8.m.e(str);
        return this.f8887e.zzc(this.f8883a, a0Var, str, new d());
    }

    public void v(String str) {
        String str2;
        w8.m.e(str);
        if (str.startsWith("chrome-extension://")) {
            this.B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.B = (String) w8.m.k(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.B = str;
        }
    }

    public final ma.b<aa.a> v0() {
        return this.f8904v;
    }

    public void w(String str) {
        w8.m.e(str);
        synchronized (this.f8890h) {
            this.f8891i = str;
        }
    }

    public void x(String str) {
        w8.m.e(str);
        synchronized (this.f8892j) {
            this.f8893k = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ca.g1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task<Void> x0(a0 a0Var, String str) {
        w8.m.k(a0Var);
        w8.m.e(str);
        return this.f8887e.zzd(this.f8883a, a0Var, str, new d());
    }

    public Task<ba.i> y() {
        a0 a0Var = this.f8888f;
        if (a0Var == null || !a0Var.D()) {
            return this.f8887e.zza(this.f8883a, new c(), this.f8893k);
        }
        ca.g gVar = (ca.g) this.f8888f;
        gVar.e0(false);
        return Tasks.forResult(new c2(gVar));
    }

    public final ma.b<la.i> y0() {
        return this.f8905w;
    }

    public Task<ba.i> z(ba.h hVar) {
        w8.m.k(hVar);
        ba.h hVarZ = hVar.z();
        if (hVarZ instanceof ba.j) {
            ba.j jVar = (ba.j) hVarZ;
            return !jVar.D() ? Y(jVar.zzc(), (String) w8.m.k(jVar.zzd()), this.f8893k, null, false) : r0(w8.m.e(jVar.zze())) ? Tasks.forException(zzadg.zza(new Status(17072))) : L(jVar, null, false);
        }
        if (hVarZ instanceof o0) {
            return this.f8887e.zza(this.f8883a, (o0) hVarZ, this.f8893k, (o1) new c());
        }
        return this.f8887e.zza(this.f8883a, hVarZ, this.f8893k, new c());
    }
}
