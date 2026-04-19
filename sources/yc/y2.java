package yc;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a;
import com.google.firebase.auth.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import sc.c;
import yc.a1;

/* JADX INFO: loaded from: classes2.dex */
public class y2 implements c.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap<Integer, b.a> f23953k = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<Activity> f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FirebaseAuth f23955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f23956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ba.r0 f23957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f23958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f23959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ba.l0 f23960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f23961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Integer f23962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c.b f23963j;

    class a extends b.AbstractC0181b {
        a() {
        }

        @Override // com.google.firebase.auth.b.AbstractC0181b
        public void onCodeAutoRetrievalTimeOut(String str) {
            HashMap map = new HashMap();
            map.put("verificationId", str);
            map.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (y2.this.f23963j != null) {
                y2.this.f23963j.success(map);
            }
        }

        @Override // com.google.firebase.auth.b.AbstractC0181b
        public void onCodeSent(String str, b.a aVar) {
            int iHashCode = aVar.hashCode();
            y2.f23953k.put(Integer.valueOf(iHashCode), aVar);
            HashMap map = new HashMap();
            map.put("verificationId", str);
            map.put("forceResendingToken", Integer.valueOf(iHashCode));
            map.put("name", "Auth#phoneCodeSent");
            if (y2.this.f23963j != null) {
                y2.this.f23963j.success(map);
            }
        }

        @Override // com.google.firebase.auth.b.AbstractC0181b
        public void onVerificationCompleted(ba.o0 o0Var) {
            int iHashCode = o0Var.hashCode();
            y2.this.f23959f.a(o0Var);
            HashMap map = new HashMap();
            map.put("token", Integer.valueOf(iHashCode));
            if (o0Var.A() != null) {
                map.put("smsCode", o0Var.A());
            }
            map.put("name", "Auth#phoneVerificationCompleted");
            if (y2.this.f23963j != null) {
                y2.this.f23963j.success(map);
            }
        }

        @Override // com.google.firebase.auth.b.AbstractC0181b
        public void onVerificationFailed(x9.l lVar) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            a1.g gVarE = v.e(lVar);
            map2.put("code", gVarE.f23726a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
            map2.put("message", gVarE.getMessage());
            map2.put("details", gVarE.f23727b);
            map.put("error", map2);
            map.put("name", "Auth#phoneVerificationFailed");
            if (y2.this.f23963j != null) {
                y2.this.f23963j.success(map);
            }
        }
    }

    interface b {
        void a(ba.o0 o0Var);
    }

    public y2(Activity activity, a1.b bVar, a1.e0 e0Var, ba.l0 l0Var, ba.r0 r0Var, b bVar2) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.f23954a = atomicReference;
        atomicReference.set(activity);
        this.f23960g = l0Var;
        this.f23957d = r0Var;
        this.f23955b = u.K0(bVar);
        this.f23956c = e0Var.f();
        this.f23958e = Math.toIntExact(e0Var.g().longValue());
        if (e0Var.b() != null) {
            this.f23961h = e0Var.b();
        }
        if (e0Var.c() != null) {
            this.f23962i = Integer.valueOf(Math.toIntExact(e0Var.c().longValue()));
        }
        this.f23959f = bVar2;
    }

    @Override // sc.c.d
    public void a(Object obj, c.b bVar) {
        b.a aVar;
        this.f23963j = bVar;
        a aVar2 = new a();
        if (this.f23961h != null) {
            this.f23955b.l().c(this.f23956c, this.f23961h);
        }
        a.C0180a c0180a = new a.C0180a(this.f23955b);
        c0180a.b(this.f23954a.get());
        c0180a.c(aVar2);
        String str = this.f23956c;
        if (str != null) {
            c0180a.g(str);
        }
        ba.l0 l0Var = this.f23960g;
        if (l0Var != null) {
            c0180a.f(l0Var);
        }
        ba.r0 r0Var = this.f23957d;
        if (r0Var != null) {
            c0180a.e(r0Var);
        }
        c0180a.h(Long.valueOf(this.f23958e), TimeUnit.MILLISECONDS);
        Integer num = this.f23962i;
        if (num != null && (aVar = f23953k.get(num)) != null) {
            c0180a.d(aVar);
        }
        com.google.firebase.auth.b.b(c0180a.a());
    }

    @Override // sc.c.d
    public void b(Object obj) {
        this.f23963j = null;
        this.f23954a.set(null);
    }
}
