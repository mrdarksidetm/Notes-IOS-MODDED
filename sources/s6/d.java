package s6;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u6.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20029n = f1.a("58320A7AA52256");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f20030o = f1.b(f1.c("562A0B7AA62A4B0F94114F59387E0F3BF00C047C4523064D7D865A564DA4D850600D214C8614"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Set<String> f20031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f20032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<String> f20035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20036m;

    public d(h3 h3Var, Context context) {
        super(h3Var);
        this.f20031h = new HashSet();
        this.f20034k = 0L;
        this.f20035l = new ArrayList();
        this.f20036m = true;
        this.f20032i = context;
        this.f20033j = h3Var.e();
    }

    @Override // s6.j1
    public void a(Context context) {
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }
}
