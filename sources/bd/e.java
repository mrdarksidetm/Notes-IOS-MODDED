package bd;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import bd.c;
import bd.e;
import bd.n;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public class e implements jc.a, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sc.b f5717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kc.c f5718c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5719a;

        static {
            int[] iArr = new int[n.f.values().length];
            f5719a = iArr;
            try {
                iArr[n.f.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5719a[n.f.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements sc.l, n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f5720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f5721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f5722c = new c(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m f5723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.gms.auth.api.signin.b f5724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f5725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a f5726g;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final String f5727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final n.e<n.g> f5728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final n.h f5729c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final n.e<Boolean> f5730d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final n.e<String> f5731e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final Object f5732f;

            a(String str, n.e<n.g> eVar, n.h hVar, n.e<Boolean> eVar2, n.e<String> eVar3, Object obj) {
                this.f5727a = str;
                this.f5728b = eVar;
                this.f5729c = hVar;
                this.f5730d = eVar2;
                this.f5731e = eVar3;
                this.f5732f = obj;
            }
        }

        public b(Context context, m mVar) {
            this.f5720a = context;
            this.f5723d = mVar;
        }

        private void L(String str, n.e<String> eVar, Object obj) {
            P(str, eVar, obj);
        }

        private void M(String str, n.e<Boolean> eVar) {
            N(str, null, null, eVar, null, null);
        }

        private void N(String str, n.e<n.g> eVar, n.h hVar, n.e<Boolean> eVar2, n.e<String> eVar3, Object obj) {
            if (this.f5726g == null) {
                this.f5726g = new a(str, eVar, hVar, eVar2, eVar3, obj);
                return;
            }
            throw new IllegalStateException("Concurrent operations detected: " + this.f5726g.f5727a + ", " + str);
        }

        private void O(String str, n.e<n.g> eVar) {
            N(str, eVar, null, null, null, null);
        }

        private void P(String str, n.e<String> eVar, Object obj) {
            N(str, null, null, null, eVar, obj);
        }

        private void Q(String str, n.h hVar) {
            N(str, null, hVar, null, null, null);
        }

        private String R(int i10) {
            return i10 != 4 ? i10 != 7 ? i10 != 12501 ? "sign_in_failed" : "sign_in_canceled" : "network_error" : "sign_in_required";
        }

        private void S(Boolean bool) {
            n.e<Boolean> eVar = this.f5726g.f5730d;
            Objects.requireNonNull(eVar);
            eVar.success(bool);
            this.f5726g = null;
        }

        private void T(String str, String str2) {
            a aVar = this.f5726g;
            n.h hVar = aVar.f5729c;
            if (hVar != null) {
                Objects.requireNonNull(hVar);
                hVar.a(new n.a(str, str2, null));
            } else {
                n.e eVar = aVar.f5728b;
                if (eVar == null && (eVar = aVar.f5730d) == null) {
                    eVar = aVar.f5731e;
                }
                Objects.requireNonNull(eVar);
                eVar.a(new n.a(str, str2, null));
            }
            this.f5726g = null;
        }

        private void U() {
            n.h hVar = this.f5726g.f5729c;
            Objects.requireNonNull(hVar);
            hVar.b();
            this.f5726g = null;
        }

        private void V(n.g gVar) {
            n.e<n.g> eVar = this.f5726g.f5728b;
            Objects.requireNonNull(eVar);
            eVar.success(gVar);
            this.f5726g = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void X(String str) throws j8.d, IOException {
            j8.e.a(this.f5720a, str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void Y(n.h hVar, Future future) {
            try {
                future.get();
                hVar.b();
            } catch (InterruptedException e10) {
                hVar.a(new n.a("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                hVar.a(new n.a("exception", cause == null ? null : cause.getMessage(), null));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Z(Task task) {
            if (task.isSuccessful()) {
                U();
            } else {
                T("status", "Failed to disconnect.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String a0(String str) {
            return j8.e.b(this.f5720a, new Account(str, "com.google"), "oauth2:" + r9.a.e(' ').c(this.f5725f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b0(n.e eVar, Boolean bool, String str, Future future) {
            n.a aVar;
            try {
                eVar.success((String) future.get());
            } catch (InterruptedException e10) {
                eVar.a(new n.a("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                if (!(e11.getCause() instanceof UserRecoverableAuthException)) {
                    Throwable cause = e11.getCause();
                    eVar.a(new n.a("exception", cause == null ? null : cause.getMessage(), null));
                    return;
                }
                if (bool.booleanValue() && this.f5726g == null) {
                    Activity activityW = W();
                    if (activityW != null) {
                        L("getTokens", eVar, str);
                        activityW.startActivityForResult(((UserRecoverableAuthException) e11.getCause()).a(), 53294);
                        return;
                    } else {
                        aVar = new n.a("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + e11.getLocalizedMessage(), null);
                    }
                } else {
                    aVar = new n.a("user_recoverable_auth", e11.getLocalizedMessage(), null);
                }
                eVar.a(aVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c0(Task task) {
            if (task.isSuccessful()) {
                U();
            } else {
                T("status", "Failed to signout.");
            }
        }

        private void d0(GoogleSignInAccount googleSignInAccount) {
            n.g.a aVarB = new n.g.a().c(googleSignInAccount.t()).d(googleSignInAccount.A()).e(googleSignInAccount.B()).g(googleSignInAccount.D()).b(googleSignInAccount.k());
            if (googleSignInAccount.b() != null) {
                aVarB.f(googleSignInAccount.b().toString());
            }
            V(aVarB.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(Task<GoogleSignInAccount> task) {
            String string;
            String strR;
            try {
                d0(task.getResult(com.google.android.gms.common.api.b.class));
            } catch (com.google.android.gms.common.api.b e10) {
                strR = R(e10.getStatusCode());
                string = e10.toString();
                T(strR, string);
            } catch (RuntimeExecutionException e11) {
                string = e11.toString();
                strR = "exception";
                T(strR, string);
            }
        }

        @Override // bd.n.b
        public void A(n.e<n.g> eVar) {
            if (W() == null) {
                throw new IllegalStateException("signIn needs a foreground activity");
            }
            O("signIn", eVar);
            W().startActivityForResult(this.f5724e.c(), 53293);
        }

        public Activity W() {
            return this.f5721b;
        }

        @Override // bd.n.b
        public void c(n.h hVar) {
            Q("disconnect", hVar);
            this.f5724e.d().addOnCompleteListener(new OnCompleteListener() { // from class: bd.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f5734a.Z(task);
                }
            });
        }

        @Override // bd.n.b
        public void d(List<String> list, n.e<Boolean> eVar) {
            M("requestScopes", eVar);
            GoogleSignInAccount googleSignInAccountB = this.f5723d.b(this.f5720a);
            if (googleSignInAccountB == null) {
                T("sign_in_required", "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(it.next());
                if (!this.f5723d.c(googleSignInAccountB, scope)) {
                    arrayList.add(scope);
                }
            }
            if (arrayList.isEmpty()) {
                S(Boolean.TRUE);
            } else {
                this.f5723d.d(W(), 53295, googleSignInAccountB, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        @Override // bd.n.b
        public void e(n.h hVar) {
            Q("signOut", hVar);
            this.f5724e.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: bd.f
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f5733a.c0(task);
                }
            });
        }

        public void f0(Activity activity) {
            this.f5721b = activity;
        }

        @Override // bd.n.b
        public void h(n.e<n.g> eVar) {
            O("signInSilently", eVar);
            Task<GoogleSignInAccount> taskE = this.f5724e.e();
            if (taskE.isComplete()) {
                e0(taskE);
            } else {
                taskE.addOnCompleteListener(new OnCompleteListener() { // from class: bd.l
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        this.f5744a.e0(task);
                    }
                });
            }
        }

        @Override // bd.n.b
        public void l(n.c cVar) {
            GoogleSignInOptions.a aVar;
            int identifier;
            try {
                int i10 = a.f5719a[cVar.g().ordinal()];
                if (i10 == 1) {
                    aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f8335m);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Unknown signInOption");
                    }
                    aVar = new GoogleSignInOptions.a(GoogleSignInOptions.f8334l).b();
                }
                String strF = cVar.f();
                if (!r9.e.b(cVar.b()) && r9.e.b(strF)) {
                    Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                    strF = cVar.b();
                }
                if (r9.e.b(strF) && (identifier = this.f5720a.getResources().getIdentifier("default_web_client_id", "string", this.f5720a.getPackageName())) != 0) {
                    strF = this.f5720a.getString(identifier);
                }
                if (!r9.e.b(strF)) {
                    aVar.d(strF);
                    aVar.g(strF, cVar.c().booleanValue());
                }
                List<String> listE = cVar.e();
                this.f5725f = listE;
                Iterator<String> it = listE.iterator();
                while (it.hasNext()) {
                    aVar.f(new Scope(it.next()), new Scope[0]);
                }
                if (!r9.e.b(cVar.d())) {
                    aVar.i(cVar.d());
                }
                this.f5724e = this.f5723d.a(this.f5720a, aVar.a());
            } catch (Exception e10) {
                throw new n.a("exception", e10.getMessage(), null);
            }
        }

        @Override // bd.n.b
        public void o(final String str, final n.h hVar) {
            this.f5722c.f(new Callable() { // from class: bd.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f5735a.X(str);
                }
            }, new c.a() { // from class: bd.i
                @Override // bd.c.a
                public final void a(Future future) {
                    e.b.Y(hVar, future);
                }
            });
        }

        @Override // sc.l
        public boolean onActivityResult(int i10, int i11, Intent intent) {
            a aVar = this.f5726g;
            if (aVar == null) {
                return false;
            }
            switch (i10) {
                case 53293:
                    if (intent == null) {
                        T("sign_in_failed", "Signin failed");
                    } else {
                        e0(com.google.android.gms.auth.api.signin.a.c(intent));
                    }
                    break;
                case 53294:
                    if (i11 != -1) {
                        T("failed_to_recover_auth", "Failed attempt to recover authentication");
                    } else {
                        n.e<String> eVar = aVar.f5731e;
                        Objects.requireNonNull(eVar);
                        Object obj = this.f5726g.f5732f;
                        Objects.requireNonNull(obj);
                        this.f5726g = null;
                        v((String) obj, Boolean.FALSE, eVar);
                    }
                    break;
                case 53295:
                    S(Boolean.valueOf(i11 == -1));
                    break;
            }
            return false;
        }

        @Override // bd.n.b
        public Boolean p() {
            return Boolean.valueOf(com.google.android.gms.auth.api.signin.a.b(this.f5720a) != null);
        }

        @Override // bd.n.b
        public void v(final String str, final Boolean bool, final n.e<String> eVar) {
            this.f5722c.f(new Callable() { // from class: bd.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f5738a.a0(str);
                }
            }, new c.a() { // from class: bd.k
                @Override // bd.c.a
                public final void a(Future future) {
                    this.f5740a.b0(eVar, bool, str, future);
                }
            });
        }
    }

    private void a(kc.c cVar) {
        this.f5718c = cVar;
        cVar.b(this.f5716a);
        this.f5716a.f0(cVar.getActivity());
    }

    private void b() {
        this.f5716a = null;
        sc.b bVar = this.f5717b;
        if (bVar != null) {
            n.b.f(bVar, null);
            this.f5717b = null;
        }
    }

    private void c() {
        this.f5718c.d(this.f5716a);
        this.f5716a.f0(null);
        this.f5718c = null;
    }

    public void d(sc.b bVar, Context context, m mVar) {
        this.f5717b = bVar;
        b bVar2 = new b(context, mVar);
        this.f5716a = bVar2;
        n.b.f(bVar, bVar2);
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        a(cVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        d(bVar.b(), bVar.a(), new m());
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        c();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        c();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        a(cVar);
    }
}
