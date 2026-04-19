package yc;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.c;

/* JADX INFO: loaded from: classes2.dex */
public class x2 implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f23948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FirebaseAuth.b f23949b;

    public x2(FirebaseAuth firebaseAuth) {
        this.f23948a = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, Map map, c.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        ba.a0 a0VarJ = firebaseAuth.j();
        map.put("user", a0VarJ == null ? null : z2.c(z2.j(a0VarJ)));
        bVar.success(map);
    }

    @Override // sc.c.d
    public void a(Object obj, final c.b bVar) {
        final HashMap map = new HashMap();
        map.put("appName", this.f23948a.i().p());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.b bVar2 = new FirebaseAuth.b() { // from class: yc.w2
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                x2.d(atomicBoolean, map, bVar, firebaseAuth);
            }
        };
        this.f23949b = bVar2;
        this.f23948a.b(bVar2);
    }

    @Override // sc.c.d
    public void b(Object obj) {
        FirebaseAuth.b bVar = this.f23949b;
        if (bVar != null) {
            this.f23948a.r(bVar);
            this.f23949b = null;
        }
    }
}
