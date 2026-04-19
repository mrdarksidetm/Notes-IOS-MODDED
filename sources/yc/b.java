package yc;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.c;

/* JADX INFO: loaded from: classes2.dex */
public class b implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f23833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FirebaseAuth.a f23834b;

    public b(FirebaseAuth firebaseAuth) {
        this.f23833a = firebaseAuth;
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
        map.put("appName", this.f23833a.i().p());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: yc.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                b.d(atomicBoolean, map, bVar, firebaseAuth);
            }
        };
        this.f23834b = aVar;
        this.f23833a.a(aVar);
    }

    @Override // sc.c.d
    public void b(Object obj) {
        FirebaseAuth.a aVar = this.f23834b;
        if (aVar != null) {
            this.f23833a.q(aVar);
            this.f23834b = null;
        }
    }
}
